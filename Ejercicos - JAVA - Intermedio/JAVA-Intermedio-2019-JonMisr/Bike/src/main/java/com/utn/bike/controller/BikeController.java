package com.utn.bike.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.utn.bike.models.Bike;
import com.utn.bike.repositories.BikeRepository;

@RestController
/*Esta Anotacion Publicara Automaticamente Nuestra Clase Como Un Spring REST Service*/


@RequestMapping("api/v1/bikes") //URL De Nuestra API
public class BikeController {

	@Autowired
	private BikeRepository bK;
	@GetMapping//http://localhost:9090/api/v1/bikes
	public List<Bike> lista() {
		List<Bike> bikes = new ArrayList<>();
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		b2.setModel("JXB 123");
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);

		return bK.findAll();
	}
	
	//Metodo
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		
		
	}
}
