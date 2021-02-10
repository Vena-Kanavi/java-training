package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO{
	
	
	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo method");
		System.out.println("findByIdProofNo: "+idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO=licenseDTO.getIdProofNo();
			if(idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
			else {
				System.out.println("license not found");
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof "+idProof);
		System.out.println("type "+type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProof) {
		System.out.println("invoked deleteByIdProofNo");
		System.out.println("idproof "+idProof);
		LicenseDTO idProofFromDB = this.findByIdProofNo(idProof);
		if(idProofFromDB!=null) {
		this.database.remove(idProofFromDB);
		return true;
		}
//		Iterator<LicenseDTO> iterator=this.database.iterator();
//		while(iterator.hasNext()) {
//			LicenseDTO dto=iterator.next();
//			if(dto.getIdProofNo().equals(idProof)) {
//				iterator.remove();
//	            System.out.println("idproof no deleted");
//				return true;
//			}else {
//				System.out.println("idproof no not found");
//			}
//		}
		return false;
	}
	

}
