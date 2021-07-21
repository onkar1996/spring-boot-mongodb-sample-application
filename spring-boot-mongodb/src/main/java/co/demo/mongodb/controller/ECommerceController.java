package co.demo.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.demo.mongodb.entity.User;
import co.demo.mongodb.repository.ECommerceRepository;

@RestController
public class ECommerceController {

	@Autowired
	ECommerceRepository repo;

	@PostMapping("/placeOrder")
	public User placeOrder(@RequestBody User user) {
		return repo.save(user);
	}

	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		return repo.findAllByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city) {
		return repo.findByCity(city);
	}

}
