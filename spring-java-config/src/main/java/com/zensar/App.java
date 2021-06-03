package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.beans.Employee;
import com.zensar.config.JavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	Employee employee=(Employee) context.getBean("employee");
    	employee.addAccount();
    	System.out.println(employee);
    }
}
