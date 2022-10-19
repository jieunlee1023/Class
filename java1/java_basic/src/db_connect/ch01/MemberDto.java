package db_connect.ch01;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
// (getter,setter,빌더패턴 만들어줌)
@RequiredArgsConstructor
// 모든 멤버 변수를 넣어야하는 ..!
@NoArgsConstructor
//기본 생성자 만듬

//두개가 서로 충돌됨 -> @Nonnull 붙이면 사용가능

public class MemberDto {

	@NonNull
	private String memberId;
	@NonNull
	private String memberName;
	private String memberAddress;

}
