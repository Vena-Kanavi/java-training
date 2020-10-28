public class Converter{
	
	
	public static void main(String[] values)
	{
		
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to number");
		
		String doorNo="562";
		short convertedDoorNo=Short.parseShort(doorNo);
		System.out.println("converted short : "+convertedDoorNo);
		
		
		String salary="62457";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted salary : "+convertedSalary);
		
		int addDoorNoAndSalary=convertedDoorNo+convertedSalary;
		System.out.println("addDoorNoAndSalary  : "+ addDoorNoAndSalary);
		
		
		
		System.out.println("EXIT :: main");
					
	}
	
	
}