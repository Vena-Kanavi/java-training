public class InstitueFinder{


public static void lowestAndBestUsingString(String institueName)
{
	System.out.println("invoked lowestAndBestUsingString");
	System.out.println("arg 1 institueName "+institueName);
	switch(institueName){
			case "Xworkz":
				System.out.println("case is " +institueName);
				System.out.println("Enterprise development");
				System.out.println("cost is 20k");
				break;
			case "ABC":
				System.out.println("case is " +institueName);
				System.out.println("java");
				System.out.println("cost is 30k");
				break;
			case "Pentagon":
				System.out.println("case is " +institueName);
				System.out.println("Python");
				System.out.println("cost is 50k");
				break;
			case "Jspiders":
				System.out.println("case is " +institueName);
				System.out.println("java and jee");
				System.out.println("cost is 32k");
				break;
			case "SOCKEXPERTS":
				System.out.println("case is " +institueName);
				System.out.println("CYBER SECURITY");
				System.out.println("cost is 40k");
				break;
			default :
				System.out.println("no institue macthed");
		
	}
	
	System.out.println("EXIt:: lowestAndBestUsingString");
	
}


public static void lowestAndBestUsingEnum(Institute institueName)
{

System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 institueName "+institueName);	
	switch(institueName){
		case XWORKZ:
				System.out.println("case is " +institueName);
				System.out.println("Enterprise development");
				System.out.println("cost is 20k");
				break;
		case ABC:
				System.out.println("case is " +institueName);
				System.out.println("Java");
				System.out.println("cost is 30k");
				break;
		default :
				System.out.println("no institute matched");
	}
	
	System.out.println("EXIt:: lowestAndBestUsingEnum");
}

}