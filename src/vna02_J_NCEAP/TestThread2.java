package vna02_J_NCEAP;

public class TestThread2 implements Runnable {

	public void run() {	
		Adder test = new Adder();
		int a = (int)(Math.random()*9+10);
		int b = (int)(Math.random()*9+10);
		test.setValues(a,b);
		int result = test.getSum();
     	System.out.println(a+"+"+b+"="+result);
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread2 t = new TestThread2();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
