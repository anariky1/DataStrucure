package ds.circularlinkedlist;

import ds.circularlinkedlist.Node;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		first=null;
		last=null;
		
	}
	
	private boolean isEmpty() {
		return first==null;
	}
	
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			last=newNode;
		}
		
		newNode.next =first;  //old first will be new node's next
		first=newNode;  //first place
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			first=newNode;
		}else{
			last.next=newNode;    //new node will be last node's next
			last=newNode; // we set the new node to the last one in the list
		}
		
	}
	
	
	public int deleteFirst(){
		int temp=first.data;
		if(first.next==null){
			last=null;
		}
		first=first.next;
		return temp;
		
	}
	
	public int deleteLast(){
		int temp=last.data;
		last=null;
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
