
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidateParameterisedTest {

	private String inputEmail;
	private Boolean expectedResult;
	private UserRegistration user;

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	public EmailValidateParameterisedTest(String inputEmail, Boolean expectedResult) {
		super();
		this.inputEmail = inputEmail;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> emails() {
		return Arrays.asList(new Object[][] {
			{ "abc@yahoo.com", true }, 
			{ "abc-100@yahoo.com", true },
			{ "abc.100@yahoo.com", true }, 
			{ "abc111@abc.com", true }, 
			{ "abc-100@abc.net", true },
			{ "abc.100@abc.com.au", true }, 
			{ "abc@gmail.com.com", true }, 
			{ "abc+100@gmail.com", true },
			{ "abc", false }, 
			{ "abc@.com.my", false }, 
			{ "abc123@gmail.a", false },
			{ "abc123@.com", false },
			{ "abc123@.com.com", false }, 
			{ ".abc@abc.com", false }, 
			{ "abc()*@gmail.com", false },
			{ "abc@%*.com", false }, 
			{ "abc..2002@gmail.com", false }, 
			{ "abc.@gmail.com", false },
			{ "abc@abc@gmail.com", false }, 
			{ "abc@gmail.com.1a", false }, 
			{ "abc@gmail.com.aa.au", false }

		});
	}
	
	@Test
	public void testEmailValidate() {
		assertEquals(expectedResult	, user.emailValidate(inputEmail));
	}
}
