package com.calderon.war;

import java.util.Random;

import javax.swing.plaf.synth.SynthTreeUI;

public class Soldier extends Unit {
	private String rank;
	private Integer age;
	public Soldier(String division, String name, String rank, Integer age) {
		super(division, name);
		this.rank = rank;
		this.age = age;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Soldier [getRank()=" + getRank() + ", getAge()=" + getAge() + ", toString()=" + super.toString() + "]";
	}
	
	public void prone () {
		System.out.println("Cuerpo a tierra");
	}
	@Override
	public Integer fire() {
		Random random = new Random();
		return 1 +random.nextInt(10);
		
	}
	@Override
	public Integer move() {
		Random random = new Random();
		return 21 + random.nextInt(10);
	}
	

}
