package main.java.designPattern.structuralPattern.facadePattern;

import java.util.ArrayList;
import java.util.List;

public class VegMenu implements Menu {

	List<String> dishes = new ArrayList<String>();
	
	public VegMenu()
	{
		dishes.add("Veg Pulaw");
		dishes.add("Butter Paneer");
		dishes.add("Bhendi Fry");
		
	}
	
	@Override
	public List<String> getDishes() {
		// TODO Auto-generated method stub
		return dishes;
	}

}
