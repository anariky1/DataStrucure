package ds.queue;

public class App {

	public static void main(String[] args) {
	queue myQueue = new queue(5);
	myQueue.insert(100);
	myQueue.insert(200);
	myQueue.insert(300);
	myQueue.insert(400);
	myQueue.insert(500);
	myQueue.insert(600);
	myQueue.view();
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	System.out.println(myQueue.remove());
	}

}
