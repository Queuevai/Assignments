package Assignment4.ProblemStatement4;

public class BankingSystemTest {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.calculateEMI(50000.00, 4.5, 60); // $50,000 at 4.5% for 5 years
        homeLoan.approveLoan();

        System.out.println();

        CarLoan carLoan = new CarLoan();
        carLoan.calculateEMI(20000.00, 6.0, 48); // $20,000 at 6.0% for 4 years
        carLoan.approveLoan();
    }
}

