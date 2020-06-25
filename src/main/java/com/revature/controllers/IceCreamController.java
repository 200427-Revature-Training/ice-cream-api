package com.revature.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.IceCream;
import com.revature.services.IceCreamService;

@RestController
@RequestMapping("/ice-cream")
@CrossOrigin(origins = "*", 
methods = {RequestMethod.GET, RequestMethod.PUT, 
			RequestMethod.PATCH, RequestMethod.POST},
allowedHeaders = {"Content-Type"})

public class IceCreamController {

	@Autowired
	IceCreamService iceCreamService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<IceCream> getAllIceCream(@RequestParam(required=false) String flavorIs) {
		if (flavorIs==null) {
			return iceCreamService.getAllFlavors();
		} else {
			return iceCreamService.getIceCreamFlavor(flavorIs);
		}
	}
	
	@GetMapping("/{id}")
	public IceCream getIceCreamById(@PathVariable int id) {
		return iceCreamService.getFlavorById(id);
	}
}
