package com.design.pattern.examples.decoratorPattern;

public class FoodDecorator implements Food {
	
	Food food;
	
	public FoodDecorator(Food food) {
        
	    this.food = food;	
	}

	@Override
	public String prepareFood() {
		return food.prepareFood();
	}

	@Override
	public double foodPrice() {
		return food.foodPrice();
	}

}
