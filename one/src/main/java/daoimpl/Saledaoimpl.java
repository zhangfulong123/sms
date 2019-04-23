package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.Saledao;
import domain.Sale;
import until.DBUtil;

public class Saledaoimpl implements Saledao {
	private DBUtil db;
	public String addsal(Sale s) {
		this.db=new DBUtil();
		String sql="insert into sale values(?,?)";
		try {
			int i = this.db.update(sql, s.getFid(),s.getNum());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Sale> findAllsal() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from sale";
		try {
			ResultSet rs = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<Sale> list=new ArrayList<Sale>();
			while(rs.next()){
				list.add(new Sale(rs.getInt("fid"), rs.getInt("num")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
