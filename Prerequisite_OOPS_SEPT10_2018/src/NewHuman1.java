
public class NewHuman1 {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public NewHuman1(){
		age=5;
		eyeColor="brown";
		heightInInches=72;
		name="Tom Zsabo";
		
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
