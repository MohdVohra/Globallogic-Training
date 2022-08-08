package com.globallogic.July22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

class Employee  {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
class Com implements Comparable<Employee> {

	@Override
	public int compare(Employee o1,Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Myset {
	public static void main(String[] args) {
		Set<Employee> ts=new TreeSet<Employee>(new Com());
		Scanner sc =new Scanner(System.in);
		int id=0;
		String name="";
		int salary=0;
		System.out.println("1. Add the Employee to the list");
		System.out.println("2. Delete the employee from the list");
		System.out.println("3. Search the employee name");
		System.out.println("5. Sort the Employee data");
		while(true) {
			System.out.println("Make your choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter the Employee Id, Name and Salary");
				id=sc.nextInt();
				name=sc.next();
				salary=sc.nextInt();
				ts.add(new Employee(id,name,salary));
				System.out.println("Data added Successfully");
				//Info.print();
				break;
			}
			case 2:{
				System.out.println("Enter the person name to be deleted");
				String nm=sc.next();
				for(Employee e:ts) {
					if(e.getName().equalsIgnoreCase(nm)) {
						ts.remove(e);
					}
					System.out.println(ts.toString());
				}
				break;
			}
			case 3:
				{
					System.out.println("Enter the person name to be searched");
					String nm=sc.next();
					for(Employee e:ts) {
						if(e.getName().equalsIgnoreCase(nm)) {
				    		System.out.println(e.toString());	
				    	}
					}
				break;
				}
			case 4:
			{
				Collections.sort(ts);
				System.out.println(ts.toString());
				break;
			}
	        default:
	        	System.out.println("Invalid choice");
	}

}
		}
}