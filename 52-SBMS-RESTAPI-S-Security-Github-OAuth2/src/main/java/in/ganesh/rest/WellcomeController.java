package in.ganesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController
{

	@GetMapping("/")
	public String getMessage()
	{
		return "Wellcome To Bhole's World........";
	}
}
