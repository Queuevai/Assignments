package Assignment5.InterfaceStaticMethod;

class PhoneValidator implements DataValidator {

    @Override
    public boolean isValid(String phoneNumber) {
        if (!DataValidator.isNotEmpty(phoneNumber)) {
            System.out.println("Phone number cannot be empty.");
            return false;
        }
        boolean isValidFormat = phoneNumber.matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
        if (!isValidFormat) {
            System.out.println("Invalid phone number format: " + phoneNumber);
        }
        return isValidFormat;
    }
}

