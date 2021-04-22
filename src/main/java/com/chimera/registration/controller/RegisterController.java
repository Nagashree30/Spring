package com.chimera.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.chimera.registration.dto.RegisterDTO;
import com.chimera.registration.service.RegisterService;
@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	private RegisterService service;

	public RegisterController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(@ModelAttribute RegisterDTO dto, ModelMap model) {
		System.out.println("invoke register method");
		try {

			boolean vaidation = this.service.validateAndSave(dto);

			if (vaidation) {
				System.out.println("DETAILS = " + dto.toString());
				model.addAttribute("details", dto.toString());
			}

			else {
				String failMsg = "Can't able to Save  Details, Please enter vaid details!";
				model.addAttribute("faild", failMsg);
			}

		}

		catch (Exception e) {
			e.getMessage();
		}
		return "SaveSuccess";
	}

}
