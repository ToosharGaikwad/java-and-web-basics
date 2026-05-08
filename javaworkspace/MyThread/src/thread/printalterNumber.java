package thread;

class PrintNumber {

    int number = 1;
    int limit = 20;

    public synchronized void printOdd() {
        while (number <= limit) {
            if (number % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    
    
    
    public synchronized void printEven() {
        while (number <= limit) {
            if (number % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
  
    }


 public void printEvennum() {
	 
	 synchronized (this) {
		 while (number<limit){
			 while(number%2==1) {
		 
			 try {
				 wait();
				 
			 }catch (Exception e) {
				e.printStackTrace();
			}
			 }
			 System.out.println(number +" even number");
			 number++;
			 notify();
		 }
	 }
	 }
		 
		 public void printOddnum() {
			synchronized (this) {
				
			
			 while(number<limit) {
				 while(number%2==0) {
					 try {
						 wait();
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
				 }
				 System.out.println(number + " Odd number");
				 number++;
				 notify();
			 }
			 }
		 }
		 
		 
		 
    }

public class printalterNumber extends Thread {

	public static void main(String[] args) throws Exception {
		 PrintNumber obj = new PrintNumber();

	        Thread t1 = new Thread(() -> obj.printOdd());
	        Thread t2 = new Thread(() -> obj.printEven());

//		t1.start();
//		t2.start();
		
		
		Thread t3 = new Thread(()-> obj.printEvennum());
		Thread t4 = new Thread (()-> obj.printOddnum());
				
		t3.start();
		t4.start();
		
		
	}
}
