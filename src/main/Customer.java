package main;
	
	public class Customer {
		
		String Customer_code;
		String customer_name;
		String customer_address_1;
		String customer_address_2;
		String customer_pin_code;
		String email_address;
		String contact_number;
		String primary_contact_person;
		String record_status;
		String actice_inactive_flag;
		String created_date;
		String created_by;
		String modified_date;
		String modified_by;
		String authorize_date;
		String authorize_by;

		public Customer() {

		}

		public Customer( String customer_code, String customer_name,
				String customer_address_1, String customer_address_2,
				String customer_pin_code, String email_address,
				String contact_number, String primary_contact_person,
				String record_status, String actice_inactive_flag,
				String created_date, String created_by, String modified_date,
				String modified_by, String authorize_date, String authorize_by) {

			
			this.Customer_code = customer_code;
			this.customer_name = customer_name;
			this.customer_address_1 = customer_address_1;
			this.customer_address_2 = customer_address_2;
			this.customer_pin_code = customer_pin_code;
			this.email_address = email_address;
			this.contact_number = contact_number;
			this.primary_contact_person = primary_contact_person;
			this.record_status = record_status;
			this.actice_inactive_flag = actice_inactive_flag;
			this.created_date = created_date;
			this.created_by = created_by;
			this.modified_date = modified_date;
			this.modified_by = modified_by;
			this.authorize_date = authorize_date;
			this.authorize_by = authorize_by;
		}

		

		
		

		public String getCustomer_code() {
			return Customer_code;
		}

		public void setCustomer_code(String customer_code) {
			Customer_code = customer_code;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		@Override
		public String toString() {
			return "Customer [Customer_code=" + Customer_code + ", customer_name="
					+ customer_name + ", customer_address_1=" + customer_address_1
					+ ", customer_address_2=" + customer_address_2
					+ ", customer_pin_code=" + customer_pin_code
					+ ", email_address=" + email_address + ", contact_number="
					+ contact_number + ", primary_contact_person="
					+ primary_contact_person + ", record_status=" + record_status
					+ ", actice_inactive_flag=" + actice_inactive_flag
					+ ", created_date=" + created_date + ", created_by="
					+ created_by + ", modified_date=" + modified_date
					+ ", modified_by=" + modified_by + ", authorize_date="
					+ authorize_date + ", authorize_by=" + authorize_by
					+ ", getCustomer_code()=" + getCustomer_code()
					+ ", getCustomer_name()=" + getCustomer_name()
					+ ", getCustomer_address_1()=" + getCustomer_address_1()
					+ ", getCustomer_address_2()=" + getCustomer_address_2()
					+ ", getCustomer_pin_code()=" + getCustomer_pin_code()
					+ ", getEmail_address()=" + getEmail_address()
					+ ", getContact_number()=" + getContact_number()
					+ ", getPrimary_contact_person()="
					+ getPrimary_contact_person() + ", getRecord_status()="
					+ getRecord_status() + ", getActice_inactive_flag()="
					+ getActice_inactive_flag() + ", getCreated_date()="
					+ getCreated_date() + ", getCreated_by()=" + getCreated_by()
					+ ", getModified_date()=" + getModified_date()
					+ ", getModified_by()=" + getModified_by()
					+ ", getAuthorize_date()=" + getAuthorize_date()
					+ ", getAuthorize_by()=" + getAuthorize_by() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getCustomer_address_1() {
			return customer_address_1;
		}

		public void setCustomer_address_1(String customer_address_1) {
			this.customer_address_1 = customer_address_1;
		}

		public String getCustomer_address_2() {
			return customer_address_2;
		}

		public void setCustomer_address_2(String customer_address_2) {
			this.customer_address_2 = customer_address_2;
		}

		public String getCustomer_pin_code() {
			return customer_pin_code;
		}

		public void setCustomer_pin_code(String customer_pin_code) {
			this.customer_pin_code = customer_pin_code;
		}

		public String getEmail_address() {
			return email_address;
		}

		public void setEmail_address(String email_address) {
			this.email_address = email_address;
		}

		public String getContact_number() {
			return contact_number;
		}

		public void setContact_number(String contact_number) {
			this.contact_number = contact_number;
		}

		public String getPrimary_contact_person() {
			return primary_contact_person;
		}

		public void setPrimary_contact_person(String primary_contact_person) {
			this.primary_contact_person = primary_contact_person;
		}

		public String getRecord_status() {
			return record_status;
		}

		public void setRecord_status(String record_status) {
			this.record_status = record_status;
		}

		public String getActice_inactive_flag() {
			return actice_inactive_flag;
		}

		public void setActice_inactive_flag(String actice_inactive_flag) {
			this.actice_inactive_flag = actice_inactive_flag;
		}

		public String getCreated_date() {
			return created_date;
		}

		public void setCreated_date(String created_date) {
			this.created_date = created_date;
		}

		public String getCreated_by() {
			return created_by;
		}

		public void setCreated_by(String created_by) {
			this.created_by = created_by;
		}

		public String getModified_date() {
			return modified_date;
		}

		public void setModified_date(String modified_date) {
			this.modified_date = modified_date;
		}

		public String getModified_by() {
			return modified_by;
		}

		public void setModified_by(String modified_by) {
			this.modified_by = modified_by;
		}

		public String getAuthorize_date() {
			return authorize_date;
		}

		public void setAuthorize_date(String authorize_date) {
			this.authorize_date = authorize_date;
		}

		public String getAuthorize_by() {
			return authorize_by;
		}

		public void setAuthorize_by(String authorize_by) {
			this.authorize_by = authorize_by;
		}

	}

	
	

