package ch11;

public class Employee {
	
	public static int serialNum;
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee () {
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String deparment) {
		this.department = deparment;
	}

}