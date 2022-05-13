package com.filehandling;

import java.io.File;  
import java.io.IOException;  
public class CreatingFile   
{  
public static void main(String[] args)   
{     
File file = new File("D:\\music.txt"); 
boolean result;  
try   
{  
result = file.createNewFile();    
if(result)     
{  
System.out.println("File created "+file.getCanonicalPath());  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
}         
}  
}  

