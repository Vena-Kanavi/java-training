public class Country{
   public static void main(String[] names)
   {
	   
	   System.out.println("JVM invoked main");
	   
	   System.out.println("Program to print all the country names given as arguments to the main method");
	   for(int loop=0;loop<names.length;loop++)
	   {
		   System.out.println("Index value "+loop);
		   String countryName=names[loop];
		   System.out.println("Country name "+countryName);
	   }
	   
	   
	   System.out.println("EXIT  :: main");
	   
   }

}