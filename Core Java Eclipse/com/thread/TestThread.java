package com.thread;

class Demo extends Thread{
	public void run() {
		System.out.println("Running thread by extending Thread class...");
	}
}

class Demo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Running thread by implementing runnable...");
		
	}
	
}
public class TestThread {
public static void main(String args[]) {
	
	Demo t1= new Demo();
	t1.start();
	
	Demo2 d = new Demo2();
	Thread t2=new Thread(d);
	t2.start();
	
	
}
}
