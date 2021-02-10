package com.xworkz.celebration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTester {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("Vena", 22);
		map.put("Pramod", 26);
		map.put("Champa", 44);
		map.put("Fakkiresh", 64);
		map.put("Fakkiresh", 64);
		map.put(null, 64);
		map.put("Rashmi", null);
	
		
		System.out.println(map.size());
		
		Set<String>  key=map.keySet();
		System.out.println(key);
		
		Integer age=map.get("Vena");
		System.out.println(age);
		
		System.out.println(map.values());
		
		Set<Entry<String,Integer>> entry=map.entrySet();
		System.out.println(entry);
		
		
		Set<String> keys = map.keySet();

		keys.forEach(anything -> {
			Integer v = map.get(anything);
			System.out.println(anything + "age is " + v);
		});
		
		
		Collection<Integer> values = map.values();

		values.forEach(a -> System.out.println(a));

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r -> {
			System.out.println(r.getKey());
			System.out.println(r.getValue());
		});
		
	}

}
