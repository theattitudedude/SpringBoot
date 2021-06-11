package com.SpringBoot.CoffeeApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringBoot.CoffeeApplication.Entity.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
