package model.dao.interfaces;

import model.dao.DepartmentDao;
import model.dao.SellerDao;


public class DaoFactory {

	public static SellerDaoI createSellerDao() {
		return new SellerDao();
	}
	
	public static DepartmentDaoI createDepartmentDao() {
		return new DepartmentDao();
	}
}
