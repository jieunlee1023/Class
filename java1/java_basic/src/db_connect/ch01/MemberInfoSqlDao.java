package db_connect.ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberInfoSqlDao implements IMemberInfoDao {

	private static final String TABLE_NAME = "memberTBL";
	private DBClient client;
	private Connection connection;

	public MemberInfoSqlDao() {
		client = DBClient.getInstance();
	}

	// executeQuery
	// executeUpdate

	@Override
	public ArrayList<MemberDto> selectAll() {

		// 전체 select 하는 쿼리 코드 작성
		// 연결해서 쿼리 날리고 결과 받고 해제
		connection = client.getConnection();

		ArrayList<MemberDto> resultData = new ArrayList<>();
		String sqlFormat = "SELECT * FROM %s";
		String sql = String.format(sqlFormat, TABLE_NAME);

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setMemberId(rs.getString(1));
				dto.setMemberName(rs.getString(2));
				dto.setMemberAddress(rs.getString(3)); // 인덱스 넘버로
				resultData.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDb(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultData;

	}

	@Override
	public MemberDto select(String memberId) {

		connection = client.getConnection();
		MemberDto dto = null;

		String sqlFormat;
		String sql;
		sqlFormat = " SELECT * FROM %s WHERE memberId = '%s' ";
		sql = String.format(sqlFormat, TABLE_NAME, memberId);

		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto = new MemberDto();
				dto.setMemberId(rs.getString("memberId")); // -----★ int인 경우 getInt (타입을 맞춰줘야함)
				dto.setMemberName(rs.getString("memberName"));
				dto.setMemberAddress(rs.getString("memberAddress"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					closeDb(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return dto;
	}

	@Override
	public int insert(MemberDto dto) {

		connection = client.getConnection();
		String sqlFormat = "insert into %s values('%s', '%s', '%s')";
		String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberId(), dto.getMemberName(),
				dto.getMemberAddress());
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDb(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int update(MemberDto dto) {
		// 선행 검사 -- 먼저 select 해서 확인 이후에 데이터를 변경 해주는 것이 좋다.
		MemberDto contextDto = select(dto.getMemberId());
		Statement stmt = null;
		int result = 0;

		connection = client.getConnection();
		// -----★ 선행 검사 후 연결해야 올바른 결과 값 도출 됨
		if (true) {
			String sqlFormat = "UPDATE %s SET memberName = '%s' WHERE memberID = '%s' ";
			String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberName(), dto.getMemberId());

			try {
				stmt = connection.createStatement();
				result = stmt.executeUpdate(sql);

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					closeDb(stmt);
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
		connection = client.getConnection();
		String sqlFormat = "DELETE FROM %s WHERE memberId = '%s' ";
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
				closeDb(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	private void closeDb(Statement stmt) throws SQLException {
		stmt.close();
		connection.close();
		DBClient.connectClose();
	}
}