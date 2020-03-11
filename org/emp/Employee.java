package org.emp;

import java.util.Scanner;

public class Employee {
	public void empId () {
		Scanner i=new Scanner(System.in);
		int id =i.nextInt();
		System.out.println("employee id "+id);
	}
	public void empName() {
		Scanner n=new Scanner(System.in);
		String name=n.next();
		System.out.println(name);			
}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
	}
}   
  
