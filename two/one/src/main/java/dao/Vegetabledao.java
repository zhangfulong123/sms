package dao;

import java.util.List;

import domain.Vegetable;

public interface Vegetabledao {

	String addveg(Vegetable vegetable);

	String deleteveg(int vid);

	Vegetable findveg(int vid);

	List<Vegetable> findAllveg();

}
