package Array;

import java.util.Scanner;

public class XVIII_Adding2ElementsGiveEvenNumber 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array");
		int size=sc.nextInt();//Getting Length from user
		int[] arr=new int[size];//Passing Length into Array size in Syntax
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<=arr.length-1;i++)//Storing Values
		{
			arr[i]=sc.nextInt();//For Getting Array Elements From user
		}
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]!=arr[j]&&(arr[i]+arr[j])%2==0)
			{
				System.out.println(arr[i]+" - "+arr[j]);
			}	
		}
		}
	}
}
