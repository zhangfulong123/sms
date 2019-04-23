package daoimpl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.Employeedao;
import domain.Employee;
import until.DBUtil;

public class Employeedaoimpl implements Employeedao {
	private DBUtil db;
	// eid,  name,  esex,  mgr,  ephone,  edate,  jo, power
	public String addemp(Employee e) {
		this.db=new DBUtil();
		String sql="insert into employee values(?,?,?,?,?,?,?,?)";
		try {
			int i = this.db.update(sql, e.getEid(),e.getName(),e.getEsex(),e.getMgr(),e.getEphone(),e.getEdate(),e.getJob(),e.getPower());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
	}

	public Employee findemp(int eid) {
		this.db=new DBUtil();
		//创建sql 语句
		String sql="select * from employee where eid="+eid;
		//执行sql语句
		try {
			ResultSet rs = this.db.query(sql);
			if(rs.next()){
				Employee s=new Employee();
				s.setEid(rs.getInt("eid"));
				s.setName(rs.getString("ename"));
				s.setEsex(rs.getString("esex"));
				s.setMgr(rs.getInt("mgr"));
				s.setEphone(rs.getInt("ephone"));
				/*//获取日期
				String str = rs.getString("edate");
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				s.setEdate(sdf.parse(str));*/
				s.setEdate(rs.getString("edate"));
				s.setJob(rs.getString("job"));
				s.setPower(rs.getInt("power"));
				return s;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			this.db.closed();
		}
		return null;
	}

	public String deleteemp(int eid) {
		this.db=new DBUtil();
		String sql="delete * from employee where eid="+eid;
			try {
				int i = this.db.update(sql);
				return i>0?"删除成功":"删除失败";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}

	// eid,  name,  esex,  mgr,  ephone,  edate,  jo, power
	public List<Employee> findemp() {
	/*	String str =null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");*/
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from employee";
				try {
					ResultSet rs = this.db.query(sql);
					//创建一个list集合用于存储所有的课程
					List<Employee> list=new ArrayList<Employee>();
					while(rs.next()){
						list.add(new Employee(rs.getInt("eid"),rs.getString("name"),rs.getString("esex"),rs.getInt("mgr"),rs.getInt("ephone"),rs.getString("edate"),rs.getString("job"),rs.getInt("power")));
					}
					return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}


}
