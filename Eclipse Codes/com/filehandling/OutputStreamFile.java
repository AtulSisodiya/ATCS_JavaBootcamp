package com.filehandling;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamFile {
public static void main(String args[]) {
String data="This is output stream file to write on the file";
try {
	try (OutputStream out = new FileOutputStream("D:\\out.txt")) {
		byte[] array = data.getBytes();
			
		out.write(array);
	} 
	System.out.println("Written successfullyyy");
	
}
catch(Exception e){
	System.out.println(e);
}
}
}
