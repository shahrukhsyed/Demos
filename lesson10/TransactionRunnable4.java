package com.capgemini.lesson10;

public class TransactionRunnable4 implements Runnable{
	int balance=1000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String option=Thread.currentThread().getName();
		for(int i=1;i<10;i++) {
			if(option.equals("Sham"))
				deposit(1000);
			if(option.equals("Ram"))
				printBalance();;
			
		}
		
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Thread start::"+Thread.currentThread().getName());
		System.out.println("Before deposit "+balance);
		balance=balance+amount;
		System.out.println("After deposit "+balance);
		System.out.println("Thread ended::"+Thread.currentThread().getName());	
	}
	
	public synchronized void printBalance() {
		System.out.println("Thread ::"+Thread.currentThread().getName());
		System.out.println("Balance :"+balance);
	}
}
