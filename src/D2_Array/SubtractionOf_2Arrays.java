package D2_Array;

public class SubtractionOf_2Arrays 
{
public static void main(String[] args) 
{
		
		//Store Array Elements Directly
			
		int[][] arr1= {   {1,2,3},{1,2,3},{1,2,3}   };//[][] =Array Of Array
		int[][] arr2= {   {1,2,3},{1,2,3},{1,2,3}   };
		
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr1[i][j]-arr2[i][j]+"  ");//Subtraction
			}
			System.out.println();
		}
	}

}
