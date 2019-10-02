package main.java.designPattern.structuralPattern.facadePattern;

import java.util.ArrayList;
import java.util.List;

public class NonVegMenu implements Menu {

	List<String> dishes = new ArrayList<String>();
	
	public NonVegMenu()
	{
		dishes.add("Chicken Biryani");
		dishes.add("Butter Chicken");
		dishes.add("Chicken Kabab");
		
	}
	
	@Override
	public List<String> getDishes() {
		// TODO Auto-generated method stub
		return dishes;
	}

}