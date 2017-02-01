import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] result = new int[N];
		System.out.println("enter elements ");
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		result = MergeSort(arr);

		System.out.println(Arrays.toString(arr));

		for (int i : result) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	public static int[] MergeSort(int[] B) {

		int size = B.length;
		if (size <= 1)
			return B;
		int mid = size / 2;

		int[] left = new int[mid];
		int[] right = new int[size - mid];
		int[] result = new int[size];

		for (int i = 0; i < mid; i++) { // check----!
			left[i] = B[i];
		}
		int x = 0;
		for (int j = mid; j < size; j++) {
			right[x] = B[j];
			x++;
		}

		left = MergeSort(left);
		right = MergeSort(right);

		result = Merge(left, right);
		return result;

	}

	public static int[] Merge(int[] left, int[] right) {

		int pointL = 0;
		int pointR = 0;
		int pointT = 0;

		int Lleng = left.length;
		int Rleng = right.length;
		int rs = Lleng + Rleng;
		int[] result = new int[rs];

		while (pointL < Lleng && pointR < Rleng) {
			// if(pointL < Lleng && pointR < Rleng){

			if (left[pointL] <= right[pointR]) {
				result[pointT] = left[pointL];
				pointL++;
				pointT++;
			} else {
				result[pointT] = right[pointR];
				pointR++;
				pointT++;
			}

			// use else if statements or use while loops .... the difference is
			// in the while statements
			// for using else if statements the while loop will be as follow ..
			// while (pointL < Lleng || pointR < Rleng ) followed by a if
			// statement.... !!
			// }
			
			
			/*
			 * else if(pointL < left.length){ result[pointT] = left[pointL];
			 * pointL++; pointT++; } else{ result[pointT] = right[pointR];
			 * pointR++; pointT++; }
			 */
		}
		while (pointL < left.length) {
			result[pointT] = left[pointL];
			pointL++;
			pointT++;
		}
		while (pointR < right.length) {
			result[pointT] = right[pointR];
			pointR++;
			pointT++;
		}

		return result;

	}

}
