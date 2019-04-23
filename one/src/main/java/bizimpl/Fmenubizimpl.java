package bizimpl;

import java.util.List;

import biz.Fmenubiz;
import dao.Fmenudao;
import daoimpl.Fmenudaoimpl;
import domain.Fmenu;

public class Fmenubizimpl implements Fmenubiz {

	private  Fmenudao fmedao;

	public Fmenubizimpl() {
		super();
		this.fmedao = new Fmenudaoimpl();
	}

	public String insertfmenu(int fid, String fname, double fprice, int num, int vid) {
		// TODO Auto-generated method stub
		return this.fmedao.addfmenu(new Fmenu(fid, fname, fprice, num, vid));
	}

	public String removefmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmedao.deletefmenu(fid);
	}

	/*public boolean updatefmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmedao.updatefmenu(fid);
	}
*/
	public Fmenu searchfmenu(int fid) {
		// TODO Auto-generated method stub
		return this.fmedao.findfmenu(fid);
	}

	public List<Fmenu> searchAllfmenu() {
		// TODO Auto-generated method stub
		return this.fmedao.findAllfmenu();
	}

}
