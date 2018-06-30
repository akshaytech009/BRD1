package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import validation.Validation;
import database.DbOperation;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		String filelocation;
		String slas = "/";
		//C:/Users/temp/Desktop/BRD-File Upload/Test Cases
		String file_name;
		String completepath;
		String rejection;

		DbOperation d = new DbOperation();
		
		ArrayList<Customer> cvalid = new ArrayList<Customer>();
		ArrayList<Customer> cinvalid = new ArrayList<Customer>();

		Validation v = new Validation();
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] str1 = null;
		String[] str2 = null;

		System.out.println("Enter the File Location : ");
		filelocation = scan.nextLine();

		System.out.println("Enter the file name");
		file_name = scan.next();

		completepath = filelocation.concat(slas).concat(file_name);
		
		try {

			FileReader fr = new FileReader(completepath);

			BufferedReader br = new BufferedReader(fr);
			System.out.println("File Uploaded");
			while ((str = br.readLine()) != null) {

				str1 = str.split("\n");

				for (int i = 0; i < str1.length; i++) {
					str2 = str.split("~", -1);

					//System.out.println("Split");
					
					if (v.isValidCustomer_code(str2[0])
							&& v.isValidName(str2[1])
							&& v.isValidPincode(str2[4])
							&& v.isvalidEmail(str2[5])
							&& v.isValidRecordStatus(str2[8])
							&& v.isValidActiveinActiveflag(str2[9])) {


						System.out.println("Valid");
						cvalid.add(new Customer(str2[0], str2[1], str2[2],
								str2[3], str2[4], str2[5], str2[6], str2[7],
								str2[8], str2[9], str2[10], str2[11], str2[12],
								str2[13], str2[14], str2[15]));
					} else {
						
						cinvalid.add(new Customer(str2[0], str2[1], str2[2],
								str2[3], str2[4], str2[5], str2[6], str2[7],
								str2[8], str2[9], str2[10], str2[11], str2[12],
								str2[13], str2[14], str2[15]));
						System.out.println("InValid");
					}

				}

			}
			
			
			if (cinvalid.isEmpty())

				for (Customer c1 : cvalid) {

					d.insert(c1.getCustomer_code(), c1.getCustomer_name(),
							c1.getCustomer_address_1(),
							c1.getCustomer_address_2(),
							c1.getCustomer_pin_code(), c1.getEmail_address(),
							c1.getContact_number(),
							c1.getPrimary_contact_person(),
							c1.getRecord_status(),
							c1.getActice_inactive_flag(), c1.getCreated_date(),
							c1.getCreated_by(), c1.getModified_date(),
							c1.getModified_by(), c1.getAuthorize_date(),
							c1.getAuthorize_by());
				}
			FileOutputStream fout = new FileOutputStream("errotlog.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			Iterator itr = cinvalid.iterator();
			while (itr.hasNext()) {
				oos.writeObject(itr.next().toString());
			}

		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}
}
