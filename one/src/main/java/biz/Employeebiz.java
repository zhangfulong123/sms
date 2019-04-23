package biz;

import java.sql.Date;
import java.util.List;

import domain.Employee;

public interface Employeebiz {

	String insertemployee(int eid, String name, String esex, int mgr, int ephone, String edate, String job, int power);

	Employee searchemp(int eid);

	String removeemp(int eid);


	List<Employee> searchAllemp();

//Employee login(int eid, int power);

}
