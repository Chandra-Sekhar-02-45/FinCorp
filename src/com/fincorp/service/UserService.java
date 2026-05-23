package com.fincorp.service;

import com.fincorp.dto.UserDTO;
import com.fincorp.exceptions.DuplicateUserException;

public interface UserService {
	 void saveUser(UserDTO userDTO) throws DuplicateUserException ;
	 
}
