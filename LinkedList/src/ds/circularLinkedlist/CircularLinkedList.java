package ds.circularLinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList(){
		first=null;
		last=null;
	}
	
	public void insertFirst(int data){		
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			last=newNode;
		}
		
		newNode.next=first;
		first=newNode;		//both first and last are pointing to newnode
	}

	private boolean isEmpty() {
		return first==null;
	}
	
	public void insertLast(int data){		
		Node newNode = new Node();
		newNode.data=data;
		
		if(isEmpty()){
			newNode=first;
		}else{
			last.next=newNode; //the next value of the last node will point to new node
			last=newNode; //we make the new node to point to last
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
		last=last.next;
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
