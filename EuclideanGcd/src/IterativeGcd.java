import java.util.Scanner;

public class IterativeGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the first num");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter the second num");
		int num2 = sc.nextInt();
		
		while(num2!=0){
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		System.out.println(" the Gcd is " + " " + num1);
	}

}
