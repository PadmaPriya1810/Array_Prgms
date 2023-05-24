package D2_Array;

import java.util.Scanner;

public class InverseTheElements {

	static Scanner sc=new Scanner(System.in);

	 public static void main(String[] args)
	
	   {
		int [][] arr=new int[3][3];//[Row][Column] -[Row]-Mandatory [Column]-Optional (null)
		
		//To Store in Dynamic Way
		
		System.out.println("Enter the Elements");
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();//Get Elements From User
			}
		}
		
		// 1 1 1
		// 2 2 2
		// 3 3 3
		
		//To Print the 2D Array
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[j][j]+" "); //Inversing Happens
			}
			
			System.out.println();//For Next Line Array Space
			
		}
	   }
}
