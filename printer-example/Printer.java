public class Printer 
{
	
	
	public static void printing(String notes)
	{
		
		System.out.println("invoked Printing");
		System.out.println("arg notes: "+notes);
		
	}
	public static void printing(String notes,String documents)
	{
		System.out.println("invoked printing with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 notes "+notes);
		System.out.println("arg2 documents "+documents);
		
	}
	
	public static void printing(String notes,int noOfCopies)
	{
		
		System.out.println("invoked printing with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 notes "+notes);
		System.out.println("arg2 noOfCopies "+noOfCopies);
	}
	
	public static void printing(int noOfCopies,String notes)
	{
		System.out.println("invoked printing with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfCopies "+noOfCopies);
		System.out.println("arg2 notes "+notes);
		
	}
	
	public static void printing(int noOfCopies,char color,String notes)
	{
		System.out.println("invoked printing with two parameters ");
		System.out.println("int and char and String");
		System.out.println("arg1 noOfCopies "+noOfCopies);
		System.out.println("arg2 color "+color);
		System.out.println("arg3 notes "+notes);
		
	}
	
	
	
}