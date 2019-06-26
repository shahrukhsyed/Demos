package com.capgemini.lesson10.runnable;


public class RunnableDemo {
	
	
	public static void main(String[] args) {
		
		MyRunnable ob=new MyRunnable();
		
		
		Thread firstThread = new Thread(ob,"First");
		Thread secondThread = new Thread(ob,"Second");
		Thread thirdThread = new Thread(ob,"Third");
		
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		
	
			
			
	
	}

}
