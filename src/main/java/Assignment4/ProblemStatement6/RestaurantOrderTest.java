package Assignment4.ProblemStatement6;

public class RestaurantOrderTest {
    public static void main(String[] args) {
        // Pizza order
        Pizza margheritaPizza = new Pizza("Margherita");
        margheritaPizza.prepare();
        margheritaPizza.deliver(5);

        System.out.println();

        // Burger order
        Burger veggieBurger = new Burger("Veggie Burger");
        veggieBurger.prepare();
        veggieBurger.deliver(2);
    }
}

