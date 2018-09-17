package ds.stack;

public class Stack {
	
	private int maxsize; //size the stack
	private long[] stackArray; //container storing list of items
	private int top;      //represent the index position of last item
	
	
	public Stack(int maxsize){
		this.maxsize=maxsize;
		this.stackArray=new long[maxsize];
		this.top=-1;		
	}
	
	
	public void push(long j){
	 if(isFull()){
		 System.out.println(" the stack is already full");
	 }else{
		top++;
		stackArray[top]=j;
	 }
		
	}
	
	public long pop(){
	 if(isEmpty()){
		 System.out.println("the stack is already empty");
		 return -1;
	 }else{
		int old_top=top;
		top--;
		return stackArray[old_top];
		//we are not removing , we are shifting the top index to the below one.
	 }
	}
	
	public long peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return (maxsize-1==top);
	}
	
	

}
