package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DbOperation {

	PreparedStatement ps = null;

	public static String changeDate(String date) {
		String d = date;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MMM/yy");
			fmt.setLenient(false);
			String D = fmt.parse(d).toString();
			return D;

		} catch (Exception e) {
			return null;
		}

	}

	public void insert(String customer_code, String customer_name,
			String customer_address_1, String customer_address_2,
			String customer_pin_code, String email_address,
			String contact_number, String primary_contact_person,
			String record_status, String actice_inactive_flag,
			String created_date, String created_by, String modified_date,
			String modified_by, String authorize_date, String authorize_by) {
		try {
			PreparedStatement ps = GetConnection
					.getConnection()
					.prepareStatement(
							"insert into RJCustomer values(S_RJCustomer.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");

			ps.setString(1, customer_code);
			ps.setString(2, customer_name);
			ps.setString(3, customer_address_1);
			ps.setString(4, customer_address_2);
			ps.setString(5, customer_pin_code);
			ps.setString(6, email_address);
			ps.setString(7, contact_number);
			ps.setString(8, primary_contact_person);
			ps.setString(9, record_status);
			ps.setString(10, actice_inactive_flag);
			ps.setString(11, created_date);
			ps.setString(12, created_by);
			ps.setString(13, modified_date);
			ps.setString(14, modified_by);
			ps.setString(15, authorize_date);
			ps.setString(16, authorize_by);
			ps.executeUpdate();
			
			/*if (ps.executeUpdate() > 0) {
				System.out.println("data is inserted..");
			} else {
				System.out.println("data is not inserted....");
			}*/
		} catch (SQLException e) {
			System.out.println(e.getMessage() + customer_code + customer_name);
			// e.printStackTrace();
		}

		finally {
/*			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
*/
		}

	}
}
