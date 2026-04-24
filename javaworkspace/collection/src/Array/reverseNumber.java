package Array;

public class reverseNumber {
	
	public static void main(String[] args) {
		 int reverse =0;
		 int num = 3324;
		 
			while(num>0) {
			int temp = num%10;
			 reverse = reverse*10+temp;
			num = num/10;
			
			
			
			
			} 
			System.out.println(reverse);
	}
	}
   
	
	

