package com.xworkz.palace.dto;

public class PalaceDTO implements Cloneable{
	
	private String location;
	private String kingName;
	private String queenName;
	
	
	public PalaceDTO() {
		System.out.println("Default constructor");
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getKingName() {
		return kingName;
	}


	public void setKingName(String kingName) {
		this.kingName = kingName;
	}


	public String getQueenName() {
		return queenName;
	}


	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}


	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("hashcode overridden method");
		return 23;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			if(this==obj) {
				return true;
			}else {
				if(obj instanceof PalaceDTO) {
					PalaceDTO dto=(PalaceDTO)obj;
					if(dto.getKingName()==this.kingName) {
						return true;
					}
					return false;
				}
			}
		return false;
	}
	
	
	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		
		PalaceDTO dto=new PalaceDTO();
		this.kingName=dto.getKingName();
		
		return (PalaceDTO) super.clone();
	}

}
