package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.Id = 123;
		
		Student student = new Student();
		
		student.Id = 456;
		
		Instructor instructor = new Instructor();
		
		instructor.Id = 789;
		
		
		UserManager userManager = new UserManager();
		
		User[] users = {user , student , instructor};
		
		UserManager.addMultiple(users);
		UserManager.addMultiple(user);
		UserManager.addMultiple(student);
		UserManager.addMultiple(instructor);
		

	}

}
