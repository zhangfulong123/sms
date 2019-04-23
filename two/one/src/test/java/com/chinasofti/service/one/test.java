package com.chinasofti.service.one;

import org.junit.Test;

import dao.Accountdao;
import dao.Carddao;
import dao.Employeedao;
import dao.Fmenudao;
import dao.Typedao;
import dao.Usersdao;
import daoimpl.Accountdaoimpl;
import daoimpl.Carddaoimpl;
import daoimpl.Employeedaoimpl;
import daoimpl.Fmenudaoimpl;
import daoimpl.Typedaoimpl;
import daoimpl.Userdaoimpl;
import domain.Account;
import domain.Card;
import domain.Employee;
import domain.Fmenu;
import domain.Type;
import domain.Users;

public class test {

	@Test
	public void addemployee(){
		//ClazzDao c=new ClazzDaoImpl();
		//System.out.println(c.addClazz(new Clazz(3, "高一三班")));
		Employeedao ed=new Employeedaoimpl();
		//System.out.println(ed.addemp(new Employee(3, "zhang", "男", 123, 123456, to_date('1993-4-5','yyyy-mm-dd'), "job", 0)));
	}
	
	@Test
	public void findfmenu(){
		//ClazzDao c=new ClazzDaoImpl();
		//System.out.println(c.addClazz(new Clazz(3, "高一三班")));
		Fmenudao fd=new Fmenudaoimpl();
		System.out.println(fd.findfmenu(1001))	;
		//System.out.println(ed.addemp(new Employee(3, "zhang", "男", 123, 123456, to_date('1993-4-5','yyyy-mm-dd'), "job", 0)));
		//Usersdao u=new Userdaoimpl();
		
	}
	
	@Test
	public void addaccount(){
		Accountdao ad=new Accountdaoimpl();
		System.out.println(ad.addacc(new Account(1001, 1, 10, "1")));
		
	}
	
	@Test
	public void addcard(){
		Carddao cd=new Carddaoimpl();
		System.out.println(cd.findcard(1001));
	}
	
	@Test
	public void moneyacc(){
		Accountdao ad=new Accountdaoimpl();
		System.out.println(ad.moneyacc("1",1001));
	}
}
