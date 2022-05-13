package com.thread;
class Customer{  
	
	int total_amount=10000;    
    
	synchronized void withdraw(int amount){    
			System.out.println("Going to withdraw..."+ amount);
			
    
			if(total_amount<amount){    
					System.out.println("Your balance is "+total_amount+" can't withdraw more than balance.. waiting for deposit...");    
					try{wait();}catch(Exception e){}    
					}    
					total_amount-=amount;    
					System.out.println("Withdraw completed...Remaining Balance is "+total_amount);    
			}    
    
	synchronized void deposit(int amount){    
			System.out.println("going to deposit "+amount);    
			total_amount+=amount;    
			System.out.println("deposit completed... Current Balance "+total_amount);    
			notify();    
		}    
}    
    
public class IntercommunicationThread{    
	public static void main(String args[]){    
		final Customer c=new Customer();    
		new Thread(){    
			public void run(){c.withdraw(15000);}    
			}.start();    
		new Thread(){    
			public void run(){c.deposit(10000);}    
			}.start();    
    
		}
	}    

