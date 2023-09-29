package in.ganesh.webclinet;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GetMessage
{
   String url = "http://localhost:9091/wellcome";
	 
   public void getWlcmMessage()
   {
	   WebClient obj = WebClient.create();
	   
	   String block = obj.get()
			             .uri(url)
			             .headers(headers -> headers.setBasicAuth("admin","ganesh"))
			             .retrieve()
			             .bodyToMono(String.class)
			             .block();
	   
	   System.out.println(block);
	   
   }
}
