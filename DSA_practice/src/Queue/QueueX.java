package Queue;

public class QueueX {
	
	private int maxSize;
	private int [] queueArray;
	private int front;
	private int rear;
	private int items;
	
	
	public QueueX(int s)
	{
		maxSize = s;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		items = 0;
	}
	
	public void insert(int j)
	{
		if(rear == maxSize -1)
		{
			System.out.println("Queue is full!");
		}
		else
		{
			queueArray[++rear] = j;
			items++;
		}
	}
	
	public int remove()
	{
		if (items ==0)
		{
			System.out.println("Queue is empty!");
			return -99;
		}
		else
		{
			items--;
			return queueArray[front++];
		}
	}
	
	public int peekFront()
	{
		if (items ==0)
		{
			System.out.println("Queue is empty!");
			return -99;
		}
		else
			return queueArray[front];
	}

}
