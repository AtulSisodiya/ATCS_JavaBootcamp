package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {
	public static void main(String[] args)
    {
        NavigableSet<String> ts = new TreeSet<String>();
 
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        
 
        System.out.println(ts);
        ts.remove("B");
        System.out.println(ts);
        ts.pollFirst();
        System.out.println(ts);
        ts.pollLast();
        System.out.println(ts);
        ts.headSet("E");
        System.out.println(ts);
        ts.subSet("A", "D");
        System.out.println(ts);
        
    }
}
