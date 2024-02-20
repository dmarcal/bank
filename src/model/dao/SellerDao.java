package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Statement;

import model.dao.interfaces.SellerDaoI;
import model.entities.Department;
import model.entities.Seller;

public class SellerDao extends DbConnection implements SellerDaoI {

	private Connection conn;
	
	public SellerDao() {
		conn = getConnection();
	}

	@Override
	public void insert(Seller seller) {
		PreparedStatement st = null;
		try {
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, seller.getName());
			st.setString(2, seller.getEmail());
			st.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
			st.setDouble(4, seller.getBaseSalary());
			st.setInt(5, seller.getDepartment().getId());
			
			int rowsAffected = DbConnection.executeUpdate(st);
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					seller.setId(id);
				}
				st.close();
			}
			else {
				DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;

		}
	}

	@Override
	public void update(Seller seller) {
		PreparedStatement st = null;
		try {

			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+ "WHERE Id = ?");
			
			st.setString(1, seller.getName());
			st.setString(2, seller.getEmail());
			st.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
			st.setDouble(4, seller.getBaseSalary());
			st.setInt(5, seller.getDepartment().getId());
			st.setInt(6, seller.getId());
			
			DbConnection.executeUpdate(st);
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;

		}
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {

			st = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");
			
			st.setInt(1, id);
			
			DbConnection.executeUpdate(st);
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;
 
		}
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?");
			
			st.setInt(1, id);
			rs = DbConnection.executeQuery(st);
			if (rs.next()) {
				Department department = instantiateDepartment(rs);
				Seller obj = instantiateSeller(rs, department);
				return obj;
			}
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;
			rs=null;
		}
		return null;

	}

	private Seller instantiateSeller(ResultSet rs, Department department) throws SQLException {
		Seller seller = new Seller();
		seller.setId(rs.getInt("Id"));
		seller.setName(rs.getString("Name"));
		seller.setEmail(rs.getString("Email"));
		seller.setBaseSalary(rs.getDouble("BaseSalary"));
		seller.setBirthDate(rs.getDate("BirthDate"));
		seller.setDepartment(department);
		return seller;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "ORDER BY Name");
			
			rs = DbConnection.executeQuery(st);
			
			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>();
			
			while (rs.next()) {
				
				Department department = map.get(rs.getInt("DepartmentId"));
				
				if (department == null) {
					department = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), department);
				}
				
				Seller obj = instantiateSeller(rs, department);
				list.add(obj);
			}
			return list;
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;
			rs=null;

		}
		return null;

	}
	
	@Override
	public List<Seller> listAll(Seller seller) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller, department "
					+ "WHERE seller.DepartmentId = department.Id "
					+ "AND (seller.Id = ? OR " + Objects.isNull(seller.getId()) + ") "
					+ "AND (seller.Name LIKE ? OR " + Objects.isNull(seller.getName()) + ") "
					+ "AND (seller.BaseSalary = ? OR " + Objects.isNull(seller.getBaseSalary()) + ") "
		            + "AND (department.Id = ? OR " + (Objects.isNull(seller.getDepartment()) || Objects.isNull(seller.getDepartment().getId())) + ") "
					+ "AND (department.Name LIKE ? OR " + (Objects.isNull(seller.getDepartment()) || Objects.isNull(seller.getDepartment().getName())) + ") "
					+ "ORDER BY seller.Id");
			
			st.setInt(1, Objects.isNull(seller.getId()) ? 0 : seller.getId());
			st.setString(2, Objects.isNull(seller.getName()) ?"":"%"+seller.getName()+"%");
			st.setString(3, String.valueOf(Objects.isNull(seller.getBaseSalary()) ? 0 : seller.getBaseSalary()));
			st.setInt(4, (Objects.isNull(seller.getDepartment()) || Objects.isNull(seller.getDepartment().getId())) ? 0 : seller.getDepartment().getId());
			st.setString(5, (Objects.isNull(seller.getDepartment()) || Objects.isNull(seller.getDepartment().getName())) ? "" : "%"+seller.getDepartment().getName()+"%");
			rs = DbConnection.executeQuery(st);
			
			List<Seller> list = new ArrayList<>();     
			Map<Integer, Department> map = new HashMap<>();
			
			while (rs.next()) {
				
				Department department = map.get(rs.getInt("DepartmentId"));
				
				if (department == null) {
					department = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), department);
				}
				
				Seller obj = instantiateSeller(rs, department);
				list.add(obj);
			}
			return list;
		}
		catch (SQLException e) {
			DbException(e.getMessage());
		}
		finally {
			st=null;
			rs=null;
		}
		return null;

	}
	
}
