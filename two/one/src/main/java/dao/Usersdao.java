package dao;

import java.util.List;

import domain.Users;

public interface Usersdao {

	String adduser(Users users);

	List<Users> findAlluser();

}
