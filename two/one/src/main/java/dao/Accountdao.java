package dao;

import java.util.List;

import domain.Account;

public interface Accountdao {

	String addacc(Account account);

	boolean deleteacc(int fid);

	boolean updeteacc(int aid,int anum,int fid);

	List<Account> findAllacc(String uuid);

	boolean deleteAllacc(String uuid);

	double moneyacc(String uuid,int cid);



}
