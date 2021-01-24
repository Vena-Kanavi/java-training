package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.Idproof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.CommonDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {
	public static void main(String[] args) {
		
		AddressDTO dto=new AddressDTO("Priya", "NA", 1756, "Shivapriya", "Dharwad", "KA", 582116);
		
		System.out.println(dto);
		
		
		Date date=new Date();
		CommonDTO commonDTO=new CommonDTO("Vena", 22, date, 7829731400l, BloodGroup.O_POSITIVE, Gender.FEMALE);
		System.out.println(commonDTO);
		
		
		LicenseDTO licenseDTO=new LicenseDTO();
		licenseDTO.setIdProof(Idproof.ADHARCARD);
		licenseDTO.setIdProofNo("868834154111");
		licenseDTO.setType(VehicleType.TWO_WHEELER);
		licenseDTO.setDisability(false);
		licenseDTO.setCommercial(false);
		System.out.println(licenseDTO);
		
		LicenseDAO dao=new LicenseDAOImpl();
		dao.save(licenseDTO);
	}

}
