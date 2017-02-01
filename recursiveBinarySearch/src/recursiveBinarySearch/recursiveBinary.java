package recursiveBinarySearch;

import java.util.Scanner;

public class recursiveBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("enter Sorted elements for binary search");
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter the element to be searched");
		int x = sc.nextInt();
		int start = 0;
		int end = N - 1;
		int result = BinarySearch(arr, x, start, end);
		if (result == -1) {
			System.out.println("element not found");
		}
		else
		System.out.println("position" + result);
	}

	public static int BinarySearch(int arr[], int x, int start, int end) {

		int mid = (start + end) / 2;
		if (start > end) {
			return -1;
		}
		if (arr[mid] == x)
			return mid;
		else if (x > arr[mid])
			return BinarySearch(arr, x, mid + 1, end);
		else
			return BinarySearch(arr, x, start, mid - 1);

	}

}
