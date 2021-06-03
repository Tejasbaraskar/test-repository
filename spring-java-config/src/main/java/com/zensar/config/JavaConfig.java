package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.zensar.beans.Address;
import com.zensar.beans.Employee;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.zensar")
public class JavaConfig {

//	@Bean("employee")
//	public Employee getEmployee() {
//		return new Employee(1001, "Ram", 10000,getAddress());
//	}
//	
//	@Bean("addr")
//	public Address getAddress() {
//		return new Address("MHA", "Pune", 411046);
//	}
	
}
