
public class Earth {
	
	public static void main(String args[]){
		
		Human tom;  //this tom is an instance variable
		tom = new Human(); //actual object is created when this statement is executed.
		//location where object is created is known as object variable
		tom.age=5;
		tom.eyeColor="brown";
		tom.heightInInches=72;
		tom.name="Tom Zsabo";
		tom.speak();
		System.out.println("*************");
		
		//tom and joe are variables . the objects are created during application run
		
		Human joe = new Human();
		
		joe.age=36;
		joe.eyeColor="Green";
		joe.heightInInches=68;
		joe.name="Joe Greensilk";
		joe.speak();
		
		//we can assign values to the human object inside the contructor of a class.
		
	}

}
