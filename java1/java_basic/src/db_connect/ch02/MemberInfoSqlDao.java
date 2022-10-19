package db_connect.ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberInfoSqlDao implements IMemberInfoDao {

	private static final String TABLE_NAME = "국가";
	private DBHelper helper;
	private Connection connection;

	public MemberInfoSqlDao() {
		helper = DBHelper.getInstance();
	}

	@Override
	public ArrayList<MemberDto> selectAll() {

		connection = helper.getConnection();

		ArrayList<MemberDto> list = new ArrayList<>();
		String sqlFromat = "SELECT * FROM %s";
		String sql = String.format(sqlFromat, TABLE_NAME);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.set이름(rs.getString("이름"));
				dto.set영문이름(rs.getString("영문이름"));
				// dto.set인구(rs.getString("인구"));
				// dto.setGdp(rs.getString("Gdp"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	private void closeDB(Statement stmt) throws SQLException {
		stmt.close();
		connection.close();
		DBHelper.connectClose();
	}

	@Override
	public MemberDto select(String memberId) {

		connection = helper.getConnection();
		MemberDto dto = null;

		String sqlFromat;
		String sql;

		sqlFromat = "SELECT * FROM %s WHERE 이름 = '%s'";
		sql = String.format(sqlFromat, TABLE_NAME, memberId);

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto = new MemberDto();
				dto.set이름(rs.getString("이름"));
				dto.set영문이름(rs.getString("영문이름"));
				dto.set인구(rs.getString("인구"));
				dto.setGdp(rs.getString("Gdp"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return dto;
	}

	@Override
	public int insert(MemberDto dto) {
		connection = helper.getConnection();
		String sqlFormat = "INSERT INTO %s VALUES('%s' , '%s' , '%s', '%s', '%s')";
		String sql = String.format(sqlFormat, TABLE_NAME, dto.get이름(), dto.get영문이름(), dto.get지역(), dto.get인구(),
				dto.getGdp());
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int update(MemberDto dto) {
		MemberDto contextDto = select(dto.get이름());
		Statement stmt = null;
		int result = 0;

		connection = helper.getConnection();
		if (true) {
			String sqlFormat = "UPDATE %s SET 지역 = '%s' WHERE 이름 ='%s' ";
			String sql = String.format(sqlFormat, TABLE_NAME, dto.get지역(), dto.get이름());
			System.out.println(sql);
			try {
				stmt = connection.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					closeDB(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("해당하는 레코드가 존재 하지 않습니다.");
		}
		return result;
	}

	@Override
	public int delete(String memberId) {
		connection = helper.getConnection();
		String sqlFormat = "DELETE FROM %s WHERE 이름 = '%s' ";
		String sql = String.format(sqlFormat, TABLE_NAME, memberId);

		int result = 0;
		Statement stmt = null;

		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDB(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;

	}

}
