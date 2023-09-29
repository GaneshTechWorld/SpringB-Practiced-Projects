package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController 
{
	@GetMapping("java")
	public ModelAndView wJava()
	{
		 ModelAndView obj = new  ModelAndView();
		 obj.addObject("Java", "Java ke duniya me apka swagat he........");
		 obj.setViewName("java");
		 return obj;
	}
	
	
	@GetMapping("python")
	public ModelAndView wPython()
	{
		 ModelAndView obj = new  ModelAndView();
		 obj.addObject("Python", "Python ke duniya me apka swagat he........");
		 obj.setViewName("python");
		 return obj;
	}
	
	@GetMapping("/")
	public ModelAndView wWellcome()
	{
		 ModelAndView obj = new  ModelAndView();
		 obj.addObject("Wellcome", "...............Wellocme................");
		 obj.setViewName("index");
		 return obj;
	}

}
