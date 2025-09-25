package customexceptions.atm;

public class ATM {
    private static final String VALID_PIN = "1234"; // Constant valid PIN

    /**
     * Validates the entered PIN against the system's valid PIN.
     *
     * @param enteredPin The PIN string entered by the user.
     * @throws InvalidPinException if the PIN is incorrect or not exactly 4 digits.
     */
    public void validatePin(String enteredPin) throws InvalidPinException {
        if (enteredPin == null || enteredPin.length() != 4) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }
        if (!enteredPin.equals(VALID_PIN)) {
            throw new InvalidPinException("Incorrect PIN.");
        }
        // If no exception is thrown, PIN is valid
    }
}
