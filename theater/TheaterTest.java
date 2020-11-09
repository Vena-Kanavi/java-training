enum Theater1{
     REX,ABHINAYA,URVASHI,MENAKA,INOX,SANTOSH,TRIVENI
        
}
public class TheaterTest{
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


public static void main(String[] photos)
{

System.out.println("invoked main, doing switch and enum");
String name="URVASHI";
Theater theaterName=Theater.valueOf(name);

TheaterFinder.lowestAndBestUsingEnum(theaterName);

System.out.println("EXIT :: main, doing switch and enum");
}

}