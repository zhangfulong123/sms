package biz;

import java.util.List;

import domain.Sale;

public interface Salebiz {

	String insertsal(int fid, int num);

	List<Sale> searchAllsal();

}
