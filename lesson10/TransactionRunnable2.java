package com.capgemini.lesson10;

public class TransactionRunnable2 implements Runnable{
	int balance=1000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		deposit(1000);
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Thread start::"+Thread.currentThread().getName());
		System.out.println("Before deposit "+balance);
		balance=balance+amount;
		System.out.println("After deposit "+balance);
		System.out.println("Thread ended::"+Thread.currentThread().getName());	
	}
	
	public void printBalance() {
		System.out.println("Balance :"+balance);
	}
}
