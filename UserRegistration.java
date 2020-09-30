// Version UC1

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidate(String fName) {
		return UserInputPatterns.NAME.matcher(fName).find();
	}

}