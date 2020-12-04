package com.xworkz.methods.theater;

public class ItsMovieTime {
private String theaterName;
private int totalTickets;
private String[] movieNames;


public ItsMovieTime(String theaterName,int totalTickets,String[] movieNames) {
	System.out.println("invoked itsShowTime");
	this.movieNames=movieNames;
	this.theaterName=theaterName;
	this.totalTickets=totalTickets;
}

public double bookTickets(String movieName,int noOfTickets,String bookedBy) {
	double totalPrice=0;
	System.out.println("invoked bookTickets");
	for(int t=0;t<movieNames.length;t++) {
		String movie=movieNames[t];
		if(movieName.equals(movie)) {
			System.out.println("movie found,can book ticket");
			break;
		}
		else {
			System.out.println("movie not found");
		}
	}
	if(noOfTickets<=totalTickets) {
		System.out.println("total tickets available "+totalTickets);
		totalTickets=totalTickets-noOfTickets;
		System.out.println("remaining tickets are: "+totalTickets);
		
	}
	else {
		System.out.println("there are no tickets");
	}
	return totalPrice;
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


}
