//8. find the first non-repeating element: 
//Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3


package assignment1;

public class Assignment1_8 
{

	public static int nonRepeating(int[] arr) 
	{
		int n = arr.length;
		
		for(int i = 0;i<n; i++) 
		{
			int count = 0;
			for(int j = 0;j< n;j++) 
			{
				if(arr[i] == arr[j]) 
				{
					count++;
				}
			}
			if(count == 1) {
				return arr[i];
			}
		}
		return 0;
	}
}
