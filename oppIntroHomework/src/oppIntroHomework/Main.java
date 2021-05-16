package oppIntroHomework;

public class Main {

	public static void main(String[] args) {
	
		Educator educator1 = new Educator();
		
		educator1.Id = 123;
		educator1.name = "Ali";
		educator1.surName = "YILDIZ";
		educator1.branch = "Computer Engineering";
		
		
		Educator educator2 =new Educator (569, "Engin", "Demiröð","computer Engineering");

		
		Educator educator3 = new Educator();
		
		educator3.Id = 896;
		educator3.name = "Deniz";
		educator3.surName = "OTHAN";
		educator3.branch = "Computer Engineering";
		
		
		Educator[] educators ={educator1,educator2,educator3};
		
		for (Educator educator :educators ) {
			System.out.println(educator.Id);
			
		}
		
		Student student1 = new Student(1465,"Esat",17,"YILDIZ");
		
		Student student2 = new Student();
		
		student2.Id = 55445;
		student2.name = "Derya";
		student2.age = 26;
		student2.surName = "OTHAN";
		
		Student[] students = {student1,student2};
		
		for (Student student : students) {
			System.out.println(student.age);
		}
		
		StudentManeger studentManeger = new StudentManeger();
		
		studentManeger.addToStudent(student1);;
		studentManeger.addToStudent(student2);
		
		
		Category category1 = new Category();
		
		category1.Id= 1;
		category1.name = "Kurslar";
				
		Category category2 = new Category();
		
		category2.Id = 2;
		category2.name = "Kampa Hazýrlýk";
		
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.Id);
		}
		
		CategoryManager categoryManager = new CategoryManager();
		
		categoryManager.addToCategory(category1);
		
		categoryManager.addToCategory(category2);

	}

}
