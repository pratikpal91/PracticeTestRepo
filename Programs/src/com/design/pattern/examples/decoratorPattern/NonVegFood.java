package com.design.pattern.examples.decoratorPattern;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food food) {
		super(food);
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood() + "With Chicken Curry and Kabab";
	}
	
	@Override
	public double foodPrice() {
		return super.foodPrice() + 50.0;
	}
	

}
