package com.SpringBoot.CoffeeApplication.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.CoffeeApplication.Entity.Coffee;
import com.SpringBoot.CoffeeApplication.Repository.CoffeeRepository;

@RestController
@RequestMapping("/coffees")
public class RestApiCoffeeController {
//	private List<Coffee> coffees = new ArrayList<>();

//	public RestApiCoffeeController() {
//		coffees.addAll(List.of(new Coffee("Columbian"), new Coffee("Cereza"), new Coffee("Ganador")));
//	}

	private final CoffeeRepository coffeeRepository;
	public RestApiCoffeeController(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
		
//		this.coffeeRepository.saveAll(List.of(
//				new Coffee("Columbian"), 
//				new Coffee("Cereza"), 
//				new Coffee("Ganador")
//				));
	}
	
	@GetMapping
	Iterable<Coffee> getCoffees() {
		return coffeeRepository.findAll();
	}

	@GetMapping("/{id}")
	Optional<Coffee> getCoffeeById(@PathVariable String id) {
		return coffeeRepository.findById(id);
	}

	@PostMapping
	Coffee postCoffee(@RequestBody Coffee coffee) {
		return coffeeRepository.save(coffee);
	}

	@PutMapping("/{id}")
	ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
		return (coffeeRepository.existsById(id)) ? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED)
				: new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteCoffee(@PathVariable String id) {
		coffeeRepository.deleteById(id);
	}
}
