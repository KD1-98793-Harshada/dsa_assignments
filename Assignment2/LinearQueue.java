
public class LinearQueue {

	private int[] arr;
	private final int SIZE;
	private int front, rear;
	
	
	public LinearQueue(int size) {
		this.SIZE = size; 
		this.arr = new int[SIZE];
		this.front = 0; 
		this.rear = 0; 
	}

	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public void offer(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		arr[rear] = value;
		rear ++;
		System.out.println(value);
	}
	
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int temp = arr[front];
		front ++;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
	}
	
	
	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(4);
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		System.out.println("element one" +q.poll());
		
		System.out.println("top element :" +q.peek());
	}

}








