package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FisrtController 
{
	@GetMapping("/bhole")
	public ModelAndView getMthd()
	{
		ModelAndView obj = new ModelAndView();
		obj.addObject("msg","Shree Shivay Namo Sthubhuyam");
	   obj.setViewName("index");
		return obj;
	}

}
