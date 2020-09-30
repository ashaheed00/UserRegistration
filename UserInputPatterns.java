import java.util.regex.Pattern;

public class UserInputPatterns {
	final static Pattern NAME = Pattern.compile("^[A-Z][a-z]{2,}$");
	final static Pattern EMAIL_BL = Pattern.compile("^([a-z][0-9a-z_-]*)(\\.[a-z][0-9a-z_-]*)?@bl.co(\\.in)?$");
	final static Pattern EMAIL = Pattern.compile("^[a-z][0-9a-z_+-]*\\.?[0-9a-z_+-]+@\\w+(\\.[a-z]{2,}\\w*){1,2}$");
	final static Pattern MOBILE_NUMBER = Pattern.compile("^\\d{2}\\s{1}[1-9]\\d{9}$");
	final static Pattern PASSWORD = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
}
