
public class Assignment6_1 {

	private int arr[];
	private int SIZE;

	public Assignment6_1(int length) {
		// TODO Auto-generated constructor stub
		arr = new int[length + 1];
		SIZE = 0;
	}
	
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	public boolean isFull() {
		return SIZE == arr.length -1;
	}

	public int getMin() {
		return arr[1];
	}
	
	public void addHeap(int value)
	{
		SIZE ++;
		arr[SIZE] = value;
		
		int ci = SIZE;
		int pi = ci / 2;
		
		while(pi >= 1) 
		{
			if(arr[pi] < arr[ci])
				break;
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int deleteHeap() {
		
		int min = arr[1];
		arr[1] = arr[SIZE];
		SIZE--;
		
		int pi = 1;
		int ci = pi * 2;
		
		while(ci <= SIZE) 
		{
			if((ci + 1) <= SIZE && arr[ci + 1] < arr[ci])
				ci = ci +1;
		
			if(arr[pi] <= arr[ci])
				break;
			
			int temp= arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi * 2;
			
		}		
		return min;
	}
		
}
