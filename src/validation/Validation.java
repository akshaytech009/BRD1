/*Pattern p = Pattern.compile("[a-z]");
Matcher m = p.matcher(inputstring);
if (m.find())*/



package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import database.GetConnection;

public class Validation {

	public boolean isValidName(String name) {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]{1,30}");
		Matcher m = p.matcher(name);
		if (m.find())
		{
			return true;
		} else {
			System.out.println("Name voilated");
			return false;
		}

	}

	public boolean isValidCustomer_code(String Customer_code) {

		String code = Customer_code;
		int count = 0;
		Connection conn = GetConnection.getConnection();

		try {

			PreparedStatement psmt = conn
					.prepareStatement("Select Customer_Code from Customer3");

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				if (code.equals(rs.getString(2))) {
					System.out.println("Duplicate");
					count++;
					break;
				}
			}

		} catch (SQLException e) {

		}

		if (count > 0)
		{		System.out.println("Duplicate");
			return false;
	}
			else
			return true;

	}

	public boolean isValidPincode(String pincode) {

		if (pincode.matches("[0-9]{6}")) {
			return true;

		} else {
			return false;
		}
	}

	public boolean isvalidEmail(String email) {
		if (email.contains("@")) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isValidRecordStatus(String recordstatus) {
		if (recordstatus.equals("N") || recordstatus.equals("M")
				|| recordstatus.equals("D") || recordstatus.equals("A")
				|| recordstatus.equals("R")) {
			return true;

		} else {
			return true;
		}
	}

	public boolean isValidActiveinActiveflag(String activeinactiveflag) {
		if (activeinactiveflag.equals("A") || activeinactiveflag.equals("I")) {
			return true;

		} else {
			return true;
		}
	}

}
