package inheritanceHomework;

public class UserManager  {
	
	public void addUser(User user) {
		System.out.println("Kullan�c� eklendi."+ user.Id);
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			
				add(user);
			
		}
		
			
	}

} 
