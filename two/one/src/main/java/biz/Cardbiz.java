package biz;

import domain.Card;

public interface Cardbiz {

	String insertcard(int cid, String state, int tid, int scoring, double cprice, double cquota);

	String removecard(int cid);

	Card searchcard(int cid);

	boolean updatecardmoney(int cid, double cprice);

	boolean updatecardstate(int cid, String state);

}
