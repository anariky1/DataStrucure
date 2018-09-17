package algo.linearsearch;

public class App {

	public static void main(String[] args) {
	

	}
	
	public static int linearSearch(int[]a,int x){
		int answer=-1;
		
		for(int i=0;i<=a.length-1;i++){
			if(a[i]==x){
				 answer=i;
				 return i;
			}
		}
		return answer;
		
	}

}
