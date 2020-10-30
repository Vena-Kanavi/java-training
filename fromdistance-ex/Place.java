public class Place{
	public static String finder(int fromDistance){
		System.out.println("finder method invoked");
		int minDistance=50;
		if(fromDistance<=minDistance){
			System.out.println("minimum distance has to be "+minDistnace+"KMs");
			return "Not available"
		}
		if(fromDistance>100 && fromDistance<=150){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(fromDistance>1000 && fromDistance<=1500){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(fromDistance>1900 && fromDistance<=1934){
			System.out.println("Agra");
			return "Agra";
		}
		if(fromDistance>130 && fromDistance<=143){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(fromDistance>400 && fromDistance<=412){
			System.out.println("Gadag");
			return "Gadag";
		}
		if(fromDistance>=100000){
			System.out.println("place Not in earth");
			return "place Not in earth";
		}
		return "place not found";
	}
}