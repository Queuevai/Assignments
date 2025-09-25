package Assignment4.ProblemStatement2;

public class VehicleServiceTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.service();
        myCar.repair();

        System.out.println(); // For better readability

        Bike myBike = new Bike("Yamaha", "FZ");
        myBike.service();
        myBike.repair();
    }
}

