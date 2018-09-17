
public class NewHuman2 {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	
	
	public NewHuman2(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
		
		//this keyword is a varible in java and points to current object	
	}


	public void speak(){
		System.out.println("Hello , my name is :"+name);
		System.out.println("Iam "+heightInInches+" tall");
		System.out.println("Iam "+age +" years old");
		System.out.println("My eye color is :"+eyeColor);
	}
	
	
	public void eat(){
		System.out.println("eating...");
	}
	
	public void walk(){
		System.out.println("walking..");
	}
	
	public void work(){
		System.out.println("working..");
	}

}
