package EmployeeManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;
import EmployeeDetails.Employee;

@Controller
public class UpdateEmp {

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "updateFirst";
	}

	@RequestMapping(value = "/upEmployee", method = RequestMethod.POST)
	public String show(@RequestParam int eid, @ModelAttribute("employee") Employee employee) {
		System.out.println(eid);
		EmployeeDAO emp = new EmployeeDAOImpl();
		Employee myEmployee = emp.getEmployee(eid);
		employee.setempid(myEmployee.getempid());
		employee.setempname(myEmployee.getempname());
		employee.setempdept(myEmployee.getempdept());
		employee.setempdesignation(myEmployee.getempdesignation());
		employee.setempsalary(myEmployee.getempsalary());
		return "updateSecond";
	}

	@RequestMapping(value = "/updateemployee", method = RequestMethod.POST)
	public String show(Model model, @ModelAttribute Employee e) {
		EmployeeDAO emp = new EmployeeDAOImpl();
		emp.update(e);
		model.addAttribute("message", "Updated");
		return "final";
	}

}
