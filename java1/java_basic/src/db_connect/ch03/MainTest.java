package db_connect.ch03;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {

		// 1. 해당 직함에 직원 이력 출력
//		EmployeeDao dao = new EmployeeDao();
//		ArrayList<EmployeeDto> eList = dao.showTitleEmpInfo("Staff");
//		for (EmployeeDto employeeDto : eList) {
//			System.out.println(employeeDto);
//		}

		// 2. 부서명을 받아서 해당 부서의 역대 매니저 정보 출력
//		EmployeeDao dao = new EmployeeDao();
//		ArrayList<EmployeeDto> eList = dao.showManagerInfo("Development");
//		for (EmployeeDto employeeDto : eList) {
//			System.out.println(employeeDto);
//		}

		// 3. 이름을 받아서 연봉 받은 횟수 반환
//		EmployeeDao dao = new EmployeeDao();
//		ArrayList<Integer> result = dao.showSalarycount("Georgi", "Facello");
//		System.out.println("연봉 받은 횟수는 " + result);
		
		// 4. 현재 해당 직함을 가진 직원 수 반환
//		EmployeeDao dao = new EmployeeDao();
//		int result = dao.showTitleEmpCount("Engineer");
//		System.out.println("직원 수 : " + result);

		
		// 5. 직원이 가장 최근에 받은 연봉 (최고연봉) 반환
//		EmployeeDao dao = new EmployeeDao();
//		int result = dao.showSalary("Georgi", "Facello");
//		System.out.println(" 최고 연봉 : " + result);
		
		//6.중첩 서브쿼리를 사용하여, 첫 급여를 받은 날이 1990년도 이후인 사람들의 명수를 구하시오
//		EmployeeDao dao = new EmployeeDao();
//		int result = dao.showFirstSalaryPeople("1990-01-01");
//		System.out.println(" 첫 급여 날짜가 1990년도 이후인 사람의 명수 : " + result);
		
		// 7. 	사원번호 47978의 최고 연봉보다 큰 연봉을 받은 직원의 정보를 출력해라
		// 중첩쿼리를 사용하고 employees, salaries 테이블에서만 정보를 출력해라
	}

}
