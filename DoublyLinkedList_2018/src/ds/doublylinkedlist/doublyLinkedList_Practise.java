package ds.doublylinkedlist;

public class doublyLinkedList_Practise {
	
	private Node first;
	private Node last;
	
	public doublyLinkedList_Practise(){
		first=null;
		last=null;
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first==null);
	}
	
	public void insertFirst(int data){
       Node newNode= new Node();
       newNode.data=data;
       
       if(isEmpty()){
    	   last=newNode;
       }else{
    	   first.previous=newNode;
       }
       
       newNode.next=first;
       first=newNode;
       
    
    
       
      
	}
	
	
	public void insertLast(int data){
		Node newNode= new Node();
	       newNode.data=data;
	       
	       if(isEmpty()){
	    	   first=newNode;
	       }else{
	    	   newNode.previous=last;
	    	   last.next=newNode;
	       }
	       
	       last=newNode;
	    
	      
	     
	   
	}
	
	//assuming non empty
	public Node deleteFirst(){		
	  Node temp=first;
	  if(first.next==null){
		  last=null;
	  }else{
		  first.next.previous=null;
	  }
	  first=first.next;
	  return temp;
		
		
	}
	
	public Node deleteLast(){		
		Node temp=last;
		if(first.next==null){
			first=null;
		}else{
			last.previous.next=null;
		}
		last=last.previous;
		return temp;
	
	}
	
	
	public boolean insertAfter(int key,int data){
		
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
			 newNode.next=current.next;
			 current.next.previous=newNode;
		 }
		 
		 newNode.previous=current;
		 current.next=newNode;
		 return true;
		
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
