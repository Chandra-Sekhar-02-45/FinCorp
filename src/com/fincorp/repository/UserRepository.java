package com.fincorp.repository;

import com.fincorp.dto.UserDTO;

public interface UserRepository {

	void saveUser(UserDTO user);
	
}
