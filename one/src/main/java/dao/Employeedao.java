package dao;

import java.util.List;

import domain.Employee;

public interface Employeedao {

	String addemp(Employee employee);

	Employee findemp(int eid);

	String deleteemp(int eid);


	List<Employee> findemp();


}
