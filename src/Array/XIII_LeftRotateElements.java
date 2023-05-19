package Array;

import java.util.Scanner;

public class XIII_LeftRotateElements {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Length of an Array");
		int size=sc.nextInt();//Getting Length from user
		int[] arr=new int[size];//Passing Length into Array size in Syntax
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<=arr.length-1;i++)//Storing Values
		{
			arr[i]=sc.nextInt();//For Getting Array Elements From user
		}
		System.out.println("Enter the Number of Left Rotation: ");
		
		int r=sc.nextInt();
		for (int j=1;j<=r;j++)
		{
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) //Coz arr[0]=temp
			{
				arr[i]=arr[i+1]; //Shifting 1->0
				
			}
			arr[arr.length-1]=temp; 
		}
	System.out.println("After "+ r +" Left Rotation");
	for(int i=0;i<=arr.length-1;i++)
	{	
			System.out.print(arr[i]+" ");	
	}
}
}
