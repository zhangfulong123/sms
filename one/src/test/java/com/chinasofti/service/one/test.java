package com.chinasofti.service.one;

import org.junit.Test;

import dao.Employeedao;
import dao.Fmenudao;
import dao.Typedao;
import dao.Usersdao;
import daoimpl.Employeedaoimpl;
import daoimpl.Fmenudaoimpl;
import daoimpl.Typedaoimpl;
import daoimpl.Userdaoimpl;
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
	public void addfmenu(){
		//ClazzDao c=new ClazzDaoImpl();
		//System.out.println(c.addClazz(new Clazz(3, "高一三班")));
		Fmenudao fd=new Fmenudaoimpl();
		System.out.println(fd.findfmenu(1001))	;
		//System.out.println(ed.addemp(new Employee(3, "zhang", "男", 123, 123456, to_date('1993-4-5','yyyy-mm-dd'), "job", 0)));
		//Usersdao u=new Userdaoimpl();
		
	}
}
