package com.filehandling;

import java.io.FileWriter;
import java.io.Writer;

public class CharWrite {
	 public static void main(String args[]) {

	        String data = "Inputting this data in any file";

	        try {
	           
	            Writer output = new FileWriter("D:\\outputchar.txt");

	            output.write(data);

	            output.close();
	        }

	        catch (Exception e) {
	            e.getStackTrace();
	        }
	    }
}
