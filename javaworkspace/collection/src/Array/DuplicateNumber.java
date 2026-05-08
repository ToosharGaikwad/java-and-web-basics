package Array;

public class DuplicateNumber {
	
	
	
	



	// count a all unique number 

	public static void dup(int arr[]) {
		int len = arr.length;
		 boolean visited[] = new boolean[len];
		for (int i = 0 ;i<len;i++) {
			
			  if (visited[i]) continue;
			int count =1;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {

				count++;
				 visited[j] = true;				
			}				
		}
			System.out.print(arr[i]+" ");
			System.out.println(count +" times");				
		}
		
}	
	
	public static void removeDuplicate(int arr[]) {
		int len = arr.length;
		
		boolean visited[] = new boolean[len];
		
		for(int i=0;i<len;i++)
		{
			if(visited[i]) continue;
			
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					
				}
			}
			System.out.println(arr[i]);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {22,4,5,4,22,1,5,5,5};
//		dup(arr);
		removeDuplicate(arr);

	}
	
	
	
	
	
	
	
	
}