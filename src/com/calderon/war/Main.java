package com.calderon.war;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("STAR PROGRAM");
		
		Tank tank1 = new Tank("Acorazado", "Lion", 100, 50, "T-34");
		System.out.println(tank1.toString());
		tank1.turn();
		
		Soldier soldier1= new Soldier("Paracaidista", "Helmut", "Cabo", 25);
		System.out.println("Soldier1: " + soldier1);
		soldier1.prone();
		
		System.out.println("END PROGRAM");

	}

}
