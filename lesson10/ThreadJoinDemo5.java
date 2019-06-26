package com.capgemini.lesson10;


public class ThreadJoinDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionRunnable5 m=new TransactionRunnable5();
	
		Thread producer = new Thread(m, "Sham");
        Thread consumer = new Thread(m, "Ram");
        
         
       producer.start();
         
        //start second thread after waiting for 10 seconds or if it's dead
      
         
      consumer.start();
         
        
         
      
         
        //let all threads finish execution before finishing main thread
        try {
            producer.join();
            consumer.join();
           
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
         
        System.out.println("All threads are dead, exiting main thread");
	
	
	
	}

}
