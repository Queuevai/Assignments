package AbstractClassExercise;

public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2000);
        Vehicle bike = new Bike("Yamaha", 800);

        System.out.println("--- Car Details ---");
        car.displayDetails();
        car.start();

        System.out.println("\n--- Bike Details ---");
        bike.displayDetails();
        bike.start();
    }
}
