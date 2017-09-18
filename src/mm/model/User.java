package mm.model;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber ;
	private String password ;
	private String gender;
	private String address;
	private String note;
	private boolean active;
	private userType type;
	
	public enum userType{
		ADMIN,TSOFEN,MENTOR,MENTEE;
	}
	
	

	public User(int id, String firstName, String lastName, String email, String phoneNumber, String password,
			String gender, String address, String note, boolean active, userType type) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.note = note;
		this.active = active;
		this.type = type;
	}




	public userType getType() {
		return type;
	}




	public void setType(userType type) {
		this.type = type;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	

}
