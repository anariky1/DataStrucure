package NoOfEvenNumbers;



public class noOfEvens {

	public static void main(String[] args) {
     int[] arr=new int[5];
     arr[0]=2;
     arr[1]=3;
     arr[2]=4;
     arr[3]=6;
     arr[4]=7;    
     int a=countEvens(arr);
     System.out.println(a);

	}
	
	public static int countEvens(int Ele[]){
		int count=0;
		for(int i=0;i<=Ele.length-1;i++){
			if(Ele[i]%2==0){
				count++;
			}
		}
		
		return count;
		
	}

}
