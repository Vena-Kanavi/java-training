package com.xworkz.methods.electronic;

public class Speaker {
	
	private String color;
	private String companyName="JBL";
	private int batteryBackUp;
	
	
	private boolean connected;
	private int maxVolumeLevel=5;
	private int minVolumeLevel=0;
	private int currentVolume=0;
	
	
	public Speaker(String color,int batteryBackUp) {
		this.color=color;
		this.batteryBackUp=batteryBackUp;
		System.out.println("created Speaker constructor");
		System.out.println("color is: "+color);
		System.out.println("batteryback up is: "+batteryBackUp);
	}
	
	
	public void onOrOff() {
		this.connected=!this.connected;
	}
	
	public void increaseVolume() {
		if(this.connected==true) {
			if(this.currentVolume<this.maxVolumeLevel) {
				this.currentVolume=this.currentVolume+1;
				System.out.println("current volume is: "+this.currentVolume);
			}
			else {
				System.out.println("reached maximum volume");
			}
		}
		else {
		System.out.println("turn on the battery");
	}
	}
	
	public void decreaseVolume() {
		if(this.connected==true) {
			if(this.currentVolume>this.minVolumeLevel) {
				this.currentVolume=this.currentVolume-1;
				System.out.println("current volume is: "+this.currentVolume);
			}
			else{
				System.out.println("reached minimum volume");
			}
		}
		else {
		System.out.println("turn on the battery");
		}
	}
	
	public int getBatteryBackUp() {
		return batteryBackUp;
	}
	public String getColor() {
		return color;
	}
	public String getCompanyName() {
		return companyName;
	}
	public boolean isConnected(){
		return connected;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	

}
