package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.Fmenudao;
import domain.Fmenu;
import until.DBUtil;

public class Fmenudaoimpl implements Fmenudao {
	private DBUtil db;
	//int fid, String fname, double fprice, int num, int vid
	public String addfmenu(Fmenu f) {
		
		this.db=new DBUtil();
		String sql="insert into fmenu values(?,?,?,?,?)";
		try {
			int i = this.db.update(sql, f.getFid(),f.getFname(),f.getFprice(),f.getNum(),f.getVid());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String deletefmenu(int fid) {
		this.db=new DBUtil();
		String sql="delete * from fmenu where fid="+fid;
			try {
				int i = this.db.update(sql);
				return i>0?"删除成功":"删除失败";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}

	public Fmenu findfmenu(int fid) {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from fmenu where fid="+fid;
				try {
					 ResultSet rs = this.db.query(sql);
					 if(rs.next()){
						 return new Fmenu(rs.getInt("fid"),rs.getString("fname"),rs.getDouble("fprice"),rs.getInt("fnum"),rs.getInt("vid"));
					 }
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
				return null;
	}

	public List<Fmenu> findAllfmenu() {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from fmenu";
				try {
					ResultSet rs = this.db.query(sql);
					//创建一个list集合用于存储所有的课程
					List<Fmenu> list=new ArrayList<Fmenu>();
					while(rs.next()){
						list.add(new Fmenu(rs.getInt("fid"),rs.getString("fname"),rs.getDouble("fprice"),rs.getInt("num"),rs.getInt("vid")));
					}
					return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}

}
