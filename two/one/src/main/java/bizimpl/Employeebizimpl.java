package bizimpl;

import java.sql.Date;
import java.util.List;

import biz.Employeebiz;
import dao.Employeedao;
import daoimpl.Employeedaoimpl;
import domain.Employee;

public class Employeebizimpl implements Employeebiz {

	private Employeedao empdao;

	public Employeebizimpl() {
		super();
		this.empdao = new Employeedaoimpl();
	}

	public String insertemployee(int eid, String name, String esex, int mgr, int ephone, String edate, String job,
			int power) {
		// TODO Auto-generated method stub
		return this.empdao.addemp(new Employee(eid, name, esex, mgr, ephone, edate, job, power));
	}

	public Employee searchemp(int eid) {
		// TODO Auto-generated method stub
		return this.empdao.findemp(eid);
	}

	public String removeemp(int eid) {
		// TODO Auto-generated method stub
		return this.empdao.deleteemp(eid);
	}



	public List<Employee> searchAllemp() {
		// TODO Auto-generated method stub
		return this.empdao.findemp();
	}

/*	public Employee login(int eid, int power) {
		// TODO Auto-generated method stub
		return this.empdao.login(eid,power);
	}
*/
}
