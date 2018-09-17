package ds.stack;

public class Stack_ReverseString {
	
	private int maxsize; //size the stack
	private char[] stackArray; //container storing list of items
	private int top;      //represent the index position of last item
	
	
	public Stack_ReverseString(int maxsize){
		this.maxsize=maxsize;
		this.stackArray=new char[maxsize];
		this.top=-1;		
	}
	
	
	public void push(char j){
	 if(isFull()){
		 System.out.println(" the stack is already full");
	 }else{
		top++;
		stackArray[top]=j;
	 }
		
	}
	
	public char pop(){
	 if(isEmpty()){
		 System.out.println("the stack is already empty");
		 return '0';
	 }else{
		int old_top=top;
		top--;
		return stackArray[old_top];
		//we are not removing , we are shifting the top index to the below one.
	 }
	}
	
	public char peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return (maxsize-1==top);
	}
	
	


}
