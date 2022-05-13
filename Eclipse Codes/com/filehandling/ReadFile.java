package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
		  public static void main(String[] args) {
		    try {
		      
		      File fileObj = new File("D:\\music.txt");
		      Scanner readingObj = new Scanner(fileObj);
		      while (readingObj.hasNextLine()) {
		        String data = readingObj.nextLine();
		        System.out.println(data);
		      }
		      readingObj.close();
		    }
		    catch(FileNotFoundException e) {
		        System.out.println("The Given File does not Exist");
		        e.printStackTrace();
		      }
		    }
		  }

