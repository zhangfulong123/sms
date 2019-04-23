package bizimpl;

import java.util.List;

import biz.Typebiz;
import dao.Typedao;
import daoimpl.Typedaoimpl;
import domain.Type;

public class Typebizimpl implements Typebiz {

	private Typedao typedao;

	public Typebizimpl() {
		super();
		this.typedao = new Typedaoimpl();
	} 

	public String inserttype(int tid, String tname) {
		// TODO Auto-generated method stub
		return this.typedao.addtype(new Type(tid, tname));
	}

	public List<Type> searchAlltype() {
		// TODO Auto-generated method stub
		return this.typedao.findAlltype();
	}

}
