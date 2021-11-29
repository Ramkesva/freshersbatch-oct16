package com.database.springdbdemo.ass5;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Employee")
public class Employee {
	@Id
	private int id;
	@Field
	private  String employeename;
	@Field
	private String employeedept;
	@Field
	private String employeedesg;
	@Field
	private int salary;
	

	public Employee(int id, String employeename, String employeedept, String employeedesg, int salary) {
		
		super();
		this.id = id;
		this.employeename = employeename;
		this.employeedept = employeedept;
		this.employeedesg = employeedesg;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public String getEmployeedept() {
		return employeedept;
	}
	public String getEmployeedesg() {
		return employeedesg;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", employeedept=" + employeedept
				+ ", employeedesg=" + employeedesg + ", salary=" + salary + "]";
	}
	
}
