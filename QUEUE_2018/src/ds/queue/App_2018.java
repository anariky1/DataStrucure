package ds.queue;

public class App_2018 {

	public static void main(String[] args) {
		Queue_2018 myQueue = new Queue_2018(5);
		myQueue.Insert(5);
		myQueue.Insert(10);
		myQueue.Insert(15);
		myQueue.Insert(20);
		myQueue.Insert(25);

		
		myQueue.view();
		System.out.println("to be removed-------");
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		

	}
}