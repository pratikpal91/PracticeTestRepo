package com.design.pattern.examples.decoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorDesignPatternDemo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu Options : ");
		System.out.println("1-Veg Food 2-Non Veg Food 3-Chinese Food 4-Speical Veg Food");
		System.out.println("Select your choice");
		int choice = Integer.parseInt(br.readLine());
		Food food;
		Food vegFood = new VegFood();
		switch (choice) {
		case 1:
		    food = vegFood;
			System.out.println(food.prepareFood());
			System.out.println(food.foodPrice());
			break;
			
		case 2: 
			food = new NonVegFood(vegFood); 
			System.out.println(food.prepareFood());
			System.out.println(food.foodPrice());
			break;
			
		case 3:
			food = new ChineseFood(vegFood);
			System.out.println(food.prepareFood());
			System.out.println(food.foodPrice());
			break;
		
		case 4:
			food = new SpecialVeg(vegFood);
			System.out.println(food.prepareFood());
			System.out.println(food.foodPrice());
			break;

		default:
			food = vegFood;
			System.out.println(food.prepareFood());
			System.out.println(food.foodPrice());
		}
		
		
	}

}
