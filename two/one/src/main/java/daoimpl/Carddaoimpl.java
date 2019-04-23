package daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Carddao;
import domain.Card;
import until.DBUtil;

public class Carddaoimpl implements Carddao {
	private DBUtil db;
	public String addcard(Card c) {
		
		this.db=new DBUtil();
		String sql="insert into card values(?,?,?,?,?,?)";
		try {
			int i = this.db.update(sql, c.getCid(),c.getState(),c.getTid(),c.getScoring(),c.getCprice(),c.getCquota());
			return i>0?"添加成功":"添加失败";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public String deletecard(int cid) {
		this.db=new DBUtil();
		String sql="delete * from card where cid="+cid;
			try {
				int i = this.db.update(sql);
				return i>0?"删除成功":"删除失败";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
	}

	public Card findcard(int cid) {
		this.db=new DBUtil();
		String sql="select * from card where cid="+cid;
			
				try {
					ResultSet re = this.db.query(sql);
					 if(re.next()){
						 return new Card(re.getInt("cid"), re.getString("state"), re.getInt("tid"), re.getInt("scoring"), re.getDouble("cprice"), re.getDouble("cquota"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
		
	}

	@Override
	public boolean updatecardmoney(int cid, double cprice) {
		this.db=new DBUtil();
		String sql="update card set cprice="+cprice+" where cid="+cid;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updatecardstate(int cid, String state) {
		this.db=new DBUtil();
		String sql="update card set state=? where cid="+cid;
		try {
			int i = this.db.update(sql,state);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean updatecardscoring(int cid, double scoring) {
		this.db=new DBUtil();
		String sql="update card set scoring=? where cid="+cid;
		try {
			int i = this.db.update(sql,scoring);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
