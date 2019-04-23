package dao;

import java.util.List;

import domain.Fmenu;

public interface Fmenudao {

	String addfmenu(Fmenu fmenu);

	String deletefmenu(int fid);


	Fmenu findfmenu(int fid);

	List<Fmenu> findAllfmenu();

}
