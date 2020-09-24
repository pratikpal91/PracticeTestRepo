package com.java8.lambda;

public class Car {

	
	private String name;
	private String color;
	private String engineType;
	
	Car(String name, String color,String engineType)
	{
		this.name = name;
		this.color = color;
		this.engineType = engineType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		
		return name+" "+ color+" "+engineType;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Car)
		{
			if(this.name.equals(((Car) obj).getName()) && this.color.equals(((Car) obj).color) && this.engineType.equals(((Car) obj).engineType))
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int hashcode;
		hashcode = this.name.length() * this.color.length() * this.engineType.length();
			
		return hashcode;
	}
	
    	
	
	
}
