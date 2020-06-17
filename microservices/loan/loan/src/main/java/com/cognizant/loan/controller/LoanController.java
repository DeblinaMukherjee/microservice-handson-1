package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	@GetMapping("/loans/{number}")
	public String getLoanDetails(@PathVariable String number)
	{
		String str = "number: "+number+", type: car, loan: 400000, emi: 3258, tenure: 18";
		return str;
	}
}
