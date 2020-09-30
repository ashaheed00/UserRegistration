// Version UC13

@FunctionalInterface
interface ValidateUserInput {
	boolean validate(String input);
}

public class UserRegistration {
	static ValidateUserInput validateName = (input) -> UserInputPatterns.NAME.matcher(input).find();
	static ValidateUserInput validateEmail = (input) -> UserInputPatterns.EMAIL.matcher(input).find();
	static ValidateUserInput validateMobileNumer = (input) -> UserInputPatterns.MOBILE_NUMBER.matcher(input).find();
	static ValidateUserInput validatePassword = (input) -> UserInputPatterns.PASSWORD.matcher(input).find();
}