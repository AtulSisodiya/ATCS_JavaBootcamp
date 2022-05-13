package com.filehandling;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamRead {
public static void main(String[] args) {
	
	byte[] array = new byte[100];

    try {
      InputStream input = new FileInputStream("D:\\out.txt");

      System.out.println("Available bytes in the file: " + input.available());

      input.read(array);
      
      System.out.println(array);
      System.out.println("Data read from the file: ");
      String data = new String(array);
      System.out.println(data);
      input.close();
      
    } catch (Exception e) {
      e.getStackTrace();
    }
}
}
