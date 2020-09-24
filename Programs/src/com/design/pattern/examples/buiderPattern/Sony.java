package com.design.pattern.examples.buiderPattern;

public class Sony extends Company {

	@Override
	public String pack() {
		return "Packing SONY CD";
	}

	@Override
	public int price() {
		return 20;
	}

}
