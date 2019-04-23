package domain;


import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1008;
	private int eid;
	private String name;
	private String esex;
	private int mgr;
	private int ephone;
	private String edate;
	private String job;
	private int power;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, String esex, int mgr, int ephone, String edate, String job, int power) {
		super();
		this.eid = eid;
		this.name = name;
		this.esex = esex;
		this.mgr = mgr;
		this.ephone = ephone;
		this.edate = edate;
		this.job = job;
		this.power = power;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getEphone() {
		return ephone;
	}
	public void setEphone(int ephone) {
		this.ephone = ephone;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String date) {
		this.edate = date;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

	@Override
		public String toString() {
			
			return this.eid+","+this.name+","+this.esex+","+this.mgr+","+this.ephone+","+this.edate+","+this.job+","+this.power;
		}

}
