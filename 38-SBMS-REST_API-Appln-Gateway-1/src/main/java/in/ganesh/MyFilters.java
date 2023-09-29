package in.ganesh;

import java.util.List;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilters implements GlobalFilter
{
	org.slf4j.Logger logger = LoggerFactory.getLogger(MyFilters.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) 
	{
		System.out.println("BHole");
		logger.info(" filters() method is executing...");
		//Access request information
		org.springframework.http.server.reactive.ServerHttpRequest req =  exchange.getRequest();
		
		org.springframework.http.HttpHeaders headers = req.getHeaders();
		
		Set<String> keyset = headers.keySet();
		
		keyset.forEach( key ->{
			List<String> values = headers.get(key);
			System.out.println(key+"::"+values);
		});
		return chain.filter(exchange);
	}
	


}


