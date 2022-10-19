package db_connect.ch03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao implements IEmployeeDao {

	private DBHelper dbHelper;
	private Connection connection;
	// private Statement statement;
	private PreparedStatement preparedStatement;
	// 캐쉬기능 : 한번 사용했으면 메모리공간 어딘가에 저장해뒀다가, 또 부를 때 HDD까지 가지 않고 불러옴
	private ResultSet resultSet;

	public EmployeeDao() {
		this.dbHelper = DBHelper.getInstance();
	}

	@Override
	public ArrayList<EmployeeDto> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDto> resultList = new ArrayList<>();

		String sql = " SELECT *" 
				+ "			FROM employees AS A" 
				+ "			INNER JOIN titles AS B"
				+ "			ON A.emp_no = B.emp_no" 
				+ "			WHERE B.title = ? ";

		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setTitle(resultSet.getString("title"));
				resultList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// resultSet.close();
				preparedStatement.close();
				connection.close();
				dbHelper.connectionClose();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	@Override
	public ArrayList<EmployeeDto> showManagerInfo(String deptName) {
		ArrayList<EmployeeDto> resultList = new ArrayList<>();

		String sql = "SELECT * " 
						  + "FROM departments AS D " 
						  + "INNER JOIN dept_manager AS DM "
						  + "ON D.dept_no = DM.dept_no " 
						  + "WHERE D.dept_name = ? ";

		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, deptName);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setDeptNo(resultSet.getString("dept_no"));
				dto.setDeptName(resultSet.getString("dept_name"));
				dto.setEmpNo(resultSet.getString("emp_no"));

				resultList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return resultList;
	}

	@Override
	public ArrayList<Integer> showSalarycount(String firstName, String lastName) {

		ArrayList<Integer> list = new ArrayList<>();
		String sql = " SELECT count(E.emp_no) " 
		                  + " FROM employees AS E " 
				          + " INNER JOIN salaries AS S "
			           	  + " ON E.emp_no = S.emp_no "  
				          + " WHERE E.first_name = ? " 
			           	  + " and E.last_name = ? "
				          + " GROUP BY E.emp_no ";

		System.out.println(sql);
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int a = resultSet.getInt("count(E.emp_no)");
				list.add(a);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int showTitleEmpCount(String title) {
		int result = 0;

		String sql = " SELECT count(E.emp_no) AS C " 
		                  + " FROM employees AS E " 
				          + " INNER JOIN titles AS T "
			           	  + " ON E.emp_no = T.emp_no " 
				          + " WHERE T.title = ? "
                          + " GROUP BY T.title ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				result = resultSet.getInt("C");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;

	}

	@Override
	public int showSalary(String firstName, String lastName) {

		int result = 0;
		String sql = "SELECT max(S.salary) AS MAX " 
						+ " FROM employees AS E " 
						+ " JOIN salaries AS S "
						+ " ON E.emp_no = S.emp_no " 
						+ " WHERE E.first_name = ? " 
						+ " and E.last_name= ? ";
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				result = resultSet.getInt("MAX");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;
	}

	
	@Override
	public int showFirstSalaryPeople(String fromDate) {
		int result = 0;

		String sql = " SELECT count(emp_no) "
				+ " FROM employees "
				+ " WHERE emp_no in (SELECT emp_no "
				+ "		                   		  FROM salaries "
				+ "				                  WHERE from_date >= ? )";
		System.out.println(sql);
		try {
			preparedStatement = dbHelper.getConnection().prepareStatement(sql);
			preparedStatement.setString(1, fromDate);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while(resultSet.next()) {
				result = resultSet.getInt("count(emp_no)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;
	}

	

}
