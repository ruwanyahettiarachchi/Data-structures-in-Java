package Stack;

public class StackApp {

	public static void main(String[] args) {
		
		StackX stk1 = new StackX(10);
		
		stk1.push(30);
		stk1.push(80);
		stk1.push(100);
		stk1.push(25);
				
		System.out.println(stk1.peek());
		stk1.pop();
		System.out.println(stk1.peek());

	}

}
