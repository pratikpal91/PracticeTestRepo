package com.design.pattern.examples.decoratorPattern;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food food) {
		super(food);
	}
	
	
	@Override
	public double foodPrice() {
		return super.foodPrice() + 40.0;
	}
	
	
	@Override
	public String prepareFood() {		
		return super.prepareFood() + "With Paneer Manchurian and Noodles";
	}

}
