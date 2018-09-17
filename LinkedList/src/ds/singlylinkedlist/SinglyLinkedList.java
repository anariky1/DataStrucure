package ds.singlylinkedlist;

public class SinglyLinkedList {
	
	private Node first;
	
    public SinglyLinkedList(){
    	
    }
    
    public boolean isEmpty(){
    	return (first==null);  //if first is null , we dont have any nodes connected to
    	                       //the engine
    }
    //used to insert at the begining of the list
    public void insertFirst(int data){
    	Node newNode=new Node();
    	newNode.data=data;
    	newNode.next=first;  //first is the old first.already existing first node will be 
    	                     //pointing to newnode.next
    	first=newNode;
    }
    
    //used to insert at the last of the list
    public void insertLast(int data){
    	Node current=first;
    	while(current.next!=null){
    		current=current.next;    		
    	}
    	Node newNode = new Node();
    	newNode.data=data;
    	current.next=newNode;
    	
    }
    
    public Node deleteFirst(){
    	Node temp=first;
    	first=first.next;
    	return temp;    	
    }
    
    public void displayList(){
    	System.out.println("list (first-->last");
    	Node current=first;
    	while(current!=null){
    		current.displayNode();
    		current=current.next;   		
    	}
    }
    
    
}
