package D2_Array;


//Static Way to Store
public class I_Create_Store_Print_2DArray {
	
	public static void main(String[] args) {
		
	
	int [][] arr=new int[3][3];//[Row][Column]
	//To Store in Static Way
	
	for(int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=12;//All the values are stored as 12
		}
	}
	
	// 12 12 12
	// 12 12 12
	// 12 12 12
	
	//To Print the 2D Array
	for(int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" "); //Space For Array Elements
		}
		
		System.out.println();//For Next Line Array Space
		
	}
		
	}
}
