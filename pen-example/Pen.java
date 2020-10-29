public class Pen
{
	public static void main(String[] notes){
				System.out.println("invoked main");
				writing("Panchatantra");
				writing("Panchatantra","Parva");
				writing("Panchatantra",1);
				writing(1,"Panchatantra",50.0f,'A');
	}
	
	public static void writing(String stories)
	{
		
		System.out.println("invoked writing");
		System.out.println("arg stories:  "+stories);
		
	}
	public static void writing(String stories,String novels)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 stories   "+stories);
		System.out.println("arg2 novels   "+novels);
		
	}
	
	public static void writing(String stories,int indexNo)
	{
		
		System.out.println("invoked holding with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 stories  "+stories);
		System.out.println("arg2 indexNo   "+indexNo);
	}
	
	public static void writing(int indexNo,String stories,float percentageOfInk,char grade)
	{
		System.out.println("invoked holding with two parameters ");
		System.out.println("int and String and float and character");
		System.out.println("arg1 indexNo  "+indexNo);
		System.out.println("arg2 stories   "+stories);
		System.out.println("arg3 percentageOfInk  "+percentageOfInk);
		System.out.println("arg4 grade  "+grade);


	}
	
	
	
}