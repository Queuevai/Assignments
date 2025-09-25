package InterfaceExercise;

class UPIPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
