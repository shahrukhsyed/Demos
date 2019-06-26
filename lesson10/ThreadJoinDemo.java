package com.capgemini.lesson10;

import com.capgemini.lesson10.runnable.MyRunnable;

public class ThreadJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionRunnable m=new TransactionRunnable();
	
		Thread thread1 = new Thread(m, "First");
        Thread thread2 = new Thread(m, "Second");
        Thread thread3 = new Thread(m, "Third");
         
        thread1.start();
         
        //start second thread after waiting for 10 seconds or if it's dead
      
         
        thread2.start();
         
        
         
        thread3.start();
         
        //let all threads finish execution before finishing main thread
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
         
        System.out.println("All threads are dead, exiting main thread");
	
	
	
	}

}
