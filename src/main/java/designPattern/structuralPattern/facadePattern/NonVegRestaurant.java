package main.java.designPattern.structuralPattern.facadePattern;

import java.util.List;

public class NonVegRestaurant implements Menu {

	@Override
	public List<String> getDishes() {
		NonVegMenu nonVegMenu = new NonVegMenu();
		return nonVegMenu.getDishes();
	}

}