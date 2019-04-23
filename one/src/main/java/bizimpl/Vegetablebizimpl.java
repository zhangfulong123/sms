package bizimpl;

import java.util.List;

import biz.Vegetablebiz;
import dao.Vegetabledao;
import daoimpl.Vegetabledaoimpl;
import domain.Vegetable;

public class Vegetablebizimpl implements Vegetablebiz {

	private Vegetabledao vegdao;

	public Vegetablebizimpl() {
		super();
		this.vegdao = new Vegetabledaoimpl();
	}

	public String insertveg(int vid, String vname) {
		// TODO Auto-generated method stub
		return this.vegdao.addveg(new Vegetable(vid, vname));
	}

	public String removeveg(int vid) {
		// TODO Auto-generated method stub
		return  this.vegdao.deleteveg(vid);
	}

	/*public boolean updateveg(int vid) {
		// TODO Auto-generated method stub
		return  this.vegdao.updateveg( vid);
	}
*/
	public Vegetable searchveg(int vid) {
		// TODO Auto-generated method stub
		return this.vegdao.findveg(vid);
	}

	public List<Vegetable> searchAllveg() {
		// TODO Auto-generated method stub
		return this.vegdao.findAllveg();
	}

/*	@Override
	public boolean updateveg(int vid) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}
