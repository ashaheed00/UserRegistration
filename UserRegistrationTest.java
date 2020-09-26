// Version UC10
// Junit test class

import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstNameValidate() {
		UserRegistration user = new UserRegistration();
		// Valid/Happy test cases
		assertTrue("Valid naming format", user.firstNameValidate("Akram"));
		assertTrue("Valid naming format", user.firstNameValidate("Joy"));
		// Invalid test cases
		assertFalse("Valid naming format", user.firstNameValidate("akram"));
		assertFalse("Valid naming format", user.firstNameValidate("jo"));
	}

	@Test
	public void testLastNameValidate() {
		UserRegistration user = new UserRegistration();
		// Valid test cases
		assertTrue("Valid naming format", user.lastNameValidate("Kabir"));
		assertTrue("Valid naming format", user.lastNameValidate("Roy"));
		// Invalid test cases
		assertFalse("Valid naming format", user.lastNameValidate("patil"));
		assertFalse("Valid naming format", user.lastNameValidate("as"));
	}

	@Test
	public void testEmailValidate() {
		UserRegistration user = new UserRegistration();
		// Valid test cases
		assertTrue("Valid naming format", user.emailValidate("abc@yahoo.com"));
		assertTrue("Valid naming format", user.emailValidate("abc-100@yahoo.com"));
		assertTrue("Valid naming format", user.emailValidate("abc.100@yahoo.com"));
		assertTrue("Valid naming format", user.emailValidate("abc111@abc.com"));
		assertTrue("Valid naming format", user.emailValidate("abc-100@abc.net"));
		assertTrue("Valid naming format", user.emailValidate("abc.100@abc.com.au"));
		assertTrue("Valid naming format", user.emailValidate("abc@gmail.com.com"));
		assertTrue("Valid naming format", user.emailValidate("abc+100@gmail.com"));
		// Invalid test cases
		assertFalse("Valid naming format", user.emailValidate("abc"));
		assertFalse("Valid naming format", user.emailValidate("abc@.com.my"));
		assertFalse("Valid naming format", user.emailValidate("abc123@gmail.a"));
		assertFalse("Valid naming format", user.emailValidate("abc123@.com"));
		assertFalse("Valid naming format", user.emailValidate("abc123@.com.com"));
		assertFalse("Valid naming format", user.emailValidate(".abc@abc.com"));
		assertFalse("Valid naming format", user.emailValidate("abc()*@gmail.com"));
		assertFalse("Valid naming format", user.emailValidate("abc@%*.com"));
		assertFalse("Valid naming format", user.emailValidate("abc..2002@gmail.com"));
		assertFalse("Valid naming format", user.emailValidate("abc.@gmail.com"));
		assertFalse("Valid naming format", user.emailValidate("abc@abc@gmail.com"));
		assertFalse("Valid naming format", user.emailValidate("abc@gmail.com.1a"));
		assertFalse("Valid naming format", user.emailValidate("abc@gmail.com.aa.au"));
	}

	@Test
	public void testMobileValidate() {
		UserRegistration user = new UserRegistration();
		// Valid test cases
		assertTrue("Valid naming format", user.mobileValidate("91 9851256598"));
		assertTrue("Valid naming format", user.mobileValidate("92 6765641515"));
		// Invalid test cases
		assertFalse("Valid naming format", user.mobileValidate("9 9851256598"));
		assertFalse("Valid naming format", user.mobileValidate("91 67656415"));
	}

	@Test
	public void testPasswordValidate() {
		UserRegistration user = new UserRegistration();
		// Valid test cases
		assertTrue("Valid naming format", user.passwordValidate("Akram123*"));
		assertTrue("Valid naming format", user.passwordValidate("Akram3Kabir/"));
		// Invalid test cases
		assertFalse("Valid naming format", user.passwordValidate("Akrhg*98/"));
		assertFalse("Valid naming format", user.passwordValidate("AkramKabir!"));
		assertFalse("Valid naming format", user.passwordValidate("AkramKabir!"));
		assertFalse("Valid naming format", user.passwordValidate("AkramKabir!"));
	}

}
