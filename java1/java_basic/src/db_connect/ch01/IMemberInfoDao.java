package db_connect.ch01;

import java.util.ArrayList;

public interface IMemberInfoDao {

	// 기능 정의 C R U D
	// 매개변수가 없으면 전체 선택, 삭제, 수정이 됨

	ArrayList<MemberDto> selectAll();
	MemberDto select(String memberId);
	int insert(MemberDto dto);
	int update(MemberDto dto);
	//int update(MemberDto dto, String memberId); // primary key 값을 변경하기 위한
	int delete(String memberId);

}
