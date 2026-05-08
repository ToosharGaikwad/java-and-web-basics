package thread;

class test implements Runnable
{

	public class practiceQ1 {
		
	
		public static void main(String[] args) {
			
			
	//		Thread t3 = new Thread(new test());
			Thread t4 = new Thread(new test2());
			t4.start();
			
	//		t3.run();
			
	//		t3.start();
	//		t2.start();
	//		t1.sell();
		}
	
	}



	@Override
	public void run() {
		System.out.println("call in run 1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void sell() {
		System.out.println("sell");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class test2 extends Thread
{
	public void run() {
		System.out.println("call in Threaad 2");
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("now run");
		
		dog();
		
		
		
		}
	public void dog() {
		System.out.println("bark bho bho");		
		}
	}
