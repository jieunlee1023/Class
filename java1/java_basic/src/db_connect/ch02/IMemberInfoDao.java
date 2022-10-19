package db_connect.ch02;

import java.util.ArrayList;

public interface IMemberInfoDao {

	ArrayList<MemberDto> selectAll();

	MemberDto select(String memberId);

	int insert(MemberDto dto);

	int update(MemberDto dto);

	int delete(String memberId);

}
