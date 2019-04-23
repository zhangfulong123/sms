package dao;

import java.util.List;

import domain.Sale;

public interface Saledao {


	String addsal(Sale sale);

	List<Sale> findAllsal();

}
