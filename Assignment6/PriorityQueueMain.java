
public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue(9);
		
		q.offer(6);
		q.offer(14);
		q.offer(3);
		q.offer(26);
		q.offer(8);
		q.offer(18);
		q.offer(21);
		q.offer(9);
		q.offer(5);
		
		
		while(!q.isEmpty())
			System.out.println("popped value :" + q.poll());

	}
}
