package com.xworkz.methods.theater;

public class ItsMovieTime {
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	private String[] snacksName = { "Pop corn", "Chips", "Cold Drinks" };
	private int snacksPrice = 50;
	private int available = 2000;
	private int pricePerTicket = 100;

	public ItsMovieTime(String theaterName, int totalTickets, String[] movieNames) {
		System.out.println("invoked itsShowTime");
		this.movieNames = movieNames;
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
	}

	public double bookTickets(String movieName, int noOfTickets, String bookedBy) {
		double totalPrice = 0;
		System.out.println("invoked bookTickets");
		for (int t = 0; t < movieNames.length; t++) {
			String movie = movieNames[t];
			if (movieName.equals(movie)) {
				System.out.println("movie found,can book ticket");
				if (noOfTickets <= totalTickets) {
					System.out.println("total tickets available " + totalTickets);
					totalTickets = totalTickets - noOfTickets;
					System.out.println("remaining tickets are: " + totalTickets);
					double price = noOfTickets * pricePerTicket;
					System.out.println(price);
				} else {
					System.out.println("there are no tickets");
				}
				break;
				
			} else {
				System.out.println("movie not found");
			}
		}

		return totalPrice;
	}

	public double buySnacks(String snackName, int quantity, boolean selfService, String seatNo) {
		double snackBill = 0;
		for (int s = 0; s < snacksName.length; s++) {
			String snack = snacksName[s];
			if (snackName.equals(snack)) {
				System.out.println("snack found");
				if (quantity <= available) {
					System.out.println("available");
					snackBill = quantity * snacksPrice;
					// System.out.println(snackBill);
				} else {
					System.out.println("not available");
				}
				break;
			} else {
				System.out.println("snack not found");
			}
		}
		return snackBill;
	}

	public String[] getMovieNames() {
		return movieNames;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public int getAvailable() {
		return available;
	}

	public int getSnacksPrice() {
		return snacksPrice;
	}
	public String[] getSnacksName() {
		return snacksName;
	}
}
