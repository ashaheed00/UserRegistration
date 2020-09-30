// Version UC8

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

	public boolean passwordValidate(String password) {
		return UserInputPatterns.PASSWORD.matcher(password).find();
	}

}