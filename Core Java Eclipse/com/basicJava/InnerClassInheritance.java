package com.access;
//class OuterClass
//{
//	class InnerClassOne
//	{
//		int x = 10;
//
//		void methodOfInnerClassOne()
//		{
//			System.out.println("From InnerClassOne");
//		}
//	}
//
//	class InnerClassTwo extends InnerClassOne
//	{
//	}
//}
class OuterClass
{
    int x=10;
 
    void methodOfOuterClass()
    {
        System.out.println("From OuterClass");
    }

    class InnerClass extends OuterClass
    {
        
    }
 
    class InnerClassOne
    {
        
    }
}


public class InnerClassInheritance {
	public static void main(String args[])
	{
//		OuterClass outer = new OuterClass();  
//        OuterClass.InnerClassTwo innerTwo = outer.new InnerClassTwo();
//
//        System.out.println(innerTwo.x);
//		innerTwo.methodOfInnerClassOne();
		
		OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); 
        System.out.println(inner.x);
        inner.methodOfOuterClass();
        
        Integer i1=122;
        Integer i2=122;
        Integer i3=128;
        Integer i4=128;
        System.out.println(i1==i2);
        System.out.println(i3==i4);
	}
}
