package com.filehandling;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputex {
	public static void main(String[] args) {
	    String data = "Data is power...power is power.";

	    try {
	
	      ByteArrayOutputStream out = new ByteArrayOutputStream();

	      out.write(data.getBytes());

	      byte[] byteData = out.toByteArray();
	      System.out.print("Data using toByteArray(): ");
	      for(int i=0; i<byteData.length; i++) {
	        System.out.print((char)byteData[i]);
	      }

	      String stringData = out.toString();
	      System.out.println("\nData using toString(): " + stringData);

	      out.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }

}
