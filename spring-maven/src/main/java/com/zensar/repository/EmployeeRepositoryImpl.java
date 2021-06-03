package com.zensar.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;
import com.zensar.beans.Employee;

public class EmployeeRepositoryImpl {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	//1  
//	public int saveEmployee(Employee employee) {
//		return template.update("insert into employee values("+employee.getEmployeeId()+",'"+employee.getEmployeeName()+"',"+employee.getEmployeeSalary()+");");
//	}
	

	//2//
	public List<Employee> getAllEmployees() {
		
		String sql="select * from employee";
		
		return (List<Employee>) template.query(sql,new ResultSetExtractor() {
			
			@Override
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Employee> employees=new ArrayList<Employee>();
                while(rs.next()) {
                	int id=rs.getInt(1);
                	String name=rs.getString(2);
                	int sal=rs.getInt(3);
                	
                	Employee employee=new Employee(id, name	, sal);
                	employees.add(employee);
                }
				
				return employees;
			}
			
			
		});
	}
	
	//3//
//	 public List<Employee> getAllEmployeesRowMapper() {
//         return template.query("select * from employee", new RowMapper<Employee>() {
//             public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
//                 Employee employee = new Employee();
//                 employee.setEmployeeId(rs.getInt(1));
//                 employee.setEmployeeName(rs.getString(2));
//                 employee.setEmployeeSalary(rs.getInt(3));
//                 return employee;
//             }
//         });
//     }
			

				
}
