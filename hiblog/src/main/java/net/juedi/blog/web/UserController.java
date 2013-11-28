package net.juedi.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping("/showuser")
	public String showUser(Model model){
		model.addAttribute("user", "duliaoyuan");
		return "user";
	}
}
