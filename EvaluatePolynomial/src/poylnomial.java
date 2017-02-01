import java.util.Scanner;

public class poylnomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the degree");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		int[] arr = new int[n + 1];
		System.out.println("enter the constants");
		for (int a = 0; a <= n; a++) {
			arr[a] = sc.nextInt();
		}

		int value = arr[0];
		int y = 1;

		for (int i = 1; i <= n; i++) {
			y = y * x;
			value = value + y * arr[i];
		}
		System.out.println(value);
	}

}
