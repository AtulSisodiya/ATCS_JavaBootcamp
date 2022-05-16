package com.access;

public class StaticNestedClass
{
    static class Nested_Demo
    {
        public void my_method ()
        {
            System.out.println ("This is my nested class");
        }
    }
    public static void main (String args[])
    {
        Nested_Demo nested = new Nested_Demo ();
        nested.my_method ();
    }
}