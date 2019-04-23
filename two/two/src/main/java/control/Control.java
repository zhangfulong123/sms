package control;

import view.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import domain.Employee;
import domain.Fmenu;
import domain.Vegetable;
import until.UserInput;

//客户端        自定义项目流程，方法
public class Control {
      //属性
	private view v;
	private UserInput ui;
	public static final String IP="10.10.49.102";
	public static final int PORT=9999;
	private SMSService service;
	//构造方法
	public Control() {
		this.v=new view();
		this.ui=new UserInput();
		//创建代理对象
		service=proxyclient.getClient(SMSService.class,IP,PORT);
	}
	//自定义方法-项目流程方法
	public void start(){
		int select = 0;
		/*while(true){
			this.ui.
		}*/
		while(true){
			v.welcome();
			select = this.ui.getInt("请输入要选择的服务选项");
			if(select==1){
				v.eview();
				select =this.ui.getInt("请输入要选择的服务选项");
				while(true){
					
					if(select==1){
						//添加员工
						String emp = this.addemployee();
						System.out.println(emp);
						break;
					}else if(select==2){
						//删除员工
						boolean b = this.deleteemp();
						System.out.println(b);
						break;
					}else if(select==3){
						//修改员工
						String s = this.updateemp();
						System.out.println(s);
						break;
					}else if(select==4){
						//查询所有员工
						this.selectAllemp();
						break;
					}else if(select==5){
						//查询员工根据id
						this.selectempbyid();
						break;
					}else if(select==0){
						//返回
						break;
					}
				}
				
			}else if(select==2){
				while(true){
					v.fview();
					select =this.ui.getInt("请输入要选择的服务选项");
					if(select==1){
						//添加菜单
						String a = this.addmenu();
						System.out.println(a);
					}else if(select==2){
						//删除菜单
						this.deletemenu();
						break;
					}else if(select==3){
						//修改菜单名字
						this.updatemenu();
						break;
					}else if(select==4){
						//查询菜单
						this.selectAllmenu();
						break;
					}else if(select==0){
						//返回
						break;
					}
				}
			}else if(select==3){
				while(true){
					v.tview();
					select =this.ui.getInt("请输入要选择的服务选项");
					if(select==1){
						//添加菜品
						this.addveg();
						break;
					}else if(select==2){
						//删除菜品
						this.deletveg();
						break;
					}else if(select==3){
						//修改菜品
						this.updateveg();
						break;
					}else if(select==4){
						//查询菜品
						this.selectAllveg();
						break;
					}else if(select==0){
						//返回
						break;
					}
				}
			}else if(select==4){
				while(true){
					v.sview();
					select =this.ui.getInt("请输入要选择的服务选项");
					if(select==1){
						
					}else if(select==0){
						//返回
						break;
					}
				}
			}else if(select==5){
				while(true){
					v.cview();
					select =this.ui.getInt("请输入要选择的服务选项");
					if(select==1){
						//类型
						this.updatetype();
						break;
					}else if(select==2){
						//状态
						this.updatestate();
						break;
					}else if(select==3){
						//额度
						this.updatequota();
						break;
					}else if(select==0){
						//返回
						break;
					}
				}
			}else if(select==0){
				System.exit(0);
			}
		}
		
	}
	private void updatequota() {
		this.v.println("<<<卡额度修改");
		int cid = this.ui.getInt("卡id");
		double cquota = this.ui.getDouble("请输入卡额度");
		boolean b = this.service.updateCardquoat(cid, cquota);
		System.out.println(b);
		
	}
	private void updatestate() {
		this.v.println("<<<卡状态修改");
		int cid = this.ui.getInt("卡id");
		String state = this.ui.getString("请输入卡状态名称");
		boolean b = this.service.updateCardstate(cid, state);
		System.out.println(b);
	}
	private void updatetype() {
		this.v.println("<<<卡类型修改");
		int cid = this.ui.getInt("卡id");
		int tid = this.ui.getInt("请输入卡类型名称");
		boolean b = this.service.updateCardtype(cid, tid);
		System.out.println(b);
		
	}
	private void selectAllveg() {
		List<Vegetable> list = this.service.selectAllvege();
		System.out.println("菜品id"+"\t"+"菜品名称");
		for (Vegetable v : list) {
			System.out.println(v.getVid()+"\t"+v.getVname());
		}
		
	}
	private String updateveg() {
		this.v.println("<<<菜单信息修改");
		this.v.println(">>>亲输入：");
		int vid = this.ui.getInt("修改前菜单id");
		Vegetable vege = this.service.selectVege(vid);
		if(vege==null){
			return "菜品id不存在";
		}
		String vname = this.ui.getString("修改后菜名");
		boolean b = this.service.updateVege(vid, vname);
		
		return b==true?"修改成功":"修改失败";
	}
	private void deletveg() {
		this.v.println("<<<菜品信息删除");
		this.v.println(">>>亲输入：");
		int vid = this.ui.getInt("菜品id");
		boolean b = this.service.deleteVege(vid);
		System.out.println(b);
	}
	private String addveg() {
		this.v.println("<<<菜品信息添加");
		this.v.println(">>>亲输入：");
		int vid = this.ui.getInt("菜品id");
		Vegetable vege2 = this.service.selectVege(vid);
		if(vege2!=null){
			return "菜品id已存在";
		}
		String vname = this.ui.getString("菜品name");
		String vege = this.service.addVege(vid, vname);
		return vege;
		
	}
	private void selectAllmenu() {
		List<Fmenu> list = this.service.selectMenu();
		System.out.println("菜单id"+"\t"+"菜单name"+"\t"+"菜单单价"+"\t"+"菜单库存"+"\t"+"菜品id");
		for (Fmenu fm : list) {
			System.out.println(fm.getFid()+"\t"+fm.getFname()+"\t"+fm.getFprice()+"\t"+fm.getNum()+"\t"+fm.getVid());
		}
		
	}
	private void updatemenu() {
		this.v.println("<<<菜单信息修改");
		this.v.println(">>>亲输入：");
		int fid = this.ui.getInt("修改前菜id");
		String fname = this.ui.getString("修改后菜名");
		double fprice = this.ui.getDouble("修改后的菜价");
		int num = this.ui.getInt("修改后的库存");
		int vid = this.ui.getInt("修改后的菜品");
		boolean b = this.service.updateMenu(new Fmenu(fid, fname, fprice, num, vid));
		System.out.println(b);
		
	}
	private void deletemenu() {
		this.v.println("<<<菜单信息删除");
		this.v.println(">>>亲输入：");
		int fid = this.ui.getInt("菜id");
		boolean b = this.service.deleteMenu(fid);
		System.out.println(b);
		
	}
	//int fid, String fname, double fprice, int num, int vid
	private String addmenu() {
		this.v.println("<<<菜单信息添加");
		this.v.println(">>>亲输入：");
		int fid = this.ui.getInt("菜id");
		/*Fmenu f = this.service.selectMenubyfid(fid);
		if(f!=null){
			return "菜id已存在";
		}*/
		String fname = this.ui.getString("菜名");
		double fprice = this.ui.getDouble("菜价");
		int num = this.ui.getInt("库存");
		int vid = this.ui.getInt("属于菜品id");
		String a = this.service.addMenu(fid, fname, fprice, num, vid);
		return a;
		
	}
	private void selectempbyid() {
		this.v.println("<<<员工信息查询");
		int eid = this.ui.getInt("请输入查询员工id");
		Employee employee = this.service.selectEmpbyid(eid);
		System.out.println(employee);
		
	}
	private void selectAllemp() {
		List<Employee> list = this.service.selectAllemp();
		System.out.println("雇员id"+"\t"+"雇员姓名"+"\t"+"雇员性别"+"\t"+"雇员上级编号"+"\t"+"雇员联系方式"+"\t"+"入职日期"+"\t"+"工作名称"+"\t"+"权限");
		for (Employee e : list) {
			System.out.println(e.getEid()+"\t"+e.getName()+"\t"+e.getEsex()+"\t"+e.getMgr()+"\t"+e.getEphone()+"\t"+e.getEdate()+"\t"+e.getJob()+"\t"+e.getPower());
		}
	
		
	}
	private String updateemp() {
		this.v.println("<<<员工信息修改");
		this.v.println(">>>亲输入修改后的：");
		int eid = this.ui.getInt("id");
		Employee employee = this.service.selectEmpbyid(eid);
		if(employee==null){
			return "雇员不存在";
		}
		String name = this.ui.getString("名字");
		String esex = this.ui.getString("性别：男或女");
		int mgr = this.ui.getInt("上司编号");
		int ephone = this.ui.getInt("手机号");
		String edate = this.ui.getString("入职日期");
		String job = this.ui.getString("工作类型");
		int power = this.ui.getInt("权限 1-经理 0-员工");
		return this.service.updateEmpmsg(new Employee(eid, name, esex, mgr, ephone, edate, job, power));
		
	}
	private boolean deleteemp() {
		this.v.println("<<<员工信息删除");
		int eid = this.ui.getInt("亲输入删除员工id");
		return this.service.deleteEmp(eid);
	
		
	}
	/*private String addInformations() {
		this.v.println(">>>请假信息录入");
		this.v.println("请输入请假信息");
		int Infoid=this.ui.getInt("请输入请假编号");
		String Instart=this.ui.getString("请输入请假开始时间");
		String Inend=this.ui.getString("请输入请假结束时间");
		int Inday=this.ui.getInt("请输入请假天数");
		String Intype=this.ui.getString("请输入请假类型");
		String Inreason=this.ui.getString("请输入请假理由");
		return this.service.insertInfor(Infoid, Instart, Inend, Inday, Intype, Inreason);
	}*/
	//int eid, String name, String esex, int mgr, int ephone, Date edate, String job, int power
	private String addemployee() {
		this.v.println("<<<员工信息添加");
		this.v.println(">>>亲输入：");
		int eid = this.ui.getInt("id");
		/*Employee empbyid = this.service.selectEmpbyid(eid);
		if(empbyid!=null){
			return "雇员已存在";
		}*/
		String name = this.ui.getString("名字");
		String esex = this.ui.getString("性别：男或女");
		int mgr = this.ui.getInt("上司编号");
		int ephone = this.ui.getInt("手机号");
		String edate = this.ui.getString("入职日期");
		String job = this.ui.getString("工作类型");
		int power = this.ui.getInt("权限 1-经理 0-员工");
		return this.service.addEmpmsg(new Employee(eid, name, esex, mgr, ephone, edate, job, power));
		
		
		
	}



}
