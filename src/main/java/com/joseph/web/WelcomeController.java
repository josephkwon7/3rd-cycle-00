package com.joseph.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/helloworld")
	public String welcome(Model model) {
		//System.out.println("name : " + name + " age : " + age);
		//model.addAttribute("name", name );
		//model.addAttribute("age", age );
		//List<MyModel> repo = Arrays.asList(new MyModel("javajigi"), new MyModel("sanjigi"), new MyModel("joseph"));
		//model.addAttribute("repo", repo);		
		

		return "welcome";
	}
}
