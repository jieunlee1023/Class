package db_connect.ch02;

import java.util.ArrayList;

public class DbMainTest {

	public static void main(String[] args) {

		// DBHelper == DBClient
		// 인터페이스
		// Dto
		// 인터페이스 Dto
		MemberInfoSqlDao infoSqlDao = new MemberInfoSqlDao();

		// 1. selectAll
		System.out.println("-------------selectAll-------------");
		ArrayList<MemberDto> arrayList = infoSqlDao.selectAll();
		System.out.println(arrayList);

		// 2. select
		System.out.println("-------------select-------------");
		MemberDto memberDto = infoSqlDao.select("한국");
		if (memberDto == null) {
			System.out.println("요청하신 값으로는 정보를 찾을 수 없습니다.");
		} else {
			System.out.println(memberDto.get이름());
			System.out.println(memberDto.get영문이름());
			System.out.println(memberDto.get지역());
			System.out.println(memberDto.get인구());
			System.out.println(memberDto.getGdp());
		}
		// 3. insert
		System.out.println("-------------insert-------------");
		MemberDto memberDto2 = new MemberDto();
		memberDto2.set이름("대한민국");
		memberDto2.set영문이름("South Korea");
		memberDto2.set지역("아시아");
		memberDto2.set인구("10000000");
		memberDto2.setGdp("99999999");
		int resultQueryCount = infoSqlDao.insert(memberDto2);
		System.out.println("resultQueryCount : " + resultQueryCount);

		// 4. update
		System.out.println("-------------update-------------");
		MemberDto memberDto3 = new MemberDto();
		memberDto3.set이름("대한민국");
		memberDto3.set지역("아시아");
		infoSqlDao.update(memberDto3);

		// 5. delete
		System.out.println("-------------delete-------------");
		int deleteRowCount = infoSqlDao.delete("대한민국");
		System.out.println("deleteRowCount : " + deleteRowCount);
	}

}
