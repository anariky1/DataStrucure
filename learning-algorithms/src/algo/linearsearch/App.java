package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[]a = {1,5,3,4,5};
		int y=linearSearch(a,4);
		System.out.println(y);
				

	}
	
	public static int linearSearch(int[]a, int x){
		for(int i=0; i<=a.length-1;i++){
			if(a[i]==x){
				return i;
			}
		}
		return -1;
		
	}

}
