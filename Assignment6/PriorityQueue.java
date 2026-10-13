

public class PriorityQueue {
	Assignment6_1 h;
	private final int SIZE;
	
	public PriorityQueue(int size) {
		SIZE = size;
		h  = new Assignment6_1(size);
	}
	
	public void offer(int value) {
		if(h.isFull())
			System.out.println("Queue id full");
		else
			h.addHeap(value);
	}
	
	public int poll()
	{
		int temp = -1;
		if(h.isEmpty())
			System.out.println("Queue is empty");
		else
			temp = h.deleteHeap();
		return temp;
	}
	
	public int peek() {
		int temp = -1;
		if(h.isEmpty())
			System.out.println("Queue is empty");
		else
			temp = h.getMin();
		return temp;
	}
	public boolean isEmpty() {
		return h.isEmpty();
	}
	
	public boolean isFull() {
		return h.isFull();
	}

}
