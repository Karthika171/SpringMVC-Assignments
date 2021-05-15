package rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import EmployeeDetails.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp = new Employee();
		emp.setempid(rs.getInt("empid"));
		emp.setempname(rs.getString("empname"));
		emp.setempdept(rs.getString("empdept"));
		emp.setempdesignation(rs.getString("empdesignation"));
		emp.setempsalary(rs.getLong("empsalary"));

		return emp;
	}

}
