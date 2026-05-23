package com.fincorp.util;

import java.util.Arrays;
import java.util.Scanner;

import com.fincorp.dto.UserDTO;
import com.fincorp.enums.AccountType;
import com.fincorp.enums.Gender;

public class InputUtil {
	public static int acceptMenuOption(Scanner sc){
		System.out.println("Welcome To FinCorp");
		System.out.println("Enter 1 : To Create User");
		System.out.println("Enter 2 : For Fetching All Users Created");
		
		int selectedOption = sc.nextInt();
		if(selectedOption == 1) {
			return selectedOption ;
		} else {
			return acceptMenuOption(sc) ;
		}
	}
	
	public static boolean wantToContinue(Scanner sc) {
		System.out.println("To Continue Enter 'Y' or To Exit Program Enter 'F'");
		char selectedOption = sc.next().toUpperCase().charAt(0);
		return selectedOption == 'Y' ;
	}

	public static UserDTO acceptUserDetails(Scanner sc) {
		System.out.println("Enter User ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		
		System.out.println("Gender : " + Arrays.asList(Gender.values()).toString());
		String gender = sc.next().toUpperCase();
		
		System.out.println("Account Type : " + Arrays.asList(AccountType.values()).toString());
		String accountType = sc.next().toUpperCase();
		
		System.out.println("Enter Account Number : ");
		String accountNumber = sc.next();
		
		System.out.println("Enter Account Balance :");
		double accountBalance = sc.nextDouble();
		
		System.out.println("Enter Mobile Number : ");
		String mobileNumber = sc.next();
		
		System.out.println("Enter Emali Address : ");
		String email = sc.next();
		
		System.out.println("Enter Location : ");
		String location = sc.next();
		
		try {
			UserDTO userDTO = new UserDTO();
			
			userDTO.setId(id);
			userDTO.setFirstName(firstName);
			userDTO.setLastName(lastName);
			userDTO.setGender(Gender.valueOf(gender));
			userDTO.setAccountType(AccountType.valueOf(accountType));
			userDTO.setAccountNumber(accountNumber);
			userDTO.setAccountBalance(accountBalance);
			userDTO.setMobileNumber(mobileNumber);
			userDTO.setEmail(email);
			userDTO.setLocation(location);
			
			return userDTO ;
			
		} catch (Exception exception) {
			System.out.println("Exception " + exception.getMessage());
			return acceptUserDetails(sc);
		}
		
	}
}
