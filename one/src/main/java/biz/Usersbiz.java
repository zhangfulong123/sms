package biz;

import java.util.List;

import domain.Users;

public interface Usersbiz {

	String insertuser(int id, String uname, int cid, int uphone);

	List<Users> searchAlluser();

}
