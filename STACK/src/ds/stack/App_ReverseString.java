package ds.stack;

public class App_ReverseString {

	public static void main(String[] args) {
		String output=reverseString("INDIA");
		System.out.println(output);

	}
		
		public static String reverseString(String str){
			Stack_ReverseString theStack=new Stack_ReverseString(6);
			int max_length=str.length();
			for(int j=0;j<=str.length()-1;j++){
				char ch=str.charAt(j);
				theStack.push(ch);
			}
			String result="";
			while(!theStack.isEmpty()){
				char ch=theStack.pop();
				result=result+ch;				
			}
			return result;
	
		}
		
		

	

}
