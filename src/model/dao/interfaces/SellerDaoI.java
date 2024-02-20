package model.dao.interfaces;

import java.util.List;

import model.entities.Seller;

public interface SellerDaoI {

	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> listAll(Seller seller);

}
