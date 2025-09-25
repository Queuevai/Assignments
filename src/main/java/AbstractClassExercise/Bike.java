package AbstractClassExercise;

class Bike extends Vehicle {
    Bike(String brand, int rentalPricePerDay) {
        super(brand, rentalPricePerDay);
    }

    @Override
    void start() {
        System.out.println("Bike is starting with a self-start button...");
    }
}

