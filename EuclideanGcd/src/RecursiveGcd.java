import java.util.Scanner;

public class RecursiveGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the first num");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter the second num");
		int num2 = sc.nextInt();
		int gcd = GCD(num1,num2);
		System.out.println("the gcd is " + " "+ gcd);
		
	}
	public static int GCD(int num1,int num2){
		if(num2==0)
			return num1;
		else
			return GCD(num2,num1%num2);
	}

}
