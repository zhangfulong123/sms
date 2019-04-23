package dao;

import java.util.List;

import domain.Type;

public interface Typedao {

	String addtype(Type t);

	List<Type> findAlltype();

}
