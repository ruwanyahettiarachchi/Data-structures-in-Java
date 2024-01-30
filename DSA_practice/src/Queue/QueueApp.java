package Queue;

public class QueueApp {

	public static void main(String[] args) {
		
		QueueX Queue1 = new QueueX(10);
		
		Queue1.insert(10);
		Queue1.insert(25);
		Queue1.insert(5);
		Queue1.insert(60);
		Queue1.insert(86);
		
		
		System.out.println(Queue1.peekFront());
		Queue1.remove();
		Queue1.remove();
		System.out.println(Queue1.peekFront());

	}

}
