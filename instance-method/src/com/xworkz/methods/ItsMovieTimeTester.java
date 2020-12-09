package com.xworkz.methods;
import java.util.Arrays;

import com.xworkz.methods.theater.ItsMovieTime;


public class ItsMovieTimeTester {

	public static void main(String[] args) {

				String[] movieNames= {"Kotigobba","Yajamana","Bigil","Theri","Fidaa","Ala Vaikuntapuram","3-idiots","PK"};
				ItsMovieTime itsMovieTime=new ItsMovieTime("Laxmi",500,movieNames);
                 System.out.println("Theater name is: "+itsMovieTime.getTheaterName());
                 System.out.println("No of tickets available: "+itsMovieTime.getTotalTickets());
                 String names=Arrays.toString(itsMovieTime.getMovieNames());
                 System.out.println(names);
                 
                 itsMovieTime.bookTickets("Bigil",5,"Vena");
                 itsMovieTime.bookTickets("Bigil",494,"Vena");
                 
                 String name=Arrays.toString(itsMovieTime.getSnacksName());
                 System.out.println("snacks are "+name);
                 System.out.println("snacks price "+itsMovieTime.getSnacksPrice());
                 System.out.println("avaible snacks "+itsMovieTime.getAvailable());
                 
                 System.out.println(itsMovieTime.buySnacks("Chips",10, true, null));
                 
			}
	}
