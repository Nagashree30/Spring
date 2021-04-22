package com.chimera.registration.service;

import com.chimera.registration.dto.RegisterDTO;

public interface RegisterService {

	public boolean validateAndSave(RegisterDTO dto);
}
