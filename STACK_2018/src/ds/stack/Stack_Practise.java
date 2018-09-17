package ds.stack;

public class Stack_Practise {
    int maxSize;
    long Stack_Practise[];
    int top;
    
    public Stack_Practise(int maxSize){
    	this.maxSize=maxSize;
    	this.Stack_Practise=new long[maxSize];
    	top=-1;
    }
    
    public void push(int j){
      if(isFull()){
    	  System.out.println("The stack is full");
      }else{
    	top++;
    	Stack_Practise[top]=j;
      }
    	
    }
    
    public long pop(){
      if(isEmpty()){
    	  System.out.println("The stack is empty");
    	  return -1;
      }else{
    	int old_top=top;
    	top--;
    	return Stack_Practise[old_top];
      }
    }
    
    public long peak(){
    	return Stack_Practise[top];
    }
    
    public boolean isEmpty(){
    	return top==-1;
    }
    
    public boolean isFull(){
    	return maxSize-1==top;
    }

}
