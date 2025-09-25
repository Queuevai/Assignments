package Assignment1;

import java.util.Scanner;

public class LoanInstallmentCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Provide Loan Principal Amount : ");
        Double capitalAmount = userInput.nextDouble();
        System.out.print("Provide Yearly Interest Rate (e.g., 7.5 for 7.5%): ");
        Float annualRate = userInput.nextFloat();
        System.out.print("Provide Loan Duration in Years: ");
        Integer durationYears = userInput.nextInt();

        double periodicRate = annualRate / (12.0 * 100.0);
        int totalPeriods = durationYears * 12;

        double numerator = capitalAmount * periodicRate * Math.pow(1 + periodicRate, totalPeriods);
        double denominator = Math.pow(1 + periodicRate, totalPeriods) - 1;
        double equatedMonthlyInstallment = numerator / denominator;

        double aggregatePayment = equatedMonthlyInstallment * totalPeriods;

        System.out.println("Monthly Installment: " + String.format("%.2f", equatedMonthlyInstallment));
        System.out.println("Cumulative Payment: " + String.format("%.2f", aggregatePayment));

        userInput.close();
    }
}
