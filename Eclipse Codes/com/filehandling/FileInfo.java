package com.filehandling;

import java.io.File;

public class FileInfo {
	public static void main(String args[]) {
	
	File finfo = new File("D:\\music.txt");
	if (finfo.exists()) {
	     
	      System.out.println("Name of the File: " + finfo.getName());
	      System.out.println("The Path of the File: " + finfo.getAbsolutePath());
	      System.out.println("File Writable: " + finfo.canWrite());
	      System.out.println("File Readable: " + finfo.canRead());
	      System.out.println("File size in bytes " + finfo.length());
	    }
}
}
