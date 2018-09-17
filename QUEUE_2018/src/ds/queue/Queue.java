package ds.queue;

public class Queue {
	
	private int maxSize; //size of the stack
	private long[] queArray; //container storing list of items
	private int front; //index position for the element in the front;
	private int rear; //index position for the element at the back of the line;
	private int nItems;  //counter to maintain no of items in our queue.
	
	
	public Queue(int maxSize){
		this.maxSize=maxSize;
		this.queArray=new long[maxSize];
		front=0; //index position of the first slot of the array
		rear=-1; //there is no item in the array yet to be considered as the last item
		nItems=0; //we dont have elements in the array yet		
	}
	
	public void insert(long j){
	 if(rear==maxSize-1){
			rear=-1;
	 }
		rear++;
		queArray[rear]=j;
		nItems++;
	}
	
	public long remove(){  //remove item from the front of the queue
		try{
		//System.out.println(nItems);
		long temp=queArray[front];
		front++;
		if((temp==0)||(nItems==0)){
			System.out.println("No more item left to be removed");
			return -1;
		}
		if(front==maxSize){
			front=0;				
		}
		nItems--;
		return temp;
		}catch(Exception e){
			System.out.println("All items have been removed");
			return -1;
		}
				
	}
	
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
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
