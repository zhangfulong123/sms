package biz;

import java.util.List;

import domain.Vegetable;

public interface Vegetablebiz {

	String insertveg(int vid, String vname);

	String removeveg(int vid);

	//boolean updateveg(int vid);

	Vegetable searchveg(int vid);

	List<Vegetable> searchAllveg();

}
