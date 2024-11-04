package com.calderon.war;

import java.util.Random;

public abstract class Unit {
	private String division;
	private String name;
	
	public Unit() {
		super();
	}

	public Unit(String division, String name) {
		super();
		this.division = division;
		this.name = name;
	}
	public abstract Integer fire();
	
	
//	{
//	Random random = new Random ();
//	return random .nextInt(10);
//	}
	
	public abstract Integer move();
	
	
//	{
//		Random random = new Random ();
//		return random .nextInt(10);
//	}
	

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Unit [getDivision()=" + getDivision() + ", getName()=" + getName() + "]";
	}
	
	

}
