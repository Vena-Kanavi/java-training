public class CarBrands{
	public static String[] getBrands(){
		System.out.println("getBrands method invoked");
		
		String[] carBrands={"Audi","BMW","Maruti Suzuki","Toyota","Tata Altroz"};
		
		System.out.println("brands size  "+carBrands.length);
		
		for(int brands=0;brands<carBrands.length;brands++)
		{
			System.out.println("Brands count "+brands);
			String message=carBrands[brands];
			System.out.println("Car Brand "+ message);
		}
	  	return carBrands; 
	}
}