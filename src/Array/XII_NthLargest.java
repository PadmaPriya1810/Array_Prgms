package Array;

import java.util.Scanner;

public class XII_NthLargest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Length of an Array");
		int size=sc.nextInt();//Getting Length from user
		int[] arr=new int[size];//Passing Length into Array size in Syntax
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<=arr.length-1;i++)//Storing Values
		{
			arr[i]=sc.nextInt();//For Getting Array Elements From user
		}	
	}	
}
