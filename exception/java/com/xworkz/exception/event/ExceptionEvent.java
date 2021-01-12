package com.xworkz.exception.event;

public class ExceptionEvent {
		public ExceptionEvent() {
			System.out.println("exception event method");
		}
		
		public void exceptionEvent(boolean create) throws Throwable{
			System.out.println("invoked exception event method");
			if(create) {
				System.out.println("exception event");
				Throwable throwable=new Throwable();
				throw throwable;
			}else {
				System.out.println("no exception event");
			}
		}
		
		public void frame1() throws Throwable {
			System.out.println("invoked frame1");
			frame2();
		}
		public void frame2() throws Throwable {
			System.out.println("invoked frame2");
			frame3();
		}
		
		public void frame3() throws Throwable {
			System.out.println("invoked frame3");
			frame4();
		}
		public void frame4() throws Throwable {
			System.out.println("invoked frame4");
			exceptionEvent(false);
		}

	}



