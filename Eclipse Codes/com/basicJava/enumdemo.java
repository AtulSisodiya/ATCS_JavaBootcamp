package com.access;

enum Color{
		RED,
		GREEN,BLUE,YELLOW;
		
		Color()
		{	int i=1;
			System.out.println("Contructor called " + i);
			++i;
		}
		public void dispay()
		{
			System.out.println("displaying...");
		}
	  }
		class enumdemo{
		public static void main(String[] args) {
			Color c = Color.GREEN;
			c.dispay();
			System.out.println(c);
			
		}
		}