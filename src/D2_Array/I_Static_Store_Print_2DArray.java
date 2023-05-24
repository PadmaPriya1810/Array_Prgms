package D2_Array;

public class I_Static_Store_Print_2DArray {
	public static void main(String[] args) {
		
	//Store Array Elements Directly
		
	int[][] arr= {
			         {1,2,3},{4,5,6},{7,8,9}
			     };//[][][] =ArrayOfArray
	
	// Will be Stored as 
	//1 2 3
	//4 5 6
	//7 8 9
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
