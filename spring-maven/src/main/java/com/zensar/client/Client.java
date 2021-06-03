package com.zensar.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.zensar.beans.Employee;
import com.zensar.repository.EmployeeRepositoryImpl;

public class Client {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		//1//Employee employee=(Employee) context.getBean("emp");
		
		EmployeeRepositoryImpl impl=(EmployeeRepositoryImpl) context.getBean("repository");
		
//1 for simple insert//		Employee employee=new Employee(1001, "Ram", 10000);
//		
//		int result=impl.saveEmployee(employee);
//		
//		if(result>0) {
//			System.out.println("inserted successfully !!!");
//		}
		
		
		//2 for display//
		List<Employee> allEmployee=impl.getAllEmployees();
		  Iterator<Employee> itr=allEmployee.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	//1//	System.out.println(employee);
	}
}
