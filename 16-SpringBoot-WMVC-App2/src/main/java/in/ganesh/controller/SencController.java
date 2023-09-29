package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SencController 
{
	@GetMapping("/hello")
	public ModelAndView mthd()
	{	
		ModelAndView obj = new ModelAndView();
		obj.addObject("ganu", "Ganesh Prabhakr Chaudhary");
		obj.setViewName("index");
		return obj;
	}

}
