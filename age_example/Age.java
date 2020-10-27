public class Age{
	public static String AgeDefine(int age){
		System.out.println("AgeDefine method invoked");
		System.out.println("age"+age);
		if(age>1 && age<=5){
			System.out.println("Kid");
			return "Kid";
		}
		if(age>5 && age<=12){
			System.out.println("Child");
			return "Child";
		}
		if(age>12 && age<=19){
			System.out.println("Teen");
			return "Teen";
		}
		if(age>19 && age<=50){
			System.out.println("Adult");
			return "Adult";
		}
		if(age>50 && age<100){
			System.out.println("Old");
			return "old";
		}
		return "Centenerian";
	}
}