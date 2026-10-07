package assignment1;

import java.util.Scanner;

public class Assignment1_4 {

	public static int descBinarySearch(int arr[], int key) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			}

			else if (key < arr[mid]) {
				left = mid + 1;
			}

			else
				right = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 77, 66, 55, 44, 33, 22, 11 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter key to be found");
		int key = sc.nextInt();

		int index = descBinarySearch(arr, key);

		if (index != -1) {
			System.out.println("key is found at :" + index);
		} else
			System.out.println("key not found");

	}

}
