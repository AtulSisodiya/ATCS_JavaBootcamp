package com.thread;

class MovieApp
{
	int total_seats = 10;
	synchronized void bookSeats(int seats)
	{ // 10>=6
	  if(total_seats>=seats)
	  {
	  System.out.println(seats + " Seats booked successfully"); 
	  total_seats= total_seats-seats;
	  System.out.println("Seats left: " +total_seats);
	  }
	  else
	  {
		  System.out.println("Seats Not booked");
	   System.out.println("seats available " + total_seats);
	  }
	}
}
public class MovieBooking extends Thread {

	 static MovieApp m;
	 int seats;
	 public void run()
	 { 
		 m.bookSeats(seats);
	 }
	 public static void main(String[] args) {
		
		 m = new MovieApp();
		 MovieBooking user1 = new MovieBooking();
		 user1.seats = 11;
		 user1.start();
		 MovieBooking user2 = new MovieBooking();
		 user2.seats = 6;
		 user2.start();
		 
		 
	}
}

