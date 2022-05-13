package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {  
    try {  
        FileWriter fwrite = new FileWriter("D:\\music.txt");  
        fwrite.write("Written using FileWriter!!!"); 
        fwrite.write("File writer is a good method !!!"); 
        fwrite.write("File write is quite efficient"); 
        fwrite.close();
        System.out.println("Written Successful..");
        } catch (IOException e) {  
        System.out.println("Error While Writing!!!");  
        e.printStackTrace();  
        }  
    }  
}
