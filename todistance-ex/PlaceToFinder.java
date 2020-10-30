public class PlaceToFinder{
	public static void main(String[] find){
		System.out.println("JVM invoked main");
		int sizeOfMainParam=find.length;
		String distInString=find[0];
	    String distToInString=find[1];
	    int fromDistance=Integer.parseInt(distInString) ;
	   int toDistance=Integer.parseInt(distToInString) ;
		String placeDist=PlaceTo.finder(fromDistance,toDistance);
		String placeDistTo=PlaceTo.finder(fromDistance);

	System.out.println("Exit:: main");

	}
}