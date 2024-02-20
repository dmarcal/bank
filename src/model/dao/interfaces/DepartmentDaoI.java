package model.dao.interfaces;

import java.util.List;

import model.entities.Department;

public interface DepartmentDaoI {

	void insert(Department department);
	void update(Department department);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	List<Department> select(Department department);

}
