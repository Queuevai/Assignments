package AbstractClassExercise;

class Car extends Vehicle {
    Car(String brand, int rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }
}