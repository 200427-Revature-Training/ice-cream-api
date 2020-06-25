package com.revature.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.IceCream;
import com.revature.repositories.IceCreamRepository;

@Service
public class IceCreamService {

	@Autowired
	IceCreamRepository iceCreamRepository;
	
	public Collection<IceCream> getAllFlavors() {
		return iceCreamRepository.getAllFlavors();
	}
	
	public IceCream getFlavorById(int id) {
		return iceCreamRepository.getFlavorById(id);
	}
	
	public IceCream save(IceCream iceCream) {
		return iceCreamRepository.save(iceCream);
	}
	
	public IceCream put(IceCream iceCream) {
		return iceCreamRepository.put(iceCream);
	}
	
	public Collection<IceCream> getIceCreamFlavor(String flavorIs) {
		return iceCreamRepository.getIceCreamFlavor(flavorIs);
	}
}
