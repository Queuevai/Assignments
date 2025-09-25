package Assignment4.ProblemStatement6;

class Burger extends MenuItem implements Deliverable {

    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger: " + itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Burger to table " + tableNumber);
    }
}

