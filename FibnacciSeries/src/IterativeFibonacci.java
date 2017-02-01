import java.util.Scanner;

public class IterativeFibonacci {

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
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
