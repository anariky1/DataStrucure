
public class Animal {
	
	int age;
	String  gender;
	int WeightinLbs;
	
	public Animal(int age,String gender,int WeightinLbs){
		this.age=age;
		this.gender=gender;
		this.WeightinLbs=WeightinLbs;		
	}
	
	public void eat(){
		System.out.println("Eating...");
	}
	
	public void sleep(){
		System.out.println("Sleeping...");
	}
	
}
