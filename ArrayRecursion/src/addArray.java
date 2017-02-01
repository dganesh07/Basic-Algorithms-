import java.util.Scanner;

public class addArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the elemets");
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		int total = add(arr, n - 1);
		System.out.println("total " + " " + total);
	}

	public static int add(int[] arr, int index) {
		if (index < 0)
			return 0;
		return arr[index] + add(arr, index - 1);

	}

}
