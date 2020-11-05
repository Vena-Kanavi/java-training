public class StateTester{
	public static void main(String[] args){
		System.out.println("use of fields");
		System.out.println("State name   "+State.StateName);
		int door=State.areaOfState;
		System.out.println("areaOfState is   "+door);
		System.out.println("no of states   "+State.noOfDistricts);
		System.out.println("noOfZoo is   "+State.noOfZoo);
		System.out.println("capitalName is   "+State.capitalName);
		
	    System.out.println("********************************************");

		
		System.out.println("noOfVillages  "+District.noOfVillages);
		System.out.println("taluks   "+District.taluks);
		System.out.println("countryName   "+District.countryName);
		System.out.println("population   "+District.population);
		System.out.println("districtName is   "+District.districtName);
		
		
		System.out.println("********************************************");

		
		System.out.println("noOfAnimals  "+MysoreZoo.noOfAnimals);
		System.out.println("entryFee   "+MysoreZoo.entryFee);
		System.out.println("zooName   "+MysoreZoo.zooName);
		System.out.println("areaOfZoo   "+MysoreZoo.areaOfZoo);
		System.out.println("location is   "+MysoreZoo.location);
		
		System.out.println("********************************************");

		
		System.out.println("monuments  "+Hampi.monuments);
		System.out.println("noOfTemples   "+Hampi.noOfTemples);
		System.out.println("rulerName   "+Hampi.rulerName);
		System.out.println("areaOfHampi   "+Hampi.areaOfHampi);
		System.out.println("temple is   "+Hampi.temple);

	}
}