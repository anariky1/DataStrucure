package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList theList= new DoublyLinkedList();
		theList.insertFirst(22);
		theList.insertFirst(33);
		System.out.println(theList.deleteKey(22));

		theList.displayForward();
		
	}

}
