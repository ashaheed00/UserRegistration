// Version UC10

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
		// considering all test cases
		Pattern pattern = Pattern.compile("^[a-z][0-9a-z_+-]*\\.?[0-9a-z_+-]+@\\w+(\\.[a-z]{2,}\\w*){1,2}$");
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
		// Rule4 – has exactly one special character
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userReg = new UserRegistration();

		// Checking email...
		System.out.println("Enter your email: ");
		if (userReg.emailValidate(sc.nextLine().trim()))
			System.out.println("Valid email.");
		else
			System.out.println("Invalid email.");

		sc.close();
	}
}