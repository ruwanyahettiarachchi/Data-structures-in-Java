package Stack;

public class StackX {
	
	private int maxSize;
	private double [] stackArray;
	private int top;
	
	public StackX(int s)
	{
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	public void push(double j)
	{
		if (top == maxSize-1)
		{
			System.out.println("Stack is full!");
		}
		else
		{
			stackArray[++top] = j;
		}
	}
	
	public double pop()
	{
		if (top == -1)
			return -99;
		else
			return stackArray[top--];
		
	}
	
	public double peek()
	{
		if (top == -1)
			return -99;
		else
			return stackArray[top];
	}

}
