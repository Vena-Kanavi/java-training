public class PlaceTo{
	public static String finder(int fromDistance){
		System.out.println("finder method invoked");
		int minDistance=50;
		if(fromDistance<=minDistance){
			System.out.println("minimum distance has to be "+minDistance+"KMs");
			return "Not available";
		}
		if(fromDistance>100 && fromDistance<=150){
			System.out.println("Mysore");
			return "Mysore";
		}
		return "place not found";
	}
	public static String finder(int startDistance,int endDistance){
				System.out.println("finder method invoked");
                System.out.println("startDistance: "+startDistance);
				System.out.println("endDistance: "+endDistance);
				int start=startDistance;
				int end=endDistance;
				int minDistance=50;
				if(start<=minDistance || end<=minDistance){
				System.out.println("minimum distance has to be "+minDistance+"KMs");
			    return "Not available";
				}
                System.out.println("exit::finder");
				return "Not Found";

	}
}