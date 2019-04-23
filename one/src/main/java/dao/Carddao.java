package dao;

import domain.Card;

public interface Carddao {

	String addcard(Card card);

	String deletecard(int cid);

	Card findcard(int cid);

	boolean updatecardmoney(int cid, double cprice);

}
