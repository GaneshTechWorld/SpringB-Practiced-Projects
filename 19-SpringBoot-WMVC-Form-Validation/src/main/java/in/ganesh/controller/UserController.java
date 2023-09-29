package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.entity.User;
import jakarta.validation.Valid;

@Controller
public class UserController 
{
    @GetMapping("/")
    public String mthdFirst(Model model)
    {
      User user1 = new User();
      model.addAttribute("user",user1);
      return "index";
    }
    
    @PostMapping("/user")
    public String mthdFirst( @Valid User user1,BindingResult result,Model model)
    {
    	if(result.hasErrors())
    	{
    		return "index";
    	}
      System.out.println(user1);
      model.addAttribute("mag","Submitted Succesfully...............");
      return "success";
    }

    
}
