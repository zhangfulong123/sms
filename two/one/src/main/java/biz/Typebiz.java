package biz;

import java.util.List;

import domain.Type;

public interface Typebiz {

	String inserttype(int tid, String tname);

	List<Type> searchAlltype();

}
