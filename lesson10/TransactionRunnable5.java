package com.capgemini.lesson10;

public class TransactionRunnable5 implements Runnable{
	int balance=1000;
	boolean valueSet=false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String option=Thread.currentThread().getName();
		for(int i=1;i<10;i++) {
			if(option.equals("Sham"))
				deposit(1000);
			if(option.equals("Ram"))
				printBalance();	
		}	
	}
	public synchronized void deposit(int amount) {
		if(!valueSet) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else {
		System.out.println("Thread start::"+Thread.currentThread().getName());
		System.out.println("Before deposit "+balance);
		balance=balance+amount;
		System.out.println("After deposit "+balance);
		System.out.println("Thread ended::"+Thread.currentThread().getName());	
		valueSet=false;
		notify();
	  }
	}
	
	public synchronized void printBalance() {
		if(valueSet) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else {
		System.out.println("Thread ::"+Thread.currentThread().getName());
		System.out.println("Balance :"+balance);
		valueSet=true;
		notify();
	  } 
	}	
}
