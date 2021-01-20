package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {

		MovieDTO dto = new MovieDTO("Bigil", 5, 2.5, "sports");
		MovieDTO dto1 = new MovieDTO("Baaghi", 4, 3, "Action");
		MovieDTO dto2 = new MovieDTO("Om", 3, 2.5, "Crime");
		MovieDTO dto3 = new MovieDTO("Om Shanti Om", 5, 3, "Drama");
		MovieDTO dto4 = new MovieDTO("Kurigalu Sir Kurigalu", 4, 2.5, "comedy");

		Collection<MovieDTO> movieDTOs = new ArrayList<MovieDTO>();
		movieDTOs.add(dto);
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);

		// System.out.println(movieDTOs);
		System.out.println(movieDTOs.size());

		Collection<MovieDTO> tempMovie = new ArrayList<MovieDTO>();

		Iterator<MovieDTO> iterator = movieDTOs.iterator();
		while (iterator.hasNext()) {
			MovieDTO movie = iterator.next();
			System.out.println(movie);
			if (movie.getGenre().equals("comedy")) {
				iterator.remove();
			} else {
				tempMovie.add(movie);
			}
		}
		System.out.println(movieDTOs.size());
		System.out.println("movies after removing " + tempMovie);
	}

}
