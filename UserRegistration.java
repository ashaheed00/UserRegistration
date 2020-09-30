// Version UC12

import java.util.regex.Matcher;

public class UserRegistration {

	public boolean nameValidate(String name) throws UserDetailsException {
		try {
			Matcher matcher = UserInputPatterns.NAME.matcher(name);
			if (matcher.find())
				return true;
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean emailValidate(String email) throws UserDetailsException {
		try {
			Matcher matcher = UserInputPatterns.EMAIL.matcher(email);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean mobileNumberValidate(String mobile) throws UserDetailsException {
		try {
			Matcher matcher = UserInputPatterns.MOBILE_NUMBER.matcher(mobile);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean passwordValidate(String password) throws UserDetailsException {
		try {
			Matcher matcher = UserInputPatterns.PASSWORD.matcher(password);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

}