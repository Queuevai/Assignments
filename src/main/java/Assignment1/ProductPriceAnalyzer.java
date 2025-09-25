package Assignment1;

import java.util.Scanner;
import java.util.Arrays; // Using Arrays for a slightly different approach

public class ProductPriceAnalyzer {
    public static void main(String[] args) {
        Scanner inputSource = new Scanner(System.in);

        System.out.print("Enter product cost from Vendor A: ");
        Double vendorACost = inputSource.nextDouble();
        System.out.print("Enter product cost from Vendor B: ");
        Double vendorBCost = inputSource.nextDouble();
        System.out.print("Enter product cost from Vendor C: ");
        Double vendorCCost = inputSource.nextDouble();

        Double[] allCosts = {vendorACost, vendorBCost, vendorCCost};
        Arrays.sort(allCosts);

        double minimumPrice = allCosts[0];
        double maximumPrice = allCosts[allCosts.length - 1];

        String optimalVendor;
        if (minimumPrice == vendorACost) {
            optimalVendor = "Vendor A";
        } else if (minimumPrice == vendorBCost) {
            optimalVendor = "Vendor B";
        } else {
            optimalVendor = "Vendor C";
        }

        double priceSpreadPercentage = (maximumPrice > 0) ? ((maximumPrice - minimumPrice) / maximumPrice) * 100 : 0.0;

        System.out.println("--- Pricing Data ---");
        System.out.println("Vendor A: $" + String.format("%.2f", vendorACost));
        System.out.println("Vendor B: $" + String.format("%.2f", vendorBCost));
        System.out.println("Vendor C: $" + String.format("%.2f", vendorCCost));
        System.out.println("Optimal Purchase From: " + optimalVendor + " at $" + String.format("%.2f", minimumPrice));
        System.out.println("Percentage Price Dispersion: " + String.format("%.2f", priceSpreadPercentage) + "%");

        inputSource.close();
    }
}
