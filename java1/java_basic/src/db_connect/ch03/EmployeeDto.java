package db_connect.ch03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

	private String empNo;
	private String deptNo;
	private String deptName;
	private String firstName;
	private String title;

	@Override
	public String toString() {
		return "EmployeeDto [직원번호=" + empNo + ", 부서번호=" + deptNo + ", 부서이름=" 
				     + deptName + ", 이름=" + firstName + ", 직함="+ title + "]";
	}

}
