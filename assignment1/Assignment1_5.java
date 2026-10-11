//5. Write a recursive method to find nth term of fibbonacci series.

package assignment1;

import java.util.Scanner;

public class Assignment1_5 {
	
	public static int fibonacci(int n) {
		
		if(n <= 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth position :");
		int n = sc.nextInt();
		
		int element = fibonacci(n);
		
		System.out.println(n + " th term" + "in the fibonacci is :"+ element);
		
	}

}
