package Assignment1;

import java.util.Scanner;

public class AnnualTaxProjection {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.print("Enter employee's gross monthly remuneration: ");
        double monthlyRemuneration = consoleInput.nextDouble();

        double yearlyEarnings = monthlyRemuneration * 12.0;
        double taxLiability = 0.0;

        double earningsInLakhs = yearlyEarnings / 100000.0;

        if (earningsInLakhs <= 2.5) {
            taxLiability = 0.0;
        } else if (earningsInLakhs <= 5.0) {
            taxLiability = (yearlyEarnings - 250000.0) * 0.05;
        } else if (earningsInLakhs <= 10.0) {
            taxLiability = (250000.0 * 0.05);
            taxLiability += (yearlyEarnings - 500000.0) * 0.20;
        } else {
            taxLiability = (250000.0 * 0.05);
            taxLiability += (500000.0 * 0.20);
            taxLiability += (yearlyEarnings - 1000000.0) * 0.30;
        }

        double takeHomeEarnings = yearlyEarnings - taxLiability;

        System.out.println("\n--- Financial Summary ---");
        System.out.println("Gross Annual Income: $" + String.format("%.2f", yearlyEarnings));
        System.out.println("Estimated Tax Due: $" + String.format("%.2f", taxLiability));
        System.out.println("Net Annual Income: $" + String.format("%.2f", takeHomeEarnings));

        consoleInput.close();
    }
}
