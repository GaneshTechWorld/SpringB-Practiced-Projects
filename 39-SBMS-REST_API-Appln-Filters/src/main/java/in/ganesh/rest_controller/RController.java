package in.ganesh.rest_controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController
{
     @GetMapping("/msg/{name}")
     public String  getMessage(@PathParam(value="name") String  name)
     {
    	 System.out.println(name);
    	 return name+"  Kuch nhi sirf time pass ke liye likha he........";
     }
   
}
