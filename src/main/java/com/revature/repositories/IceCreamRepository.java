package com.revature.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.revature.models.IceCream;

@Repository
public class IceCreamRepository {

	Map<Integer, IceCream> flavors = new HashMap<>();
	
	//Initialize some flavors
	{
		flavors.put(1, new IceCream(1, "Vanilla", 100.00));
		flavors.put(2, new IceCream(2, "Chocolate", 50.00));
		flavors.put(3, new IceCream(3, "Strawberry", 0.99));
	}
	
	public Collection<IceCream> getAllFlavors() {
		return flavors.values();
	}
	
	public IceCream getFlavorById(int id) {
		return flavors.get(id);
	}
	
	public IceCream save(IceCream iceCream) {
		iceCream.setId(flavors.size()+1);
		flavors.put(iceCream.getId(), iceCream);
		return iceCream;
	}
	
	public IceCream put(IceCream iceCream) {
		flavors.put(iceCream.getId(), iceCream);
		return iceCream;
	}
	
	public Collection<IceCream> getIceCreamFlavor(String flavorIs) {

		
		return flavors
				.values()
				.stream()
				.distinct()
				.filter(ice -> ice.getFlavor().contains(flavorIs))
				.collect(Collectors.toList());		
	}
}