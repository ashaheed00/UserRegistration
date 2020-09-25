// Version UC1

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidate(String fName) {
		Pattern pattern = Pattern.compile("^([A-Z])\\w{2,}$");
		Matcher matcher = pattern.matcher(fName);
		return matcher.find();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userReg = new UserRegistration();

		// Checking First name...
		System.out.println("Enter first your name: ");
		if (userReg.firstNameValidate(sc.next()))
			System.out.println("Valid Name");
		else
			System.out.println("Invalid First Name Format." + "\nFirst name starts with Cap and has minimum 3 characters");
		
		sc.close();
	}
}