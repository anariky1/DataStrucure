package ds.queue;

public class queue {
	private int maxsize; //initializes the set number of slots
	private long[] queArray;
	private int front; //index position for the element in the front of the line
	private int rear; //index position for the element in the back of the line
	private int nItems; //counter to maintain the number of items in queue
	
	public queue(int size){
		this.maxsize=size;
		this.queArray=new long[size];
		front=0; //index position of the first slot the array
		rear=-1;//there is no item in the array yet to be considered as the last item.
		nItems=0; //we dont have elements in the array yet.
	}
	
	public void insert(long j){
	 if(rear==maxsize-1){
		 System.out.println("the queue is already full : " +"cant insert additional item :"+j);
	 }else{
		rear++;
		queArray[rear]=j;
		nItems++;
	 }
	}
	
	public long remove1() {//remove from the front
		long temp=queArray[front];
		front++;
		if(front==maxsize){
			System.out.println("All the items are moved");
			front=0;//we have removed everything ,setting front to 0again
		}else{
		nItems--;
		}
		return temp;
			
	}
	
	public long remove() {//remove from the front	
		if(front==maxsize){
			System.out.println("All the items are moved");
			front=0;//we have removed everything ,setting front to 0again
			return -1;
		}else{
			long temp=queArray[front];
			front++;
			nItems--;
			return temp;			
		}
				
	}
	
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public boolean isFull(){
		return nItems==maxsize;		
	}
	
	
	
	public void view(){
		System.out.print("[");
		for(int i=0;i<=queArray.length-1;i++){
			System.out.print(queArray[i]+" ");			
		}
		System.out.print("]");
	}
	
	

}