package Assignment4.ProblemStatement6;

abstract class MenuItem {
    protected String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }

    public abstract void prepare();
}

