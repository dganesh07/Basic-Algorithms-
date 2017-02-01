import java.util.Scanner;

public class RecursionFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of fibnacci numbers required");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int num) {
		if (num < 2) {
			return num;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
