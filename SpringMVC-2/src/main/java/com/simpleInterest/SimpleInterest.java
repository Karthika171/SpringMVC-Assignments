package com.simpleInterest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterest {

	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public String showLoginPage() {
		return "first";
	}

	@RequestMapping(value = "/simple", method = RequestMethod.POST)
	public String handleUserLogin(@RequestParam int r, @RequestParam int n, @RequestParam int p,
			ModelMap model) {
		int si = (r * n * p) / 100;
		model.put("interest", si);
		return "simpleInterest";
	}
}
