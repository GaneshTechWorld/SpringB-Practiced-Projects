package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController 
{

	@GetMapping("/welcome")
	public ModelAndView mthd()
	{
	  ModelAndView obj = new  ModelAndView();
	  obj.addObject("msg","Bhole Baba Ki Jay");
	  obj.setViewName("/index");
	  return obj;
	}
}
