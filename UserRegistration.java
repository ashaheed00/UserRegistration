// Version UC5

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidate(String fName) {
		Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
		Matcher matcher = pattern.matcher(fName);
		return matcher.find();
	}

	public boolean lastNameValidate(String lName) {
		Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
		Matcher matcher = pattern.matcher(lName);
		return matcher.find();
	}

	public boolean emailValidate(String email) {
		Pattern pattern = Pattern.compile("^([a-z][0-9a-z_-]*)(.[a-z][0-9a-z_-]*)?@bl.co(.in)?$");
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public boolean mobileValidate(String mobile) {
		// assuming that the first mobile number digit shouldn't be 0
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobile);
		return matcher.find();
	}
	
	public boolean passwordValidate(String password) {
		// Rule2 – Should have at least 1 Upper Case
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])+.{8,}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userReg = new UserRegistration();

		// Checking password...
		System.out.println("Enter password: ");
		if (userReg.passwordValidate(sc.next()))
			System.out.println("Valid password.");
		else
			System.out.println("Invalid password.");

		sc.close();
	}
}