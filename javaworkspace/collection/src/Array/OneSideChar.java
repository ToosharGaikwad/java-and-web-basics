package Array;

public class OneSideChar {

	public static void changeIndex(int arr[],int target) {
		 int[] brr = new int[arr.length];
		 int num =0;
	 int len =	arr.length-1;
		for(int itr =0;itr<arr.length;itr++) {
			
			if(arr[itr] !=target) {
				
				System.out.print(" "+arr[itr]);

			}else {
				brr[num++] = arr[itr];
			}
			
		}
		for (int i = 0; i < num; i++) {
            System.out.print(brr[i] + " ");
        }
	}
	
//	public static void side(int arr[],int target) {
//	
//		int len = arr.length-1;
//		for(int i=0;i<len;i++)
//		{
//			if(target==arr[i]) {
//				int temp = arr[i];
//				arr[i] = arr[len];
//				arr[len] = temp;
//				len--;
//				i--;
//			}
//		}
//		
//		
//	}
	public static void main(String[] args) {
		int brr[] = {5,3,35,6,3,2,5,7,3};
	    changeIndex(brr, 3);
//		side( brr,3);
//		for (int num : brr) {
//            System.out.print(num + " ");
//        }
	}
}
