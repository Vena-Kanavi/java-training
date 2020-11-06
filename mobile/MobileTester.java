public class MobileTester{
	public static void main(String[] swipe){
		System.out.println("encapsulation example");
		String screenLock=Mobile.getUnlock();
		System.out.println("Screen lock is  "+screenLock);
		String value=swipe[0];
		Mobile.setUnlock(value);
		
	}
}