package ds.stack;

public class practise_reverseStack {
	
	public int max_size;
	public char[] new_stack;
	public int top;
	
	public practise_reverseStack(int size){
	 this.max_size=size;
	 new_stack=new char[max_size];
	 top=-1;
	}
	
	public void push(char j){
	  if(isFull()){
		 System.out.println(" the stack is full...");
	  }else{
		top++;
		new_stack[top]=j;
	  }
	}
	
	public char pop(){
	  if(isEmpty()){
		  System.out.println(" the stack is empty...");
		  return '0';
	  }else{
		int old_top=top;
		top--;
		return new_stack[old_top];
	  }
	}
	
	public char getValue(){
		return new_stack[top];		
	}
	
	public boolean isFull(){
	  return max_size==top;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	
	

}
