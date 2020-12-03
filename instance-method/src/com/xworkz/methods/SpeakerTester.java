package com.xworkz.methods;
import com.xworkz.methods.electronic.Speaker;

public class SpeakerTester {
	public static void main(String[] args) {
		Speaker speaker=new Speaker("Red",6);
		System.out.println(speaker.getBatteryBackUp());
		System.out.println(speaker.getColor());
		System.out.println(speaker.getCompanyName());
		
		System.out.println("speaker is: "+speaker.isConnected());
		speaker.onOrOff();
		System.out.println("after pressing button speaker is: "+speaker.isConnected());
		
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		
		
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
	}

}
