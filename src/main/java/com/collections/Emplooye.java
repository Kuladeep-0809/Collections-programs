package com.collections;

public class Emplooye {
	
	String name ;
	double salary;
	int id ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public Emplooye(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
