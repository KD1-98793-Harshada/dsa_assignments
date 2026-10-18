
public class Assignment2_2 {

	private int[] arr;
	private final int SIZE;
	private int top;
	
	public Assignment2_2(int size) {
		this.SIZE = size; 
		this.arr = new int[SIZE]; 
		this.top = SIZE;
	}
	
	public boolean isEmpty() {
		return top == SIZE; 
	}
	
	public boolean isFull() {
		return top == 0; 
	}
	
	
	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
			return; 
			}
		top--; 
		arr[top] = value;
		System.out.println("Pushed: " + value + " at index " + top); 
	}
	
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
			} 
		int temp = arr[top];
		top++;
		return temp; 
	}
	
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1; 
			}
		return arr[top]; 
	}
	
	
	
	public static void main(String[] args) {
		Assignment2_2 stack = new Assignment2_2(4);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.pop());
		
		stack.peek();
		
	}
	

}
