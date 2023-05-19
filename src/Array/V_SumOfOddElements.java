package Array;

import java.util.Scanner;

public class V_SumOfOddElements {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] ref=new int[5];
		int OddSum=0;
		
		System.out.println("Enter the Values into the Array are:");
		
		for(int i=0;i<=ref.length-1;i++)
		{
			ref[i]=sc.nextInt();
		}
		for(int i=0;i<ref.length-1;i++)
		{
			if(ref[i]%2!=0)
			{
				OddSum=OddSum+ref[i];
			}
		}
		System.out.println("Sum of Odd Elements" +OddSum);
			}
		}

