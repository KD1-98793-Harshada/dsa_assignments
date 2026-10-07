//5. Write a recursive method to find nth term of fibbonacci series.

package assignment1;

import java.util.Scanner;

public class Assignment1_5 {

	public static void main(String[] args) {
		System.out.println("Enter the nth term :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			int next = a + b;
			System.out.print(" " + a);
			a = b;
			b = next;

		}

	}

}
