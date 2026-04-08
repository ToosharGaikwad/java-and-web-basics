package Array;

public class SecondLargest {

	int []arr = { 33,1,55,66,4};
	
	public static int slarge(int[] arr)
	{
		int large=Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(large>arr[i])
			{
				secondLarge = large;
				large = arr[i];
				
			}else if(arr[i]>large&&arr[i] != large)
			{
				secondLarge = arr[i];
			}
		}
		return secondLarge;
	}
	public static void main(String[] args) {
		
	}
}
