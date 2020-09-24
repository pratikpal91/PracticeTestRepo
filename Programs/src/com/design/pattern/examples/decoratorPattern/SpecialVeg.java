package com.design.pattern.examples.decoratorPattern;

public class SpecialVeg extends FoodDecorator {

	public SpecialVeg(Food food) {
		super(food);
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood() + "With Papad,Raita and a dessert";
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 30;
	}

}
