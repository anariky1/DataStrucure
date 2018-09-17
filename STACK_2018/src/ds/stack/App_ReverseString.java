package ds.stack;

public class App_ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("hello"));
		

	}
	
	public static String reverseString(String s){
	int stackSize=s.length();
	Stack_ReverseString theStack=new Stack_ReverseString(stackSize);
	
	for(int i=0;i<=stackSize-1;i++){
		char ch=s.charAt(i);
		theStack.push(ch);		
	}
	
	String result="";
	while(!theStack.isEmpty()){
		result=result+theStack.pop();
	}
	return result;
	
	
	}

}


