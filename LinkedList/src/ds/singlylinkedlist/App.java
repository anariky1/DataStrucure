package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(1000000);
		
		myList.displayList();
		

	}

}
