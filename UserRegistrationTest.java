// Version UC12
// Junit test class

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	private UserRegistration user;

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	@Test
	public void testNameValidate() throws UserDetailsException {
		// Null check
		try {
			user.nameValidate(null);
		} catch (UserDetailsException e) {

			assertEquals(UserDetailsException.ExceptionType.NULL, e.exceptionType);
		}
		// Valid names
		String[] validNames = { "Akram", "Joe" };
		for (String name : validNames)
			user.nameValidate(name);
		// Invalid names
		String[] invalidNames = { "kram", "bh" };
		for (String name : invalidNames) {
			try {
				user.nameValidate(name);
			} catch (UserDetailsException e) {
				assertEquals(UserDetailsException.ExceptionType.INVALID, e.exceptionType);
			}
		}

	}

	@Test
	public void testEmailValidate() throws UserDetailsException {
		// Null check
		try {
			user.emailValidate(null);
		} catch (UserDetailsException e) {
			assertEquals(UserDetailsException.ExceptionType.NULL, e.exceptionType);
		}
		// Valid email
		String[] validEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.co", "abc+100@gmail.com" };
		for (String email : validEmails)
			user.emailValidate(email);
		// Invalid email
		String[] invalidEmails = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		for (String email : invalidEmails) {
			try {
				user.emailValidate(email);
			} catch (UserDetailsException e) {
				assertEquals(UserDetailsException.ExceptionType.INVALID, e.exceptionType);
			}
		}
	}

	@Test
	public void testMobileValidate() throws UserDetailsException {
		// Null check
		try {
			user.mobileNumberValidate(null);
		} catch (UserDetailsException e) {
			assertEquals(UserDetailsException.ExceptionType.NULL, e.exceptionType);
		}
		// Valid mobile numbers
		String[] validMobileNumbers = { "91 9851605588", "92 6584122568" };
		for (String mobileNumber : validMobileNumbers)
			user.mobileNumberValidate(mobileNumber);
		// Invalid mobile numbers
		String[] invalidEmails = { "9 9851256598", "91 67656415" };
		for (String mobileNumber : invalidEmails) {
			try {
				user.mobileNumberValidate(mobileNumber);
			} catch (UserDetailsException e) {
				assertEquals(UserDetailsException.ExceptionType.INVALID, e.exceptionType);
			}
		}
	}

	@Test
	public void testPasswordValidate() throws UserDetailsException {
		// Null check
		try {
			user.passwordValidate(null);
		} catch (UserDetailsException e) {
			assertEquals(UserDetailsException.ExceptionType.NULL, e.exceptionType);
		}
		// Valid passwords
		String[] validPasswords = { "Akram123*", "Akram3Kabir/" };
		for (String password : validPasswords)
			user.passwordValidate(password);
		// Invalid passwords
		String[] invalidPasswords = { "Akrhg*98/", "AkramKabir!", "AkramKabir!", "AkramKabir!" };
		for (String password : invalidPasswords) {
			try {
				user.passwordValidate(password);
			} catch (UserDetailsException e) {
				assertEquals(UserDetailsException.ExceptionType.INVALID, e.exceptionType);
			}
		}
	}

}