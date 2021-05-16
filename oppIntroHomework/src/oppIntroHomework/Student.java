package oppIntroHomework;

public class Student {
	
	int Id;
	String name;
	int age;
	String surName;


	public Student(int Id,String name,int age,String surName) {
		
		this();
		this.Id=Id;
		this.name = name;
		this.age = age;
		this.surName = surName;
		
		
		
	};
	
	public Student() {
		System.out.println("Öðrenci eklendi.");
	};
}
