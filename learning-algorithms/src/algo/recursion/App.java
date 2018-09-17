package algo.recursion;

public class App {

	public static void main(String[] args) {
		//reducebyOne(10);
		int a[]={5,4,2,6,8,10,7};
		int y=recursiveLinearSearch(a,0,6);
		System.out.println(y);
		//2 will return 3 to 1 , 1 wil return 3 to 0 , 0 will return 3 to main function

	}
	
	public static void reducebyOne(int n){
		if(n>=0){
		 reducebyOne(n-1);
		}
		System.out.println("completed call : "+n);
	}
	
	public static int recursiveLinearSearch(int[]a,int i,int x){
		if(i>a.length-1){
			return -1;
		}else if(a[i]==x){
			return i;		
		}else{
			System.out.println("index at : "+i);
			return recursiveLinearSearch(a,i+1,x);
		}
	}

}
