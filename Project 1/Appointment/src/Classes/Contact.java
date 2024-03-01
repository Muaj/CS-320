package Classes;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact (String contactId, String firstName, String lastName, String phone, String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phone == null || phone.length() > 10) {
			throw new IllegalArgumentException("Invalid Phone");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
	}

	
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
		
	}

	
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public void setFirstName(String value) {
		this.firstName = value;
		
	}


	public void setLastName(String value) {
		this.lastName = value;
		
	}


	public void setPhone(String value) {
		this.phone = value;
		
	}


	public void setAddress(String value) {
		this.address = value;
		
	}





	
}
