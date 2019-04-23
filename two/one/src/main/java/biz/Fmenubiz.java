package biz;

import java.util.List;

import domain.Fmenu;

public interface Fmenubiz {

	String insertfmenu(int fid, String fname, double fprice, int num, int vid);

	String removefmenu(int fid);

	//boolean updatefmenu(int fid);

	Fmenu searchfmenu(int fid);

	List<Fmenu> searchAllfmenu();

}
