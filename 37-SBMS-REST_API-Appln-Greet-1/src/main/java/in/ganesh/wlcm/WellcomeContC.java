package in.ganesh.wlcm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELLCOME-API")
public interface WellcomeContC
{
	@GetMapping("/wellcome")
  public String getWellcomeMsg(); 
}
