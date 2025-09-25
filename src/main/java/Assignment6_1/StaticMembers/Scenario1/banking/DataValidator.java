package Assignment6_1.StaticMembers.Scenario1.banking;


interface DataValidator {

    static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    boolean isValid(String input);
}
