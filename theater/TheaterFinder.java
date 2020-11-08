public class TheaterFinder{

public static void lowestAndBestUsingEnum(Theater theaterName)
{

System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 theaterName   "+theaterName);	
	switch(theaterName){
		case URVASHI:
				System.out.println("case is " +theaterName);
				System.out.println("Shanti Nagar");
				break;
		case MENAKA:
				System.out.println("case is " +theaterName);
				System.out.println("Majestic");
				break;
		default :
				System.out.println("no theaterName matched");
	}
	
	System.out.println("Exitt:: lowestAndBestUsingEnum");
}

}