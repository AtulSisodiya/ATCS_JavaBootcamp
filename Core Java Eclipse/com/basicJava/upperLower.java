package com.access;

import java.util.Scanner;

public class upperLower
{
 public static void main(String args[])
 {
     String st;
 int i;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter any string which is to be converted to lowercase");
 st=sc.nextLine();
 char str[]=st.toCharArray();
     for(i=0;i<str.length;i++)
     {
         if(str[i]>='A' && str[i]<='Z')
         { 
         str[i]=(char)((int)str[i]+32);
         }
     }
     System.out.println("The string in LowerCase is");
 for(i=0;i<str.length;i++)
     System.out.print(str[i]);
 }
}

//import java.util.Scanner;
//
//public class CountDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next().toLowerCase();
//		String[][] ct=new String[s.length()][2];
//		int i,j,count=0;
//		for(i=0;i<s.length();i++)
//		{
//			for(j=i;j<s.length();j++)
//			{
//				if(s.charAt(i)==(s.charAt(j)))
//				{
//					count=count+1;
//				}
//			}
//if(check(ct,s.charAt(i)))
//			{
//				ct[i][0]=""+s.charAt(i);
//				ct[i][1]=""+count;
//			}
//			count=0;
//		}
//		for(int it=0;it<ct.length;it++)
//		{
//			if(ct[it][0]!=null)
//				System.out.println(ct[it][0]+":"+ct[it][1]);
//		}
//		sc.close();
//	}
//	static boolean check(String ct[][],char c)
//	{
//		for(int i=0;i<ct.length;i++)
//		{
//			String d=""+c;
//			if(ct[i][0]!=null)
//			{
//				if(ct[i][0].equals(d))
//				{
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//}
