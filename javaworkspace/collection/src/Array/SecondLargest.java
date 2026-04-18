package Array;

public class SecondLargest {

	
	
	public static int slarge(int[] arr)
	{
		int large=Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				secondLarge = large;
				large = arr[i];
				
			}else if(arr[i]>secondLarge&&arr[i] != large)
			{
				secondLarge = arr[i];
			}
		}
		return secondLarge;
	}
	public static void main(String[] args) {
		int []arr = { 33,1,5,5,79};
		System.out.println(slarge(arr));
		
	}
}
