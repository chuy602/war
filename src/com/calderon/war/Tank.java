package com.calderon.war;

import java.util.Random;

public class Tank extends Unit {

	private Integer armor;
	private Integer ammo;
	private String model;
	// aca van los constructores

	public Tank(String division, String name, Integer armor, Integer ammo, String model) {
		super(division, name);
		this.armor = armor;
		this.ammo = ammo;
		this.model = model;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getAmmo() {
		return ammo;
	}

	public void setAmmo(Integer ammo) {
		this.ammo = ammo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Tank [getArmor()=" + getArmor() + ", getAmmo()=" + getAmmo() + ", getModel()=" + getModel()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public Integer fire() {
		Random random = new Random();
		return 11 + random.nextInt(10);

	}

	public void turn() {
		System.out.println("Ahora es mi turno");
	}

	@Override
	public Integer move() {
		Random random = new Random();
		return 81 + random.nextInt(10);

	}

}
