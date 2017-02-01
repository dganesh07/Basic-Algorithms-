import java.io.InputStream;
import java.util.Scanner;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack haha = new Stack();
		System.out.println("enter the no of elements to add");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("enter the elements");
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			int item = sc1.nextInt();
			haha.push(item);
		}
		System.out.println(haha.Stack);
		System.out.println(haha.pop());
	}

}
