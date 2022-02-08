package tests;

import model.user;

public class UserTest {

	public static void main(String[] args) {
		//user testUser = new user("mike", "my_passwd", "Mike", "Smith", "07771234567");
		
		//System.out.println(testUser);
		
		String test_username = "mike";
		String test_password = "my_passwd";
		String test_first_name = "Mike";
		String test_last_name = "Smith";
		String test_mobile_number = "07771234567";
		
		user testUser = new user(test_username, test_password, test_first_name, test_last_name, test_mobile_number);
		
		Boolean passed = true;
		
		if(testUser.getUsername() != test_username) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}
		if(testUser.getPassword() != test_password) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}
		
		if (passed)
			System.out.println("All TC's passed.");
		
		//TODO1: Development of three other if-code blocks to verify the other three fields
		
		if(testUser.getFirst_name() != test_first_name) {
			System.out.println("TC3 failed: first name did not match");
			passed = false;
		}
		if(testUser.getLast_name() != test_last_name) {
			System.out.println("TC4 failed: last name did not match");
			passed = false;
		}
		if(testUser.getMobile_number()!= test_mobile_number) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}
		
		//TODO 2: Developing the other four assertions
		assert testUser.getUsername() == test_username;
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
		assert testUser.getPassword() == test_password;
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
		assert testUser.getFirst_name() == test_first_name;
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
		assert testUser.getLast_name() == test_last_name;
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
		assert testUser.getMobile_number() == test_mobile_number;
		System.out.println("All Java assertions in the test suite passed (none failed).");
		
		
		
		
	
	
	}

}
