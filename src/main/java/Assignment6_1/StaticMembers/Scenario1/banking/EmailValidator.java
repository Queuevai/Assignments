package Assignment6_1.StaticMembers.Scenario1.banking;


class EmailValidator implements DataValidator {

    @Override
    public boolean isValid(String email) {
        if (!DataValidator.isNotEmpty(email)) {
            System.out.println("Email cannot be empty.");
            return false;
        }
        boolean isValidFormat = email.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        if (!isValidFormat) {
            System.out.println("Invalid email format: " + email);
        }
        return isValidFormat;
    }
}
