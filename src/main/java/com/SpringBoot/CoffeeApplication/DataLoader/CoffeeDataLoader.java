package com.SpringBoot.CoffeeApplication.DataLoader;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.SpringBoot.CoffeeApplication.Entity.Coffee;
import com.SpringBoot.CoffeeApplication.Repository.CoffeeRepository;

@Component
public class CoffeeDataLoader {
	
	private final CoffeeRepository coffeeRepository;
	
	public CoffeeDataLoader(CoffeeRepository coffeeRepository) {
		this.coffeeRepository = coffeeRepository;
	}

	@PostConstruct
	private void loadData() {
		coffeeRepository.saveAll(List.of(
				new Coffee("Columbian"), 
				new Coffee("Cereza"), 
				new Coffee("Ganador"),
				new Coffee("Davidoff")));
	}
}
