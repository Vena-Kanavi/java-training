package com.xworkz.solution.dto;

public class MovieDTO {
	
	private String name;
	private double rating;
	private double duration;
	private String genre;
	

	public MovieDTO() {
		System.out.println("default constructor");
	}


	public MovieDTO(String name, double rating, double duration, String genre) {
		super();
		this.name = name;
		this.rating = rating;
		this.duration = duration;
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", rating=" + rating + ", duration=" + duration + ", genre=" + genre + "]";
	}


	public String getName() {
		return name;
	}


	public double getRating() {
		return rating;
	}


	public double getDuration() {
		return duration;
	}


	public String getGenre() {
		return genre;
	}
	
	
    
}
