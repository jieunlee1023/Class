package db_connect.ch03;

import java.util.ArrayList;

public interface IEmployeeDao {

	// 해당 직함에 직원 이력 출력
	ArrayList<EmployeeDto> showTitleEmpInfo(String title);

	// 부서명을 받아서 해당 부서의 역대 매니저 정보 출력
	ArrayList<EmployeeDto> showManagerInfo(String deptName);

	// 이름을 받아서 연봉 받은 횟수 반환
	ArrayList<Integer> showSalarycount(String firstName, String lastName);

	// 현재 해당 직함을 가진 직원 수 반환
	int showTitleEmpCount(String title);

	// 직원이 가장 최근에 받은 연봉 (최고연봉) 반환
	int showSalary(String firstName, String lastName);

	// 중첩 서브쿼리를 사용하여, 첫 급여를 받은 날이 1990년도 이후인 사람들의 명수를 구하시오
	int showFirstSalaryPeople(String fromDate);

	// 사원번호 47978의 최고 연봉보다 큰 연봉을 받은 직원의 정보를 출력해라
	// 중첩쿼리를 사용하고 employees, salaries 테이블에서만 정보를 출력해라
	// ArrayList<EmployeeDto> showhighSalInfo(int empNum);

}
