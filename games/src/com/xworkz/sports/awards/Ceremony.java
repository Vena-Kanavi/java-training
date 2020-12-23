package com.xworkz.sports.awards;

public class Ceremony {
	private String name;
	private String[] foods;

	public Ceremony() {
		System.out.println("No argument constructur of ceremony");
	}

	public Ceremony(String name) {
		this.name = name;
	}

	public void distributeAward(String winnerName, String award) {
		System.out.println("Distribute award method");
		System.out.println("winner is " + winnerName);
		System.out.println("Award is  " + award);
	}

	public void displayFoodItems() {
		System.out.println("Food items are");
		for (int f = 0; f < this.foods.length; f++) {
			String foodItem = this.foods[f];
			System.out.println(foodItem);
		}

	}

	public void displayCeremonyNameandFoods() {

		System.out.println(this.name);
		this.displayFoodItems();
	}

	public void accessParentMembers() {
		// in cons, methods
		int hCode = super.hashCode();
		System.out.println(hCode);
		String string = super.toString();
		System.out.println(string);

	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

}
