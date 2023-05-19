package Array;

import java.util.Scanner;

public class XVII_StoreElementsFromOneArrayToAnother {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		
		System.out.println("Enter the Length of an Array2");
		int size=sc.nextInt();
		int[] arr2=new int[size];
		
		for (int i=0;i<=arr1.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("Array Elements in Array2 are:");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		
}
}