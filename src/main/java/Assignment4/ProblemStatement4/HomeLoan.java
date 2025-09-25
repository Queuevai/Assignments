package Assignment4.ProblemStatement4;

class HomeLoan extends Loan implements ApprovalProcess {


    @Override
    public void approveLoan() {
        System.out.println("Home Loan Approved");
    }
}
