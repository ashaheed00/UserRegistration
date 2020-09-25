// Version UC4

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userReg = new UserRegistration();

		// Checking mobile number...
		System.out.println("Enter mobile number: ");
		if (userReg.mobileValidate(sc.nextLine().trim()))
			System.out.println("Valid mobile number.");
		else
			System.out.println("Invalid mobile number.");

		sc.close();
	}
}