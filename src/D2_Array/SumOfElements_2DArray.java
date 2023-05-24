package D2_Array;

public class SumOfElements_2DArray 
{
	public static void main(String[] args) 
	{
		
	int[][] arr= {{1,1,1},{2,2,2},{3,3,3}};//[][] =Array Of Array
	
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			sum=sum+arr[i][j];
		}
		System.out.println(sum);
		sum=0;
	}
	}
}
//	3
//	6
//	9

