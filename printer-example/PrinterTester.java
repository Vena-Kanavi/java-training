public class PrinterTester{


public static void main(String[] pages)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+pages.length);	
        
		String notes="Java";
		Printer.printing(notes);

		Printer.printing(notes,6);
		
		Printer.printing(notes,"Adharcard");
		
		Printer.printing(10,'B',notes);


	System.out.println("EXIT :: main");	
}

}