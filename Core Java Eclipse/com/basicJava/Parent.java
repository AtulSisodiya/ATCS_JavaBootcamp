package com.access;

public class Parent {
public int add(int a,int b) {
	return a+b;
}
public int add(int a,int b,int c) {
	return a+b+c;
}
public static void main(String args[]) {
	Parent p= new Parent();
	System.out.println(p.add(10, 20));
	System.out.println(p.add(10, 20,30));
}
}
