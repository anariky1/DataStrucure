package ds.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node first;
	private Node last;
	
	public DoublyLinkedList(){
		this.first=null;
		this.last=null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void inserFirst(int data){
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			last=newNode; // if empty last will refer to the new node being created.
		}else{
		   first.previous=newNode;
			//newNode=first.previous;
		}
		
		newNode.next=first; //the new nodes next field will point to the old first.
		first=newNode;		
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			first=newNode;
		}else{
			last.next=newNode;         //new node points to old last next
			newNode.previous=last;     //new node previous will point to olds last node
		}
	
		last=newNode;  //new node will point to last node		
	}
	
	//assume non empty list
	 public Node deleteFirst(){
		 Node temp=first;
		 if(first.next==null){
			 last=null;
		 }else{
			 first.next.previous=null;
		 }
		 first=first.next; // first(old first).next  we are assigning the reference of the node following the old
		              //first node to the first field
		 return temp; //return the deleted old first node
	 }
	 
	//assume non empty list
	 public Node deleteLast(){
		 Node temp=last;
		 if(first.next==null){
			 first=null;
		 }else{
			 last.previous.next=null;
		 }
		 last=last.previous;   //last(old last).prev
		 return temp;
		 
	 }
	 
	//assume non empty list
	 public boolean insertAfter(int key, int data){
		 Node current = first; //we start from begining of the list
		 while(current.data!=key){ //as long as we have not found the key in a particulr node
			 current=current.next;
			 if(current==null){ //if current.next=null and we have not found the node
				 return false;
			 }
		 }
		 
		 Node newNode=new Node();
		 newNode.data=data;
	    
		 if(current==last){
			 current.next=null;
			 last=newNode;
		 }else{
			 newNode.next=current.next;  //current's(99) next (55)will be  pointed by NewNodes next
			 current.next.previous=newNode;  //current(99).next(55).previous-will point to new node
			 }
		 
		 newNode.previous=current; //current will point to new node prev
		 current.next=newNode; //new node will point to current next
		 return true;		 
	 }
	 
	//assume non empty list
		 public boolean insertPrevious(int key, int data){
			 Node current = first; //we start from begining of the list
			 while(current.data!=key){ //as long as we have not found the key in a particulr node
				 current=current.next;
				 if(current==null){ //if current.next=null and we have not found the node
					 return false;
				 }
			 }
			 
			 Node newNode=new Node();
			 newNode.data=data;
		    
			 if(current==last){
				 current.next=null;
				 last=newNode;
			 }else{
				 newNode.previous=current.previous;  //current's(99) next (55)will be  pointed by NewNodes next
				 current.previous.next=newNode;  //current(99).next(55).previous-will point to new node
				 }
			 
			 newNode.next=current; //current will point to new node prev
			 current.previous.next=newNode; //new node will point to current next
			 return true;		 
		 }
	 
	 
	 
	 
	 public Node deleteKey(int key){
		 Node current =first;
		 while(current.data!=key){
			 current=current.next;
			 if(current==null){
				 return null;					 
			 }
		 }
		 if(current==first){
			 first=current.next;
		 }else{
			current.previous.next=current.next;
		 }
		 
		 if(current==last){
			 last=current.previous;
		 }else{
			current.next.previous =current.previous;
		 }
		 
		 return current;
	 }
	 
	 public void displayForward(){
		 System.out.print("List(first-->last):");
		 Node current=first;
		 while(current!=null){
			 current.displayNode();
			 current=current.next;
		 }
		 System.out.println();
	 }
	 
	 public void displayBackward(){
		 System.out.print("List(last-->first):");
		 Node current=last;
		 while(current!=null){
			 current.displayNode();
			 current=current.previous;
		 }
		 System.out.println();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
