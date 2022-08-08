package com.globallogic.July21;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

  class Info implements Comparable<Info> 
  {
    int id;
    String name;
	int salary;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public  void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Info(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Info o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Info [ID= "+this.id + ",  Name= " + this.name + ",  Salary= " + this.salary + "]";
	}
}




public class Student {
	public static void main(String[] args)  {
		ArrayList<Info> ls=new ArrayList<Info>();
		Scanner sc =new Scanner(System.in);
		int id=0;
		String name="";
		int salary=0;
		System.out.println("1. Add the Employee to the list");
		System.out.println("2. Delete the employee from the list");
		System.out.println("3. Search the employee name");
		System.out.println("4. Update the Employee name");
		System.out.println("5. Sort the Employee data");
		System.out.println("6. Provide the sum of salary of Employee");
		System.out.println("7. Search for highest paid salary");
		System.out.println("8. Search for minimum paid salary");
		while(true) {
			System.out.println("Make your choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter the Employee Id, Name and Salary");
				id=sc.nextInt();
				name=sc.next();
				salary=sc.nextInt();
				ls.add(new Info(id,name,salary));
				System.out.println("Data added Successfully");
				//Info.print();
				break;
			}
			case 2:{
				System.out.println("Enter the person name to be deleted");
				String nm=sc.next();
				for(Info e:ls) {
					if(e.getName().equalsIgnoreCase(nm)) {
						ls.remove(e);
					}
					System.out.println(ls.toString());
				}
				break;
			}
			case 3:
				{
					System.out.println("Enter the person name to be searched");
					String nm=sc.next();
					for(Info e:ls) {
						if(e.getName().equalsIgnoreCase(nm)) {
				    		System.out.println(e.toString());	
				    	}
					}
				break;
				}
			case 4:
			{
				System.out.println("Enter the person name to be Updated");
				String nm=sc.next();
				System.out.println("Enter the Salary Amount to be Updated");
				int v=sc.nextInt();
				for(Info e:ls) {
					if(e.getName().equalsIgnoreCase(nm)) {
					e.setSalary(v);
					System.out.println("Data Updated");
					}
			}
				break;
			}
			case 5:{
				Collections.sort(ls);
				System.out.println(ls.toString());
				break;
			}
			case 6:
			{
				int sum=0;
				for(Info e: ls) {
					sum+=e.getSalary();
				}
				System.out.println(sum);
				break;
			}
			case 7:
			{
				int max=Integer.MIN_VALUE;
				for(Info e:ls) {
					if(max<e.getSalary()) {
						max=e.getSalary();
					}
					
				}
				System.out.println(max);
				break;
			}
			case 8:
			{
				int min=Integer.MAX_VALUE;
				for(Info e:ls) {
					if(min>e.getSalary()) {
						min=e.getSalary();
					}
					
				}
				System.out.println(min);
				break;
			}
			default:
			{
				System.out.print("Invalid choice");
				break;
			}
				
				
			}
		
	}
	}
}


