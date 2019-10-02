package main.java.designPattern.structuralPattern.facadePattern;

import java.util.List;

public class VegRestaurant implements Menu {

	@Override
	public List<String> getDishes() {
		VegMenu vehMenu = new VegMenu();
		return vehMenu.getDishes();
	}

}
