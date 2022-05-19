package com.access1;

public class MainGame {
	public static void main(String[] args)
    {
        Games c = new Cricket();
        Games  f= new Football();
        Games h = new Hockey();
        
        c.players();
        c.trophies();
        c.rules();
        c.mvp();
        
        f.players();
        f.trophies();
        f.rules();
        f.mvp();
      
        h.players();
        h.trophies();
        h.rules();
        h.mvp();
        
    }
}
