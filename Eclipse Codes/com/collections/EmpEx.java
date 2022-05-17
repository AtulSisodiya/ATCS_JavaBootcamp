package com.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	int Empid;
	String name;

	public Employee(int Empid, String name) {
		super();
		this.Empid = Empid;
		this.name = name;
		
	}


	public int getEmpid() {
		return Empid;
	}


	public void setEmpid(int empid) {
		Empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



@Override
public int compareTo(Employee emp) {
	
	return this.getEmpid() - emp.getEmpid();
	
}
@Override
public String toString() {
	return "Employee [" + (name != null ? "empid=" + Empid + ", " : "")
			+ "name=" + name +  "]";	
}

	
}

public class EmpEx {
	public static void main(String[] args) {
		SortedSet<Employee> emp = new TreeSet<>();
		emp.add(new Employee(101,"Atul"));
		emp.add(new Employee(105,"Danny"));
		emp.add(new Employee(103,"Sid"));
		emp.add(new Employee(107,"Rahul"));
		
		System.out.println(emp);
		
		emp = new TreeSet<>(Comparator.comparing(Employee::getEmpid));
		emp.add(new Employee(101,"zoro"));
		emp.add(new Employee(102,"luffy"));
		
		System.out.println(emp);
	}
	
}
