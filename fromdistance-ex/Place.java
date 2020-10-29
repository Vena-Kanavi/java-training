public class Place{
	public static String finder(int fromDistance){
		System.out.println("finder method invoked");
		System.out.println("fromDistance "+fromDistance);
		if(fromDistance==150){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(fromDistance==1500){
			System.out.println("Gujarat");
			return "Gujarat";
		}
		if(fromDistance==1934){
			System.out.println("Agra");
			return "Agra";
		}
		if(fromDistance==143){
			System.out.println("Mysore");
			return "Mysore";
		}
		if(fromDistance==412){
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