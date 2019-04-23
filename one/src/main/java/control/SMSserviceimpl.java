package control;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import biz.Accountbiz;
import biz.Cardbiz;
import biz.Employeebiz;
import biz.Fmenubiz;
import biz.Salebiz;
import biz.Typebiz;
import biz.Usersbiz;
import biz.Vegetablebiz;
import bizimpl.Accountbizimpl;
import bizimpl.Cardbizimpl;
import bizimpl.Employeebizimpl;
import bizimpl.Fmenubizimpl;
import bizimpl.Salebizimpl;
import bizimpl.Typebizimpl;
import bizimpl.Usersbizimpl;
import bizimpl.Vegetablebizimpl;
import domain.Account;
import domain.Card;
import domain.Employee;
import domain.Fmenu;
import domain.Sale;
import domain.Type;
import domain.Users;
import domain.Vegetable;

public class SMSserviceimpl implements SMSservice ,Serializable{

	private Employeebiz empbiz;
	private Fmenubiz fmbiz;
	private Vegetablebiz vegbiz;
	private Cardbiz cardbiz;
	private Accountbiz accbiz;
	private Salebiz salbiz;
	private Typebiz typebiz;
	private Usersbiz userbiz;
	

	public SMSserviceimpl() {
		super();
		this.empbiz = new Employeebizimpl();
		this.fmbiz = new Fmenubizimpl();
		this.vegbiz = new Vegetablebizimpl();
		this.cardbiz = new Cardbizimpl();
		this.accbiz = new Accountbizimpl();
		this.salbiz = new Salebizimpl();
		this.typebiz = new Typebizimpl();
		this.userbiz = new Usersbizimpl();
	}

	public String addemployee(int eid, String name, String esex, int mgr, int ephone, String edate, String job,
			int power) {
		// TODO Auto-generated method stub
		return this.empbiz.insertemployee(eid,name,esex,mgr,ephone,edate,job,power);
	}

	public Employee selectemp(int eid) {
		// TODO Auto-generated method stub
		return this.empbiz.searchemp(eid);
	}

	public String deleteemp(int eid) {
		// TODO Auto-generated method stub
		return this.empbiz.removeemp(eid);
	}

/*	public boolean updateemp(int eid) {
		// TODO Auto-generated method stub
		return this.empbiz.updateemp(eid);
	}
*/
	public List<Employee> selectAllemp() {
		// TODO Auto-generated method stub
		return this.empbiz.searchAllemp();
	}

	public String addfmenu(int fid, String fname, double fprice, int num, int vid) {
		// TODO Auto-generated method stub
		return this.fmbiz.insertfmenu(fid,fname,fprice,num,vid);
	}

	public String deletefmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmbiz.removefmenu(fid);
	}
/*
	public boolean updatefmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmbiz.updatefmenu(fid);
	}*/

	public Fmenu selectfmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmbiz.searchfmenu(fid);
	}

	public List<Fmenu> selectAllfmenu() {
		// TODO Auto-generated method stub
		return this.fmbiz.searchAllfmenu();
	}

	public String addveg(int vid, String vname) {
		// TODO Auto-generated method stub
		return this.vegbiz.insertveg(vid,vname);
	}

	public String deleteveg(int vid) {
		// TODO Auto-generated method stub
		return this.vegbiz.removeveg(vid);
	}

	/*public boolean updateveg(int vid) {
		// TODO Auto-generated method stub
		return  this.vegbiz.updateveg(vid);
	}
*/
	public Vegetable selectveg(int vid) {
		// TODO Auto-generated method stub
		return  this.vegbiz.searchveg(vid);
	}

	public List<Vegetable> selectAllveg() {
		// TODO Auto-generated method stub
		return this.vegbiz.searchAllveg();
	}

	public String addcard(int cid, String state, int tid, int scoring, double cprice, double cquota) {
		// TODO Auto-generated method stub
		return this.cardbiz.insertcard(cid,state,tid,scoring,cprice,cquota);
	}

	public String deletecard(int cid) {
		// TODO Auto-generated method stub
		return this.cardbiz.removecard(cid);
	}

	public Card selectcard(int cid) {
		// TODO Auto-generated method stub
		return this.cardbiz.searchcard(cid);
	}

	public String addacc(int fid, int anum, int aid, String uuid) {
		// TODO Auto-generated method stub
		return this.accbiz.insertacc(fid,anum,aid,uuid);
	}

	public String deleteacc(int fid) {
		// TODO Auto-generated method stub
		return this.accbiz.removeacc(fid);
	}

	public boolean updateacc(int aid,int anum,int fid) {
		// TODO Auto-generated method stub
		return this.accbiz.updateacc(aid,anum,fid);
	}

	public List<Account> selectacc(String uuid) {
		// TODO Auto-generated method stub
		return this.accbiz.searchacc(uuid);
	}

	public String addsal(int fid, int num) {
		// TODO Auto-generated method stub
		return this.salbiz.insertsal(fid,num);
	}

	public List<Sale> selectAllsal() {
		// TODO Auto-generated method stub
		return this.salbiz.searchAllsal();
	}

	public String addtype(int tid, String tname) {
		// TODO Auto-generated method stub
		return this.typebiz.inserttype(tid,tname);
	}

	public List<Type> selectAlltype() {
		// TODO Auto-generated method stub
		return this.typebiz.searchAlltype();
	}

	public String addusers(int id, String uname, int cid, int uphone) {
		// TODO Auto-generated method stub
		return this.userbiz.insertuser(id,uname,cid,uphone);
	}

	public List<Users> selectAllusers() {
		// TODO Auto-generated method stub
		return this.userbiz.searchAlluser();
	}

	public Employee login(int eid) {
		// TODO Auto-generated method stub
		return this.empbiz.searchemp(eid);
	}

	@Override
	public boolean deleteAllacc(String uuid) {
		// TODO Auto-generated method stub
		return this.accbiz.removeAllacc(uuid);
	}

	@Override
	public double moneyacc(String uuid) {
		// TODO Auto-generated method stub
		return this.accbiz.moneyacc(uuid);
	}

	@Override
	public boolean updatecardmoney(int cid, double cprice) {
		// TODO Auto-generated method stub
		return  this.cardbiz.updatecardmoney(cid,cprice);
	}

}
