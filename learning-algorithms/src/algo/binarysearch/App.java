package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,7,8,9,10};
		//int lin_position=binarySearch(a,1);
		//System.out.println(lin_position);
		int bin_position=recursiveBinarySearch(a,0,9,99);
		System.out.println(bin_position);

	}
	
	public static int binarySearch(int[]a, int x){
		int p=0;
		int r=a.length-1;
		int q;
		
		while(p<=r){
			q=(p+r)/2;
			if(a[q]==x){
				return q;
			}
			if(a[q]>x){
				r=q-1;
			}else{
				p=q+1;
			}
		}
		return -1;
		
	}
	
	
	public static int recursiveBinarySearch(int[]a,int p,int r ,int x){
		System.out.println("["+p+"...."+r+"...."+"]");
		if(p<=r){
			int q=(p+r)/2;
			if(a[q]==x){
				return q;
			}
			
			if(a[q]>x){
				return recursiveBinarySearch(a,p,q-1 ,x);
			}else{
				return recursiveBinarySearch(a,q+1,r ,x);
			}
			
		}
		return -1;
			
			
		
	}

}
