package ds.circularlinkedlist;



public class App {
	public static void main(String[] args) {
	CircularLinkedList myList = new CircularLinkedList();
	/*myList.insertFirst(100);
	myList.insertFirst(50);
	myList.insertFirst(99);
	myList.insertFirst(88);
	myList.insertLast(1000000);*/
	
	myList.displayList();
	System.out.println(myList.deleteFirst());
	//System.out.println(myList.deleteLast());
	}
	

}
