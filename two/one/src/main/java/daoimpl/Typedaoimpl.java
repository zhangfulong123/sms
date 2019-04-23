package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.Typedao;
import domain.Type;
import until.DBUtil;

public class Typedaoimpl implements Typedao {
	private DBUtil db;
	public String addtype(Type t) {
		this.db=new DBUtil();
		String sql="insert into type values(?,?)";
		try {
			int i = this.db.update(sql,t.getTid(),t.getTname());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Type> findAlltype() {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from type";
				try {
					ResultSet rs = this.db.query(sql);
					//创建一个list集合用于存储所有的课程
					List<Type> list=new ArrayList<Type>();
					while(rs.next()){
						list.add(new Type(rs.getInt("tid"), rs.getString("tname")));
					}
					return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}

}
