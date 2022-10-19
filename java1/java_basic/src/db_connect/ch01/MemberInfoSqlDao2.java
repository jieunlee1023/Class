//package db_connect.ch01;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class MemberInfoSqlDao2 implements IMemberInfoDao {
//
//	private static final String TABLE_NAME = "memberTBL";
//	private DBClient client;
//	private Connection connection;
//
//	public MemberInfoSqlDao2() {
//		client = DBClient.getInstance();
//		// connection = client.getConnection();
//	}
//
//	// executeQuery
//	// executeUpdate
//
//	@Override
//	public ArrayList<MemberDto> selectAll() {
//
//		// 전체 select 하는 쿼리 코드 작성
//		// 연결해서 쿼리 날리고 결과 받고 해제
//		connection = client.getConnection();
//
//		ArrayList<MemberDto> resultData = new ArrayList<>();
//		String sqlFormat = "SELECT * FROM %s";
//		String sql = String.format(sqlFormat, TABLE_NAME);
//
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			stmt = connection.createStatement();
//			rs = stmt.executeQuery(sql);
//			while (rs.next()) {
//				MemberDto dto = new MemberDto();
//				dto.setMemberId(rs.getString(1));
//				dto.setMemberName(rs.getString(2));
//				dto.setMemberAddress(rs.getString(3)); // 인덱스 넘버로
//				resultData.add(dto);
//
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				closeDb(stmt);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return resultData;
//
//	}
//
//	private void closeDb(Statement stmt) throws SQLException {
//		stmt.close();
//		connection.close();
//		DBClient.connectClose();
//	}
//
//	@Override
//	public MemberDto select(String memberId) {
//
//		// memberId select 하는 쿼리 코드 작성
//		// 연결해서 쿼리 날리고 결과 받고 해제
//		connection = client.getConnection();
//		MemberDto dto = null;
//		// 쿼리문을 생성
//		// 결과를 받아야한다.
//		String sqlFormat;
//		String sql;
//		sqlFormat = " SELECT * FROM %s WHERE memberId = '%s' ";
//		sql = String.format(sqlFormat, TABLE_NAME, memberId);
//
//		// SQL 구문 객체를 만들어 주어야 하낟.
//		Statement stmt = null;
//		// 결과를 받을 수 있는 객체를 만들어 주어야 한다.
//		ResultSet rs = null;
//		try {
//			stmt = connection.createStatement();
//			rs = stmt.executeQuery(sql);
//
//			while (rs.next()) {
//				dto = new MemberDto();
//				dto.setMemberId(rs.getString("memberId")); // int인 경우 getInt (타입을 맞춰줘야함)
//				dto.setMemberName(rs.getString("memberName"));
//				dto.setMemberAddress(rs.getString("memberAddress"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (stmt != null) {
//				try {
//					closeDb(stmt);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		return dto;
//	}
//
//	@Override
//	public int insert(MemberDto dto) {
//		// MemberDto를 넘겨 받아 db에 저장하는 기능 구현
//		connection = client.getConnection();
//		String sqlFormat = "insert into %s values('%s', '%s', '%s')";
//		String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberId(), dto.getMemberName(),
//				dto.getMemberAddress());
//		Statement stmt = null;
//		int result = 0;
//		try {
//			stmt = connection.createStatement();
//			result = stmt.executeUpdate(sql);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				closeDb(stmt);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
//
//	@Override
//	public int update(MemberDto dto, String memberId) {
//		// 선행 검사 -- 먼저 select 해서 확인 이후에 데이터를 변경 해주는 것이 좋다.
//		MemberDto contextDto = select(dto.getMemberId());
//
//		Statement stmt = null;
//		int result = 0;
//
//		connection = client.getConnection();
//		if (true) {
//			String sqlFormat = "UPDATE %s SET memberID = '%s' WHERE memberID = '%s' ";
//			String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberId(), memberId);
//
//			System.out.println(sql);
//			System.out.println("memberId:" + memberId);
//
//			try {
//				stmt = connection.createStatement();
//				result = stmt.executeUpdate(sql);
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					closeDb(stmt);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//
//		} else {
//			System.out.println("해당하는 레코드가 존재 하지 않습니다.");
//		}
//
//		return result;
//	}
//
//	@Override
//	public int delete(String memberId) {
//		connection = client.getConnection();
//		String sqlFormat = "DELETE FROM %s WHERE memberId = '%s' ";
//		String sql = String.format(sqlFormat, TABLE_NAME, memberId);
//
//		int result = 0;
//		Statement stmt = null;
//
//		try {
//			stmt = connection.createStatement();
//			// executeUpdate -- 매개변수 String 하나를 전달하는 녀석
//			// result Type int 값을 반환 : 삭제한 행의 갯수를 반환 하는 녀석이다.
//			result = stmt.executeUpdate(sql);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				closeDb(stmt);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return result;
//	}
//
//}