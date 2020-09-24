package com.design.pattern.examples.buiderPattern;

public class Samsung extends Company {

	@Override
	public String pack() {
		return "Packing Samsung CD";
	}

	@Override
	public int price() {
		return 30;
	}

}
