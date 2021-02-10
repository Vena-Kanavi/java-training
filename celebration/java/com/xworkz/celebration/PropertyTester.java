package com.xworkz.celebration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class PropertyTester {
	// HashTable
	// IdentityMap

	public static void main(String[] args) {

		       
//               Comparator<String> a=new Comparator<String>() {
//				
//				@Override
//				public int compare(String o1, String o2) {
//					return o1.compareTo(o2);
//				}
//			};		
		

				Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareTo(a));
				map.put("Jai ho", "Vijay Prakash");
				map.put("Kabira", "Arijith singh");
				map.put("Kali quarter bottle", "Vijay Prakash");
				map.put("Perfect", "Ed Shreeran");
				map.put("Happy Agide", "All Ok");

				Set<Entry<String, String>> entrySet = map.entrySet();
				entrySet.forEach(entry -> System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));

				map.forEach((k, v) -> System.out.println(k + " " + v));

				// Properties
				// Map map2;
				// deal values from file, which always will be string
				Properties properties = new Properties();
				properties.setProperty("Name", "Email");
				properties.getProperty("Name");

	}

}
