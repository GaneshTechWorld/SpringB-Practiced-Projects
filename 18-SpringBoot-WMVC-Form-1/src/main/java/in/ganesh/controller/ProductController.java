package in.ganesh.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model ;
import in.ganesh.entity.Product;

@Controller
public class ProductController 
{
	@GetMapping("/")
	public String mthdFirst(Model model)
	{
		Product p1 = new Product();
		
		model.addAttribute("product",p1);
		//view File Name
		return "index";
	}
	
	@PostMapping("/product")
	public String handleFormSubmit(Product product,Model model )
	{
		System.out.println(product);
		model.addAttribute("msg","Product Info Added Succesfully");
		return "success";
	}
}
