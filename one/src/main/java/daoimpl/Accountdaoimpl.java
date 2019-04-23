package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.Accountdao;
import domain.Account;
import until.DBUtil;

public class Accountdaoimpl implements Accountdao {
	private DBUtil db;
	public String addacc(Account a) {
		
		this.db=new DBUtil();
		//ResultSet re = null ;
		String sql="insert into account values(?,?,?,?)";
		//String sql1="update vegetable set fnum=? where fid="+a.getFid();
		//String sql3="select fnum from vegetable where fid="+a.getFid();
		/*try {
			re = this.db.query(sql3);
			this.db.update(sql3, re.getInt("fnum")-1);
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		try {
			int i = this.db.update(sql, a.getFid(),a.getAnum(),a.getAid(),a.getUuid());
			return i>-1?"添加成功":"添加失败";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteacc(int fid) {
		
		this.db=new DBUtil();
		String sql="delete  from account where fid="+fid;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean updeteacc(int aid,int anum,int fid) {
		this.db=new DBUtil();
		String sql="update set(anum,aid)=(?,?) where fid=?";
		try {
			int i = this.db.update(sql, aid,anum,fid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public List<Account> findAllacc(String uuid) {
		this.db=new DBUtil();
		String sql="select * from account where uuid="+uuid;
		try {
			ResultSet re = this.db.query(sql);
			List<Account> list=new ArrayList<Account>();
			while(re.next()){
				list.add(new Account(re.getInt("fid"), re.getInt("anum"), re.getInt("aid"), re.getString("uuid")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteAllacc(String uuid) {
		this.db=new DBUtil();
		String sql="delete account where uuid="+uuid;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public double moneyacc(String uuid) {
		double d=0;
		this.db=new DBUtil();
		String sql="select * from account a,fmenu f where a.fid=f.fid and a.uuid="+uuid;
			try {
				ResultSet re = this.db.query(sql);
				while(re.next()){
					d=d+re.getInt("anum")*re.getInt("fprice");
				}
				return d;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return 0;
	}
		

}
