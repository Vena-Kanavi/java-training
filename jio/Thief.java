public class Thief{



public static void steal()
{
	System.out.println("invoked steal");
	
	short pocket=Jio.getRecharge();
	System.out.println("steal recharge "+pocket);
	//Jio.recharge=0; this is private now 
	System.out.println("Jio recharge "+Jio.getRecharge());
	System.out.println("EXIT :: steal");
	
}

}