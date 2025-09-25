package Assignment4.ProblemStatement4;

abstract class Loan {

    public void calculateEMI(double principal, double rate, int tenureMonths) {

        double monthlyRate = (rate / 12) / 100;
        if (monthlyRate == 0) {
            double emi = principal / tenureMonths;
            System.out.printf("EMI for $%.2f is $%.2f/month%n", principal, emi);
            return;
        }

        double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)
                / (Math.pow(1 + monthlyRate, tenureMonths) - 1);
        System.out.printf("Loan EMI for $%.2f is $%.2f/month%n", principal, emi);
    }
}

