package ds.stack;

public class Stack {
	
	private int maxSize;    // - size of stack
	private long[] stackArray ;   //container storing list of items
	private int top;      //represent the index position of last item
	
	public Stack(int size){
		this.maxSize=size;
		this.stackArray=new long[maxSize];
		this.top=-1; //since array start at 0 index , there is not item now ,so i will put 
		             //as -1
		
		//when u insert something the top index will be 1+ from where the index index is
		//and when you remove , the top index will be 1- from where the index is
	}
	
	public void push(long j){
		//j is the item that is to b placed in the stack
		if(isFull()){
		  System.out.println("This stack is already full");
		}else{
	      top++;
		  stackArray[top]=j;
		}
		
	}
	
	public long pop(){
	  if(isEmpty()){
		  System.out.println("The stack is empty..");
		  return -1;
	  }else{
		int old_top=top;
		top--;
		return stackArray[old_top];
	  }	 
	}
	
	public long peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return(maxSize-1==top);
	}
	
	
	
	
	
	
	

}
