package Array;

import java.util.Scanner;

public class VIII_SumOfArrayElements {
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] ref=new int[] {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<=ref.length-1;i++)
		{
			sum=sum+ref[i];
		}
		System.out.println("Sum Of the Array Elements :"+sum);
	}
		

}
