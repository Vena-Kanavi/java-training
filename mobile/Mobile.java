public class Mobile{
	private static String unlock="Pin";
	
	
	public static String getUnlock(){
		
		return unlock;
	}
	
	public static void setUnlock(String lock){
             if(lock.equals("Finger") || lock.equals("pattern") || lock.equals("face")){
				 System.out.println("New lock is "+lock);
			 }
			 else{
				 System.out.println("not matching");
				 
			 }
	}
}