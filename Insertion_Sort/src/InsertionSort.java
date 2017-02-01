import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("enter Sorted elements for insertion sort");
		 for(int i=0;i<N;i++)
	            arr[i]=sc.nextInt();
		 
		 for(int j=1;j<N;j++){
			 int key = arr[j];
			 int temp = j;
			 
			 
			 //for non increasing order--------> 
			 // while(temp > 0 && arr[temp-1]<key)
			 while(temp > 0 && arr[temp-1]>key){
				 arr[temp] = arr[temp-1];
				 temp--;
			 }
			 arr[temp] = key;
		 }
		
		 
		 System.out.println("done");
		 System.out.println(Arrays.toString(arr));
		 
	}

}
