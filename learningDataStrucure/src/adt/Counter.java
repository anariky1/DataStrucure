package adt;

public class Counter {
	private String name;
	private int count=0;
	
	public Counter(String str){
		this.name=str;
	}
	
	public void increment(){
		count++;
	}
	
	public Integer getCurrentValue(){
		return count;
	}
	public String toString(){
		return name+"=="+count;
	}
	
	private void doSomething(){
		
	}
	
	

}
