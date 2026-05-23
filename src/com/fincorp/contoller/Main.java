package com.fincorp.contoller;

import java.io.IOException;
import java.util.Scanner;

import com.fincorp.dto.UserDTO;
import com.fincorp.service.UserService;
import com.fincorp.service.impl.UserServiceImpl;
import com.fincorp.util.InputUtil;

public class Main {
	private UserService userService;
	public static void main(String[] args) throws IOException {
		// Passing command-line arguments from main() to run()
		new Main().run(args);
	}

	private void run(String... args) {
		userService = new UserServiceImpl();
		// Scanner is automatically closed using try-with-resources
		try(Scanner sc = new Scanner(System.in)) {
			do {
				int option = InputUtil.acceptMenuOption(sc);
				switch(option) {
				case 1 :
					UserDTO userDTO = InputUtil.acceptUserDetails(sc);
					userService.saveUser(userDTO);
					System.out.println("User Created Successfully");
					break ;
				case 2 : 
					System.out.println("Fetching All Users Created");
					
				default :
					System.out.println("Program Exit");
				}
			} while(InputUtil.wantToContinue(sc));
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}