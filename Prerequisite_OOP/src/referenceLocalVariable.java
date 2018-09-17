
public class referenceLocalVariable {

	public static void main(String[] args) {
		
		Car Mycar;  //reference local variable
		Mycar = new Car();
		Mycar = new Car();
		
		Car MyCar2=new Car();
		MyCar2.hp=120;
		
		Car MyCar3=new Car();
		MyCar3.hp=140;
		
		Engine bigEngine=new Engine();
		MyCar3.MyEngine=bigEngine;
		
		
		

	}

}
