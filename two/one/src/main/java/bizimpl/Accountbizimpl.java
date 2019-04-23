package bizimpl;

import java.util.List;

import biz.Accountbiz;
import dao.Accountdao;
import daoimpl.Accountdaoimpl;
import domain.Account;

public class Accountbizimpl implements Accountbiz {


	private Accountdao accdao;
	
	public Accountbizimpl() {
		super();
		this.accdao = new Accountdaoimpl();
	}

	public String insertacc(int fid, int anum, int aid, String uuid) {
		// TODO Auto-generated method stub
		return this.accdao.addacc(new Account(fid, anum, aid, uuid));
	}

	public String removeacc(int fid) {
		// TODO Auto-generated method stub
		return this.accdao.deleteacc(fid)?"删除成功":"删除失败";
	}

	public boolean updateacc(int aid,int anum,int fid) {
		// TODO Auto-generated method stub
		return this.accdao.updeteacc(aid,anum,fid);
	}

	public List<Account> searchacc(String uuid) {
		// TODO Auto-generated method stub
		return this.accdao.findAllacc(uuid);
	}

	@Override
	public boolean removeAllacc(String uuid) {
		// TODO Auto-generated method stub
		return this.accdao.deleteAllacc(uuid);
	}

	@Override
	public double moneyacc(String uuid,int cid) {
		// TODO Auto-generated method stub
		return this.accdao.moneyacc(uuid,cid);
	}

}
