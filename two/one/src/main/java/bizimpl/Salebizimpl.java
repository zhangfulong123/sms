package bizimpl;

import java.util.List;

import biz.Salebiz;
import dao.Saledao;
import daoimpl.Saledaoimpl;
import domain.Sale;

public class Salebizimpl implements Salebiz {

	private Saledao saldao;
	
	public Salebizimpl() {
		super();
		this.saldao = new Saledaoimpl();
	}
	public String insertsal(int fid, int num) {
		// TODO Auto-generated method stub
		return this.saldao.addsal(new Sale(fid, num));
	}

	public List<Sale> searchAllsal() {
		// TODO Auto-generated method stub
		return this.saldao.findAllsal();
	}

}
