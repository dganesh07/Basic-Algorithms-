import java.util.Scanner;

public class RecurssiveFib2 {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of fibnacci numbers required");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n1 + " " + n2);
		fibo(n - 2);

	}

	public static void fibo(int num) {
		if (num > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibo(num - 1);
		}
	}

}
