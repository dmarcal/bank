package application;

import java.util.List;
import java.util.Scanner;
import java.util.Date;

import model.dao.interfaces.DaoFactory;
import model.dao.interfaces.SellerDaoI;
import model.dao.interfaces.DepartmentDaoI;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n=== TEST 1: seller list =====");
		SellerDaoI sellerDao = DaoFactory.createSellerDao();
		Seller seller = new Seller();
		//Department department =null;
		//department = new Department();
		//department.setId(2);
		//department.setName("computers");
		//seller.setDepartment(department);
		//seller.setBaseSalary(3000.0);
		//seller.setName("alex");

		List<Seller> list = sellerDao.listAll(seller);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		sellerDao=null;
		seller=null;
		//department=null;
		list=null;

     	/*
		System.out.println("=== TEST 2: seller findById =====");
		SellerDaoI sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		sellerDao=null;
		seller=null;
		*/

		/*
  		System.out.println("\n=== TEST 3: seller findAll =====");
     	SellerDaoI sellerDao = DaoFactory.createSellerDao();
		List<Seller> list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		sellerDao=null;
		list=null;
		*/

		/*
		System.out.println("\n=== TEST 4: seller insert =====");
		SellerDaoI sellerDao = DaoFactory.createSellerDao();
		DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(1);
		Seller newSeller = new Seller(null, "Greg Ray", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		sellerDao=null;
		departmentDao=null;
		department=null;
		newSeller=null;
		*/

		/*
		System.out.println("\n=== TEST 5: seller update =====");
     	SellerDaoI sellerDao = DaoFactory.createSellerDao();
		Seller seller = new Seller();
		seller = sellerDao.findById(7);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		sellerDao=null;
		seller=null;
		*/

     	/*
     	System.out.println("\n=== TEST 6: seller delete =====");
     	SellerDaoI sellerDao = DaoFactory.createSellerDao();
  		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sellerDao=null;
		*/

		/*
		System.out.println("\n=== TEST 1: department select =======");
     	DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();
		department.setId(2);
		List<Department> list2 = departmentDao.select(department);
		for (Department d : list2) {
			System.out.println(d);
		}
		departmentDao=null;
		department=null;
		*/

		/*
		System.out.println("\n=== TEST 2: department findAll =======");
     	DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		departmentDao=null;
		*/

		/*
		System.out.println("\n=== TEST 3: department insert =======");
      	DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		Department newDepartment = new Department();
		newDepartment.setName("TI");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		departmentDao=null;
		newDepartment=null;
		*/

		/*
		System.out.println("\n=== TEST 4: update =======");
		DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(5);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed");
		departmentDao=null;
		department=null;
		*/

		/*
		System.out.println("\n=== TEST 5: department delete =======");
     	DepartmentDaoI departmentDao = DaoFactory.createDepartmentDao();
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		departmentDao=null;
		 */

		//sc.close();
	}

}
