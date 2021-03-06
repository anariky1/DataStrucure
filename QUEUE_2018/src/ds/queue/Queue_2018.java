package ds.queue;

public class Queue_2018 {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue_2018(int maxSize){
		this.maxSize=maxSize;
		this.queArray=new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;					
	}
	
	public void Insert(long j){
		if(rear==maxSize-1){
			rear=-1;			
		}
		rear++;
		queArray[rear]=j;
		nItems++;
				
	}
	
	public long remove(){
		long temp=queArray[front];
		if((temp==0)||(nItems==0)){
			System.out.println("all items have been removed");
			return -1;
		}
		
		front++;
		if(front==maxSize){
			front=0;
		}
		nItems--;
		return temp;
		
	}
	
	
	public long peekFront(){
		return queArray[front];		
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
		
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public void view(){
		System.out.print("[");
		for(int i=0;i<=queArray.length-1;i++){
		 if(queArray[i]!=0){
			System.out.print(queArray[i]+" ");
		 }
		}
		System.out.print("]");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
