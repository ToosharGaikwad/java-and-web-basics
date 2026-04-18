package Array;

public class PrimeNumber {
	 public static void printPrimes(int[] arr) {

	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            int flag = 0;

	            if (num <= 1) continue;

	            for (int j = 2; j <= num / 2; j++) {
	                if (num % j == 0) {
	                    flag = 1;
	                    break;
	                }
	            }

	            if (flag == 0) {
	                System.out.println(num + " is prime");
	            }
	        }

	
}
	 
	 public static void main(String[] args) {
		int []arr = {2,44,24,52,23,13,17};
		printPrimes(arr);
	}
}