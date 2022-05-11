package com.access1;

public class Cricket implements Games{

	@Override
	public void players() {
		System.out.println("Cricket is played by 11 Players.");// TODO Auto-generated method stub
		
	}

	@Override
	public void trophies() {
		System.out.println("Some Cricket trophies are :\r\n Border-Gavaskar Trophy "
				+ "Wisden Trophy \r\n"
				+ "Warne–Muralidaran Trophy \r\n"
				+ "Basil D'Oliveira Trophy \r\n"
				+ "Pataudi Trophy \r\n");// TODO Auto-generated method stub
		
	}

	@Override
	public void rules() {
		System.out.println("Cricket is played between two teams each made up of eleven players. (Sometime in junior competitions you will find 8 player teams).\r\n"
				+ "Games comprise of at least one innings where each team will take turns in batting and fielding/bowling. \r\n");// TODO Auto-generated method stub
		
	}

	@Override
	public void mvp() {
		System.out.println("Virat \r\n Sachin \r\n Dhoni \r\n Rohit");// TODO Auto-generated method stub
		
	}

}
