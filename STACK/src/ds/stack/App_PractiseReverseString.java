package ds.stack;

public class App_PractiseReverseString {

	public static void main(String[] args) {
		String s=reverseString("INDIA");
		System.out.println(s);
		
	}
	
	public static String reverseString(String str){
		int size = str.length();
		practise_reverseStack st = new practise_reverseStack(size);
		for(int i=0;i<=size-1;i++){
			char c=str.charAt(i);
			st.push(c);			
		}
		String result="";
		while(!st.isEmpty()){
			char c=st.pop();
			result=result+c;
		}
		return result;
		
		
	}

}
