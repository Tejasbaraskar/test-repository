package com.zensar.beans;

import java.util.Arrays;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lambok annotations
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class Employee {

	private int employeeId;
	private String employeeName;                                        // 1
//	private String[] employeeName;                                      // 2
	private int employeeSalary;
	private Address address;                                            // 1
//	private Address[] address;                                          // 2
//	List<Address>address;                                                //3
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Employee(int employeeId, String employeeName, int employeeSalary, Address address) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.employeeSalary = employeeSalary;
//		this.address = address;
//	}
	
	
//3//	public Employee(int employeeId, String employeeName, int employeeSalary, List<Address> address) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.employeeSalary = employeeSalary;
//		this.address = address;
//	}
	
	
//	public Employee(Address address) {                                      // 8 auto writing by constructor
//		super();
//		this.address = address;
//	}
	
	
	
	

	public int getEmployeeId() {
		return employeeId;
	}


	public Employee(int employeeId, String employeeName, int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
	public String getEmployeeName() {                                // 1
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
//	public String[] getEmployeeName() {                             // 2
//		return employeeName;
//	}
//
//	public void setEmployeeName(String[] employeeName) {
//		this.employeeName = employeeName;
//	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	public Address getAddress() {                                   // 1
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

//	public Address[] getAddress() {                                  // 2
//		return address;
//	}
//
//	public void setAddress(Address[] address) {
//		this.address = address;
//	}
	
	
//	public List<Address> getAddress() {                                   // 3
//		return address;
//	}
//
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}


	
	

	
	
                                            
//1//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
//				+ employeeSalary + ", address=" + address + "]";
//	}

	
	
	
	
	
	
	public void myInit() {                                          // 4
		System.out.println("inside public void myInit()");
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	


	
	
	
	
	
	
}
