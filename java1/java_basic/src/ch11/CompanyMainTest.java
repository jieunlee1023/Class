package ch11;

import java.util.Calendar;

public class CompanyMainTest {
	
	//코드의 시작점 (메인함수, 메인 쓰레드)
	public static void main(String[] args) {
		
//		Company company = new Company(); - > private!
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		
		company1.cId = 1;
		System.out.println(company2.cId);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
	}//end of main

}//end of class
