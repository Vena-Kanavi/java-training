package com.xworkz.data;
import com.xworkz.data.dto.ManagerDTO;
import com.xworkz.data.transfer.CarShowRoom;

public class CarShowRoomTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("Pramod", 7204672052l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
		ManagerDTO dto=new ManagerDTO("Vena", 720432);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updateManager(7829731400l);
		carShowRoom.updateManager("Pratima");
		carShowRoom.displayManager();
	}

}
