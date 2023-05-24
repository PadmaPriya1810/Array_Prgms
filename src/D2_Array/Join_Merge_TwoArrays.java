package D2_Array;

public class Join_Merge_TwoArrays 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		
		//To Add Length of 2 Arrays
		
		int a1=a.length;
		int b1=b.length;
		
		//To Find the Length Of New Array
		int c1=a1+b1;
		
		//Create New Array
		int[] c= new int[c1];
		
		//Moves arr1 Elements in New Array
		for(int i=0;i<a1;i++) 
		{
			c[i]=a[i];
		}
		
		//Moves arr2 Elements in New Array
		for(int i=0;i<b1;i++)
		{
			c[a1+i]=b[i];
		}
		
		
	    //Printing NewArray
		for(int i=0;i<c1;i++)
		{
			System.out.println(c[i]);
		}
	}

}
