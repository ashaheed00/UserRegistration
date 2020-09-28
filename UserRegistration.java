// Version UC12

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	// Patter for first and last name are exactly same. Hence a common method is created.
	public boolean nameValidate(String name) throws UserDetailsException {
		Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
		try {
			Matcher matcher = pattern.matcher(name);
			if (matcher.find())
				return true;
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean emailValidate(String email) throws UserDetailsException {
		Pattern pattern = Pattern.compile("^[a-z][0-9a-z_+-]*\\.?[0-9a-z_+-]+@\\w+(\\.[a-z]{2,}\\w*){1,2}$");
		try {
			Matcher matcher = pattern.matcher(email);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean mobileValidate(String mobile) throws UserDetailsException {
		// assuming that the first mobile number digit shouldn't be 0
		Pattern pattern = Pattern.compile("^\\d{2}\\s{1}[1-9]\\d{9}$");
		try {
			Matcher matcher = pattern.matcher(mobile);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

	public boolean passwordValidate(String password) throws UserDetailsException {
		// Rule4 password has exactly one special character
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		try {
			Matcher matcher = pattern.matcher(password);
			if (matcher.find())
				return matcher.find();
			else
				throw new UserDetailsException(UserDetailsException.ExceptionType.INVALID, "Invalid input.");
		} catch (NullPointerException e) {
			throw new UserDetailsException(UserDetailsException.ExceptionType.NULL, "Null input.");
		}
	}

}