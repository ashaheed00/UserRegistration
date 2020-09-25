// Version UC2

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration userReg = new UserRegistration();
		
		// Checking last name...
		System.out.println("Enter last name: ");
		if (userReg.firstNameValidate(sc.next()))
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name Format." + "\nLast name starts with Cap and has min 3 characters");
		
		sc.close();
	}
}