package inheritanceHomework;

public class UserManager  {
	
	public void addUser(User user) {
		System.out.println("Kullanýcý eklendi."+ user.Id);
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			
				add(user);
			
		}
		
			
	}

} 
