package bizimpl;

import biz.Cardbiz;
import dao.Carddao;
import daoimpl.Carddaoimpl;
import domain.Card;

public class Cardbizimpl implements Cardbiz {

	private Carddao carddao;

	public Cardbizimpl() {
		super();
		this.carddao = new Carddaoimpl();
	}

	public String insertcard(int cid, String state, int tid, int scoring, double cprice, double cquota) {
		// TODO Auto-generated method stub
		return this.carddao.addcard(new Card(cid, state, tid, scoring, cprice, cquota));
	}

	public String removecard(int cid) {
		// TODO Auto-generated method stub
		return this.carddao.deletecard(cid);
	}

	public Card searchcard(int cid) {
		// TODO Auto-generated method stub
		return this.carddao.findcard(cid);
	}

	@Override
	public boolean updatecardmoney(int cid, double cprice) {
		// TODO Auto-generated method stub
		return this.carddao.updatecardmoney(cid,cprice);
	}

	@Override
	public boolean updatecardstate(int cid, String state) {
		// TODO Auto-generated method stub
		return this.carddao.updatecardstate(cid,state);
	}

}
