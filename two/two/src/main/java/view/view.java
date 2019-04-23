package view;

public class view {
	public void welcome(){
		System.out.println("欢迎来到钢炮餐饮管理界面");
		System.out.println("1、员工信息管理");
		System.out.println("2、菜单管理");
		System.out.println("3、菜品类别管理");
		System.out.println("4、销售管理");
		System.out.println("5、卡的管理");
		System.out.println("0、退出系统");
	}
	public void eview(){
		System.out.println("1、添加员工");
		System.out.println("2、删除员工");
		System.out.println("3、修改员工");
		System.out.println("4、查询所有员工");
		System.out.println("5、查询员工根据id");
		System.out.println("0、返回上一级");
	}
	public void fview(){
		System.out.println("1、添加菜单");
		System.out.println("2、删除菜单");		
		System.out.println("3、修改菜单名字");
		System.out.println("4、查询菜单");
		System.out.println("0、返回上一级");
	}
	public void tview(){
		System.out.println("1、添加菜品");
		System.out.println("2、删除菜品");
		System.out.println("3、修改菜品");
		System.out.println("4、查询菜品");
		System.out.println("0、返回上一级");
	}
	public void sview(){
		System.out.println("1、查看总业绩");
		System.out.println("0、返回上一级");
		
	}
	public void cview(){
		System.out.println("1、修改类型");
		System.out.println("2、修改状态");
		System.out.println("3、修改额度");
		System.out.println("0、返回上一级");
		
	}
	public void println(String msg){
		System.out.println(msg);
	}
	
}
