
public class Assignment2_3 {
	private int[] arr;
	private final int SIZE;
	private int front,rear;
	private int count;
	
	public Assignment2_3(int size) {
		this.SIZE = size;
		this.arr = new int[SIZE];
		this.front = -1;
		this.rear = -1;
		this.count = 0;
		
	}
	
	public boolean isEmpty() {
		return count == SIZE; 
	}
	
	public boolean isFull() {
		return count == 0; 
	}
	
	
	public void offer(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
			}
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		count++;
		System.out.println("Enqueued: " + value); 
	}
	
	public int poll() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return -1; 
			}
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		count--;
		return temp; 
	}
	
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1; 
			}
		return arr[(front + 1) % SIZE];
		}

	
	public int getCount() {
		return count; 
	}
	
	
	public static void main(String[] args) {
		
		Assignment2_3 q = new Assignment2_3(4);
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
	}
	
}
