package D2_Array;

public class Common_Elements_In_2Array 
{
public static void main(String[] args) 
{
	int[] arr1= {10,5,7,9,16,18,11,88};
	int[] arr2= {18,10,88};
			
	//To Take the Elements from 1st Array
	for(int i=0;i<arr1.length;i++)
	{
		//To Check the Elements From 2nd Array
		for(int j=0;j<arr2.length;j++)
		{
			//To Compare with 2nd Array
			if(arr1[i]==arr2[j])
			{
				System.out.print(arr1[i]+" ");
			}
			
		}
	}
}
}
