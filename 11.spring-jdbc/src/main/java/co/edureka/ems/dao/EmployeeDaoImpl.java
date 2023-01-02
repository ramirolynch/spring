package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values(" + emp.getEmployeeNo() + ",'" + emp.getEmployeeName() + "', "
				+ emp.getEmployeeSal() + ")";
		int employeeSaved = jt.update(sql);
		return employeeSaved;
	}

	public Integer updateEmployee(Employee emp) {
		String sql = "update emp set ename='" + emp.getEmployeeName() + "',sal=" + emp.getEmployeeSal()
				+ " where empno=" + emp.getEmployeeNo();
		Integer employeesUpdated = jt.update(sql);
		return employeesUpdated;
	}

	public Integer deleteEmployeeByNo(Integer eno) {
		String sql = "delete from emp where empno =" + eno;
		Integer employeesDeleted = jt.update(sql);
		return employeesDeleted;
	}

	public Employee findEmployeeByNo(final Integer eno) {
		String sql = "select ename, sal from emp where empno=" + eno;
		try {
			Employee emp = jt.queryForObject(sql, new RowMapper<Employee>() {

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);

					return new Employee(eno, name, sal);
				}
			});
			return emp;
		} catch (Exception ex) {
			return null;
		}		
	}

	public List<Employee> findAllEmployees() {
		String sql = "select * from emp";
		List<Employee> employees = jt.query(sql, new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emps = new ArrayList<Employee>();
				while (rs.next()) {
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					float sal = rs.getFloat(3);

					Employee emp = new Employee(eno, name, sal);
					emps.add(emp);
				}
				return emps;
			}

		});
		return employees;
	}

}
