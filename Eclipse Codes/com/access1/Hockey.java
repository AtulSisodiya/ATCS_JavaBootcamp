package com.access1;

public class Hockey implements Games {

	@Override
	public void players() {
		System.out.println("Hockey is played by 11 Players.");// TODO Auto-generated method stub
		
	}

	@Override
	public void trophies() {
		System.out.println("Stanley Cup Champions \r\n Presidents' Trophy Winners \r\n Prince of Wales Trophy \r\n");// TODO Auto-generated method stub
		
	}

	@Override
	public void rules() {
		System.out.println("Hockey players can only hit the ball with the flat side of their stick.\r\n"
				+ "Hockey players (other than the goalkeeper) are not allowed to use their feet, or any other parts of the body, to control the ball at any time.\r\n"
				+ "A goal can only be scored either from a field goal, a penalty corner, or from a penalty stroke. ");// TODO Auto-generated method stub
		
	}

	@Override
	public void mvp() {
		System.out.println("Dhyan Chand \r\n Sandeep Singh \r\n Dhanraj Pillay \r\n Udham Singh");// TODO Auto-generated method stub
		
	}

}
