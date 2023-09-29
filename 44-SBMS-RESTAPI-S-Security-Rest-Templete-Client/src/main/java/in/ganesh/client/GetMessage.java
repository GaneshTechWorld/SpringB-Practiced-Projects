package in.ganesh.client;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
public class GetMessage 
{
	
	public void getMsg()
	{
	 String url = "http://localhost:9091/wellcome";
     RestTemplate temp = new RestTemplate();
     
		
		  HttpHeaders headers = new HttpHeaders();
		  headers.setBasicAuth("admin","ganesh");
		 
		  HttpEntity<String> hdr = new HttpEntity<>(headers);
		  ResponseEntity<String> res = temp.exchange(url, HttpMethod.GET, hdr, String.class);
          String   bdy = res.getBody();  
		
          System.out.println(bdy);
	 
	}
     
}
