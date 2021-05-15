package EmployeeDetails;

public class Employee {

	int empid;
	String empname;
	String empdept;
	String empdesignation;
	Long empsalary;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empdesignation=" + empdesignation
				+ ", empsalary=" + empsalary + "]";
	}

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public String getempdept() {
		return empdept;
	}

	public void setempdept(String empdept) {
		this.empdept = empdept;
	}

	public String getempdesignation() {
		return empdesignation;
	}

	public void setempdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

	public Long getempsalary() {
		return empsalary;
	}

	public void setempsalary(Long empsalary) {
		this.empsalary = empsalary;
	}

}
