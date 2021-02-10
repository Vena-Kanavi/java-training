package com.xworkz.celebration;

import java.util.Optional;

public class OptionTester {

	//String StringBuffer StringBuilder, intern 
		public static void main(String[] args) {

			String email = null;

			System.out.println(email);

			if (email != null) {
				System.out.println(email.toUpperCase());
			}
			
			Optional<String> optional=Optional.of("Vena.xworkz@gmail.com");
			
			System.out.println(optional.isPresent());
			
			if(optional.isPresent()) {
				System.out.println(optional.get());
			}
			
			optional.ifPresent(e->System.out.println(e));
			
			
			Optional<Integer> yearOptional=optional.of(1998);
			System.out.println(yearOptional.isPresent());
			
			if(yearOptional.isPresent()) {
				System.out.println(yearOptional.get());
			}
			
			yearOptional.ifPresent(v->System.out.println(v));
			
			Optional<String> country=optional.ofNullable("India");
			
			country.ifPresent(c->{
				String value=optional.map(String::toUpperCase).get();
				System.out.println(value);
			});

			String def = country.orElse("Srilanka");
			System.out.println(def);

		}
}
