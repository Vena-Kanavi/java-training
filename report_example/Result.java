public class Result{
	public static String report(double percentage)
	{
		System.out.println("Report method invoked");
		System.out.println("percentage "+percentage);
		if(percentage<100 && percentage>=90){
			System.out.println("outstanding");
			return "Outstanding";
		}
		if(percentage>=80 && percentage<90){
			System.out.println("Excellent");
			return "Excellent";
		}
		if(percentage>=70 && percentage<80){
			System.out.println("very good");
			return "V.Good";
		}
		if(percentage>=60 && percentage<70){
			System.out.println("Good");
			return "Good";
		}
		if(percentage>=50 && percentage<60){
			System.out.println("Above average");
			return "Above Average";
		}
		if(percentage>=40 && percentage<50){
			System.out.println("Poor");
			return "Poor";
		}
		return "Fail";
	}
}