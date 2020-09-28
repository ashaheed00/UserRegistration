// Custom Exception for UserRegistration

@SuppressWarnings("serial")
public class UserDetailsException extends Exception {
	enum ExceptionType {
		NULL, INVALID;
	}

	ExceptionType exceptionType;

	public UserDetailsException(ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
