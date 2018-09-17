package adt;

public class Counter {
	public String name;
	public int Counter=0;
	
	public Counter(String name){
		this.name=name;		
	}
	
	public void increment(){
		Counter++;
	}
	
	public int getCurrentValue(){
		return Counter;
	}
	
	public String toString(){
		return name+"=="+Counter;
	}
	
    private void doSomething(){   //this function you wont see in the App class as it is private
		
	}
	

}
