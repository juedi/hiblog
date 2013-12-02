package net.juedi.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping("/show")
	public ModelAndView showUser(String index){
		ModelAndView mav = new ModelAndView("user");
		System.out.println(index);
		mav.addObject("user", "duliaoyuan");
		mav.addObject("hello world");
		
		return mav;
	}
}
