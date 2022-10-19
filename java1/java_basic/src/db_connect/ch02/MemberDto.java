package db_connect.ch02;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class MemberDto {

	@NonNull
	private String 이름;
	private String 영문이름;
	private String 지역;
	private String 인구;
	private String gdp;

}
