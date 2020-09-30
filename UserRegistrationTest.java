// Version UC13
// Junit test class

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testNameValidate() {
		// Valid names
		String[] validNames = { "Akram", "Joe" };
		for (String name : validNames)
			assertTrue(UserRegistration.validateName.validate(name));
		// Invalid names
		String[] invalidNames = { "kram", "bh", "Akr8a" };
		for (String name : invalidNames)
			assertFalse(UserRegistration.validateName.validate(name));
	}

	@Test
	public void testEmailValidate() {
		// Valid email
		String[] validEmails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.co", "abc+100@gmail.com" };
		for (String email : validEmails)
			assertTrue(UserRegistration.validateEmail.validate(email));
		// Invalid email
		String[] invalidEmails = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		for (String email : invalidEmails)
			assertFalse((UserRegistration.validateEmail.validate(email)));
	}

	@Test
	public void testMobileValidate() {
		// Valid mobile numbers
		String[] validMobileNumbers = { "91 9851605588", "92 6584122568" };
		for (String mobileNumber : validMobileNumbers)
			assertTrue(UserRegistration.validateMobileNumer.validate(mobileNumber));
		// Invalid mobile numbers
		String[] invalidEmails = { "9 9851256598", "91 67656415" };
		for (String mobileNumber : invalidEmails)
			assertFalse(UserRegistration.validateMobileNumer.validate(mobileNumber));
	}

	@Test
	public void testPasswordValidate() {
		// Valid passwords
		String[] validPasswords = { "Akram123*", "Akram3Kabir/" };
		for (String password : validPasswords)
			assertTrue(UserRegistration.validatePassword.validate(password));
		// Invalid passwords
		String[] invalidPasswords = { "Akrhg*98/", "AkramKabir!", "AkramKabir!", "AkramKabir!" };
		for (String password : invalidPasswords)
			assertFalse(UserRegistration.validatePassword.validate(password));
	}

}