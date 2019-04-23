package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.Usersdao;
import domain.Users;
import until.DBUtil;

public class Userdaoimpl implements Usersdao {
	private DBUtil db;
	//int id, String uname, int cid, int uphone
	public String adduser(Users u) {
		this.db=new DBUtil();
		String sql="insert into users values(?,?,?,?)";
		try {
			int i = this.db.update(sql,u.getId(),u.getUname(),u.getCid(),u.getUphone() );
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Users> findAlluser() {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from users";
				try {
					ResultSet rs = this.db.query(sql);
					//创建一个list集合用于存储所有的课程
					List<Users> list=new ArrayList<Users>();
					while(rs.next()){
						list.add(new Users(rs.getInt("id"),rs.getString("uname"),rs.getInt("cid"),rs.getInt("uphone")));
					}
					return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
	}

}
