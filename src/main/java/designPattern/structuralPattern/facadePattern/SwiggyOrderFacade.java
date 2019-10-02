package main.java.designPattern.structuralPattern.facadePattern;

import java.util.List;

public class SwiggyOrderFacade {

	public List<String> getVegMenu()
	{
		VegRestaurant veg = new VegRestaurant();
		
		return veg.getDishes();
	}
	
	public List<String> getNonVegMenu()
	{
		NonVegRestaurant nonVeg = new NonVegRestaurant();
		
		return nonVeg.getDishes();
	}
	
	
}
