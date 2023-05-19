package Array;

public class PalindromeInArray {
	public static void main(String[] args) {
		int [] ar= {121,15,20,292,33};
		for (int i = 0; i < ar.length; i++) {
			int n1=ar[i];
			int n2=reverseNum(n1);
			if(isPalindrome(n1,n2)==1)
			{
				System.out.println(n1);
			}
			
		}
		
	}
	public static int reverseNum(int n1)
	{
		int last=0,rev=0;
		while(n1>0)
		{
			last=n1%10;
			rev=rev*10+last;
			n1=n1/10;
			
		}
		return rev;
		
	}
	public static int isPalindrome(int n1,int n2)
	{
		if(n1==n2)
			return 1;
		else
			return 0;
	}

}
