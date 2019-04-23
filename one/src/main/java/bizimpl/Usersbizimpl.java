package bizimpl;

import java.util.List;

import biz.Usersbiz;
import dao.Usersdao;
import daoimpl.Userdaoimpl;
import domain.Users;

public class Usersbizimpl implements Usersbiz {

	private Usersdao userdao;

	public Usersbizimpl() {
		super();
		this.userdao = new Userdaoimpl();
	}

	public String insertuser(int id, String uname, int cid, int uphone) {
		// TODO Auto-generated method stub
		return this.userdao.adduser(new Users(id, uname, cid, uphone));
	}

	public List<Users> searchAlluser() {
		// TODO Auto-generated method stub
		return this.userdao.findAlluser();
	}

}
