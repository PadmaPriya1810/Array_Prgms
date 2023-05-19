package Array;

public class MissingElement_In_Array 
{
public static void main(String[] args) 
{
	int[] ar= {1,5,7,9,16,18};
	
	for(int i=0;i<ar.length-1;i++)//For Taking Every Index
	{
		for(int j=ar[i]+1;j<ar[i+1];j++)//Except Index Elements 
			
		{
			System.out.print(j+" ");
		}
	}
}
}
