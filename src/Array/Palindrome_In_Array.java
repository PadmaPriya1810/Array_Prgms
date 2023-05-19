package Array;

import java.util.Scanner;

public class Palindrome_In_Array 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{	
	int[] arr= {101,15,7,292,11,128};
	int count=0;
	
	for(int i=0;i<arr.length-1;i++)
	{
		if(isPalindrome(arr[i])==1)
		{
			//System.out.println(arr[i]);//To Print Palindrome Numbers
			count++;
		}
	}
	System.out.println(count);
	}

	
	public static int isPalindrome(int num)
	{
		int temp=num;
		int last,rev=0;
	
		while(num!=0)
		{
			last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		
		if(temp==rev)
		{
			return 1;
			
		}
		else
			return 0;	
}
}