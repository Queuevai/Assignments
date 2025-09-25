package Assignment6_1.StaticMembers.Scenario1.banking;


public class DataValidatorTest {
    public static void main(String[] args) {

        System.out.println("--- Testing DataValidator.isNotEmpty() ---");
        String validString = "hello";
        String emptyString = "";
        String nullString = null;
        String blankString = "   ";

        System.out.println("'" + validString + "' is not empty: " + DataValidator.isNotEmpty(validString)); // Expected: true
        System.out.println("'" + emptyString + "' is not empty: " + DataValidator.isNotEmpty(emptyString)); // Expected: false
        System.out.println("'" + nullString + "' is not empty: " + DataValidator.isNotEmpty(nullString));   // Expected: false
        System.out.println("'" + blankString + "' is not empty: " + DataValidator.isNotEmpty(blankString)); // Expected: false
        System.out.println();

        System.out.println("--- Testing isValid() implementations ---");
        EmailValidator emailValidator = new EmailValidator();
        PhoneValidator phoneValidator = new PhoneValidator();

        System.out.println("Email 'test@example.com' valid: " + emailValidator.isValid("test@example.com"));
        System.out.println("Email 'invalid-email' valid: " + emailValidator.isValid("invalid-email"));
        System.out.println("Email '' valid: " + emailValidator.isValid(""));
        System.out.println();

        System.out.println("Phone '123-456-7890' valid: " + phoneValidator.isValid("123-456-7890"));
        System.out.println("Phone '12345' valid: " + phoneValidator.isValid("12345"));
        System.out.println("Phone '' valid: " + phoneValidator.isValid(""));
    }
}
