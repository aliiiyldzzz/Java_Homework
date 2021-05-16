package inheritanceHomework;

public class User {
	
	int Id;
	String name;
	String lastName;
	String emailAdresses;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAdresses() {
		return emailAdresses;
	}

	public void setEmailAdresses(String emailAdresses) {
		this.emailAdresses = emailAdresses;
	}

	public User(int id, String name, String lastName, String emailAdresses) {
		super();
		Id = id;
		this.name = name;
		this.lastName = lastName;
		this.emailAdresses = emailAdresses;
	}
	
	public User () {
		
	}
	
}
