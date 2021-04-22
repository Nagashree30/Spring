package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Login {

	public Login() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/login" ,method=RequestMethod.POST)
	public String login(@RequestParam("name") String name, @RequestParam("pwd") String password,
			ModelMap model) {
		if("Nagashree".equalsIgnoreCase(name) && "nagu123".equalsIgnoreCase(password)) {
			System.out.println("Entered Username=" +name);
			System.out.println("Entered Password=" +password);
			model.addAttribute("name", name);
		
		return "welocme.jsp";
		}else {
			System.out.println("Entered Username=" +name);
			System.out.println("Entered Password=" +password);
			model.addAttribute("name", name);
			return "failure.jsp";
		}
	}
		
		
		@RequestMapping(value="/reg" ,method=RequestMethod.POST)
		public String register(@RequestParam("name") String name,@RequestParam("mail") String mail, @RequestParam("pwd") String password, ModelMap model) {
			if("Nagashree".equalsIgnoreCase(name) && "nagu123".equalsIgnoreCase(password)&& "nagu@gmail.com".equalsIgnoreCase(mail)) {
				System.out.println("Entered Username=" +name);
				System.out.println("Entered Password=" +password);
				System.out.println("Enteres Email=" +mail);
				model.addAttribute("name", name);
			
			return "welocme.jsp";
			}else {
				System.out.println("Entered Username=" +name);
				System.out.println("Entered Password=" +password);
				System.out.println("Enteres Email=" +mail);
				model.addAttribute("name", name);
				return "failure.jsp";
			}
	}

}
