package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Vegetabledao;
import domain.Vegetable;
import until.DBUtil;

public class Vegetabledaoimpl implements Vegetabledao {
	private DBUtil db;
	public String addveg(Vegetable v) {
		this.db=new DBUtil();
		String sql="insert into vegetable values(?,?)";
		try {
			int i = this.db.update(sql, v.getVid(),v.getVname());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String deleteveg(int vid) {
		this.db=new DBUtil();
		String sql="delete * from vegetable where vid="+vid;
			try {
				int i = this.db.update(sql);
				return i>0?"删除成功":"删除失败";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	}



	public Vegetable findveg(int vid) {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from vegetable where vid="+vid;
				try {
					 ResultSet rs = this.db.query(sql);
					 if(rs.next()){
						 return new Vegetable(rs.getInt("vid"), rs.getString("vname"));
					 }
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
				return null;
	}

	public List<Vegetable> findAllveg() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from vegetable";
		try {
			ResultSet rs = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<Vegetable> list=new ArrayList<Vegetable>();
			while(rs.next()){
				list.add(new Vegetable(rs.getInt("vid"), rs.getString("vname")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
