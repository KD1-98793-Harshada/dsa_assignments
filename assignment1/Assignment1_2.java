//2. Write a linear search algorithm to 
/////return index of last occurance of key.
package assignment1;

import java.util.Scanner;

public class Assignment1_2 {
	
		
	public static void main(String[] args) {
		
		int arr[] = {11,22,33,11,11,22,33,22,33};
		
		int index = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key : ");
		int key = sc.nextInt();
		
		for(int i = 0; i< arr.length; i++) {
			if(key == arr[i])
				index = i;
				
					
		}
		System.out.println("last occ : " + index );
				
	}
	
}
