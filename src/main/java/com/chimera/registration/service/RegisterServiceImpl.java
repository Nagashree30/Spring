package com.chimera.registration.service;

import org.springframework.beans.BeanUtils;

import com.chimera.registration.dao.RegisterDAO;
import com.chimera.registration.dto.RegisterDTO;
import com.chimera.registration.entity.RegisterEntity;


public class RegisterServiceImpl implements RegisterService{

	private RegisterDAO dao;
	@Override
	public boolean validateAndSave(RegisterDTO dto) {
		System.out.println("invoke validate and save method of registerServiceImpl");
		boolean valid = false;
		String cpassword = dto.getCpassword();

		try {

			if (!cpassword.isEmpty()) {
				RegisterEntity entity = new RegisterEntity();
				BeanUtils.copyProperties(dto, entity);
				System.out.println("data valid..ready to save");
				dao.saveRegisterDetails(entity);
				valid = true;

			} else {
				System.out.println("invalid data!");
				valid = false;
				return valid;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valid;
	}

}
