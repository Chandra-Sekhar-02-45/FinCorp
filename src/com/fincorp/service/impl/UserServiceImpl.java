package com.fincorp.service.impl;

import com.fincorp.dto.UserDTO;
import com.fincorp.exceptions.DuplicateUserException;
import com.fincorp.repository.UserRepository;
import com.fincorp.repository.impl.UserRepositoryImpl;
import com.fincorp.service.UserService;

public class UserServiceImpl implements UserService {
	private UserRepository userRepository ;
//	private static final String USER_ALREADY_EXISTS = "User Already Exists With User ID : " ;
//	private static final String USER_NOT_FOUND = "User Not Found With User ID : " ;
	
	public UserServiceImpl() {
		this.userRepository = new UserRepositoryImpl() ;
	}

	@Override
	public void saveUser(UserDTO userDTO) throws DuplicateUserException {
		userRepository.saveUser(userDTO) ;
	}

}