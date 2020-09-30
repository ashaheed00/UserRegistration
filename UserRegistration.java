// Version UC4

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidate(String fName) {
		return UserInputPatterns.NAME.matcher(fName).find();
	}

	public boolean lastNameValidate(String lName) {
		return UserInputPatterns.NAME.matcher(lName).find();
	}

	public boolean emailValidate(String email) {
		return UserInputPatterns.EMAIL_BL.matcher(email).find();
	}

	public boolean mobileNumberValidate(String mobileNUmber) {
		return UserInputPatterns.MOBILE_NUMBER.matcher(mobileNUmber).find();
	}

}