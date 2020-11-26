package com.xworkz.objects;
import com.xworkz.objects.examples.Speaker;

public class SpeakerTester {
	public static void main(String[] args) {
		tester();
	}
	public static void tester() {
		Speaker speaker=new Speaker();
		System.out.println(speaker.brand);
		System.out.println(speaker.price);
		System.out.println(speaker.type);
	}

}
