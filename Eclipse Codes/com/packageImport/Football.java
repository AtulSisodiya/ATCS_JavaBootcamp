package com.access1;

public class Football implements Games {
	@Override
	public void players() {
		System.out.println("Football is played by 11 Players.");// TODO Auto-generated method stub
		
	}

	@Override
	public void trophies() {
		System.out.println("Some Football trophies are : \r\n Border-Gavaskar Trophy "
				+ "Fifa World cup \r\n"
				+ "UEFA Cup \r\n"
				+ "UEFA European \r\n"
				);// TODO Auto-generated method stub
		
	}

	@Override
	public void rules() {
		System.out.println("Teams will be told which way they are kicking at start of game.\r\n"
				+ "Teams cannot score directly from a kick off.\r\n"
				+ "There is no offside.\r\n"
				+ "All free kicks and corners are direct and opposition must be 3 metres away.");// TODO Auto-generated method stub
		
	}

	@Override
	public void mvp() {
		System.out.println("Messi \r\n Ronaldo \r\n Neymar Jr. \r\n Sir gio Ramos");// TODO Auto-generated method stub
		
	}
}
