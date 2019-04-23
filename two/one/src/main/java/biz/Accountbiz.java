package biz;

import java.util.List;

import domain.Account;

public interface Accountbiz {

	String insertacc(int fid, int anum, int aid, String uuid);

	String removeacc(int fid);

	boolean updateacc(int aid,int anum,int fid);

	List<Account> searchacc(String uuid);

	boolean removeAllacc(String uuid);

	double moneyacc(String uuid,int cid);

}
