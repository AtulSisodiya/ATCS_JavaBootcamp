package com.thread;
public class PriorityThread extends Thread
{
    public void run ()
    {
        System.out.println ("Running thread name is:" + Thread.currentThread ().getName ());
        
        System.out.println ("Running thread priority is:" + Thread.currentThread ().getPriority ());
    }
    public static void main (String args[])
    {
    	PriorityThread m1 = new PriorityThread ();
    	PriorityThread m2 = new PriorityThread ();
    	PriorityThread m3 = new PriorityThread ();
       
    	m1.setPriority (1);
        m2.setPriority (2);
        m3.setPriority (10);
       
        m1.start ();
        m2.start ();
        m3.start();
    
        }
}