package EmployeeManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Database.EmployeeDAO;
import Database.EmployeeDAOImpl;

@Controller
public class DeleteEmp {

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String showLoginPage() {
		return "delFirst";
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public String showe(Model model, @RequestParam int empid) {
		EmployeeDAO emp = new EmployeeDAOImpl();
		emp.delete(empid);
		model.addAttribute("message", "Record Deleted Successfully");
		return "final";
	}
}
