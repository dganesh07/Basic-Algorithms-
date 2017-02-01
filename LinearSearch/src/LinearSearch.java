import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinearSearch {
	//how to deal with duplicates?
	//print all duplicates ? or eliminate them?
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("enter  elements for linear search");
		 for(int i=0;i<N;i++)
	            arr[i]=sc.nextInt();
		 
		System.out.println("enter the element to be searched");
		int x = sc.nextInt();
		
	/*	
		Set mySet = new HashSet();
		mySet.add(arr);*/
		
		
	for(int i=0;i< N; i++){
		if(x == arr[i]){
			System.out.println("element found at position "+ " "+ i);
			break;
		}
		if(i == N){
			System.out.println("elemant not found");
		}
	}
	
	

	}

}
