package assignment1;

import java.util.Scanner;

public class Assignment1_3 {

	public static int linearSearch(int arr[], int key, int occ) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {

				count++;
				if (occ == count) {
					return i;
				}
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 22, 11, 22, 44 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to be searched :");
		int key = sc.nextInt();

		System.out.println("Enter which occurence you want :");
		int occ = sc.nextInt();

		int index = linearSearch(arr, key, occ);

		if (index != -1) {
			System.out.println("key coccurence number " + occ + " found at "+index );
		} else {
			System.out.println("key not found");
		}

	}

}
