package com.xworkz.sports.computer;
import com.xworkz.sports.constants.DevicesAttached;

public class Computer {
        private String companyName;
        private String size;
        private DevicesAttached deviceAttached;
        
        public boolean turnOn() {
        	System.out.println("method turn on is invoked");
        	return true;
        }
        public void display() {
        	System.out.println("display method is invoked");
        }
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public DevicesAttached getDeviceAttached() {
			return deviceAttached;
		}
		public void setDeviceAttached(DevicesAttached deviceAttached) {
			this.deviceAttached = deviceAttached;
		}
}
