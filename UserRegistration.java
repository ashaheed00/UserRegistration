// Version UC2

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidate(String fName) {
		return UserInputPatterns.NAME.matcher(fName).find();
	}

	public boolean lastNameValidate(String lName) {
		return UserInputPatterns.NAME.matcher(lName).find();
	}

}