package Array;

import java.util.Scanner;

public class Caesar_Cipher_Encryption
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char[] arr= {'x','y','z'};//Passing Length into Array size in Syntax
		char ch;
		int res = 0;
		int key=2;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			ch=(char)(charAt(i)+key);
			
			if(!(ch>='a'&& ch<='z'))
			{
				ch=(char)(ch-26);
			}
			res = res+ch;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println(arr[i]);	
		}


}

	private static int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}