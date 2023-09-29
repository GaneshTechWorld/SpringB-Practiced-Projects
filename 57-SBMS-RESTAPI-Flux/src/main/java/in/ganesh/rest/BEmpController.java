package in.ganesh.rest;


import java.time.Duration;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.binding.Employee;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

@RestController
public class BEmpController 
{
	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<Employee>> getEvents() 
	{

		// creating binding object with data
		Employee event = new  Employee("ABC123","Ganesh");

		// creating stream for binding object
		Stream<Employee> customerStream = Stream.generate(() -> event);

		// create flux object using stream
		Flux<Employee> cflux = Flux.fromStream(customerStream);

		// setting response interval
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));
		
		// combine interval flux and customer event flux
		Flux<Tuple2<Long, Employee>> zip = Flux.zip(intervalFlux, cflux);
		
		// Getting Tuple value as T2
		Flux<Employee> fluxMap = zip.map(Tuple2::getT2);
		
		//sending response
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);
	}
}
