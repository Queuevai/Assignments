package Assignment5.StaticPolymorphism;

public class MathOperations {

    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    public int add(int[] numbers) {
        System.out.println("Adding an array of integers:");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

