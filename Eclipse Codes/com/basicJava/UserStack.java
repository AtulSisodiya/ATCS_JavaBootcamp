package com.access;

class Stack{
	
int[] arr=new int[10];
int size=0;
int currIndex=-1;


public void push(int data)throws FullStackException{
	if(size==arr.length){
		throw new FullStackException("stack is full");
	}
	currIndex++;
	arr[currIndex]=data;
	size++;
}
public int pop() throws EmptyStackException{
	if(size==0){
		throw new EmptyStackException("stack is empty");
	}
	
	int tmp=arr[currIndex];
	currIndex--;
	size--;
	return tmp;
}

public void display()throws EmptyStackException{
	if(size==0){
		throw new EmptyStackException("stack is empty ");
	}
	for(int i=1; i<=size; i++){
		System.out.print(arr[i-1]+" ");
	}
}

}

public class UserStack{
	public static void main(String[] args) {
		try {
		Stack s=new Stack();
		//Stack p= null;
		//p.pop();
		
		for(int i=1; i<=10; i++){
			s.push(i);
		}
		
//		for(int i=1; i<=10; i++){
//			s.pop();
//		}
		//s.pop();
		s.display();
		}
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is final");
			System.exit(0);
			}
		System.out.println("Hello");
			
	}
}