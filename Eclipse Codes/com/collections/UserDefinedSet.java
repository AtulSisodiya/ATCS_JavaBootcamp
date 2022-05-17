package com.collections;

import java.util.HashSet;
import java.util.Set;

public class UserDefinedSet {

	String student;
	String stream;
	int  studentid;
	public UserDefinedSet(String student, String stream, int studentid) {
		super();
		this.student = student;
		this.stream = stream;
		this.studentid = studentid;
	}
	
	
	@Override
	public String toString() {
		return "UserDefinedSet [" + (student != null ? "student=" + student + ", " : "")
				+ "stream=" + stream + ", studentid=" + studentid + "]";
	}


	public static void main(String[] args) {
		
		UserDefinedSet ob1 = new UserDefinedSet("Atul", "Cse", 5);
		UserDefinedSet ob2 = new UserDefinedSet("Sid", "it", 6);
		UserDefinedSet ob3 = new UserDefinedSet("Danny", "Cse", 11);
		UserDefinedSet ob4 = new UserDefinedSet("Rohan", "ece", 4);
		
		Set<UserDefinedSet> s = new HashSet<>();
		s.add(ob1);
		s.add(ob2);
		s.add(ob3);
		s.add(ob4);
		
		
	   for(UserDefinedSet it1 : s)
	   {
		   System.out.println(it1);
	   }
		
	}
}
