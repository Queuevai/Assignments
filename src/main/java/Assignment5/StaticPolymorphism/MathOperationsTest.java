package Assignment5.StaticPolymorphism;

public class MathOperationsTest {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sumInt = math.add(5, 10);
        System.out.println("Sum of integers: " + sumInt); // Expected: 15
        System.out.println();

        double sumDouble = math.add(3.5, 2.7);
        System.out.println("Sum of doubles: " + sumDouble); // Expected: 6.2
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        int sumArray = math.add(intArray);
        System.out.println("Sum of array elements: " + sumArray); // Expected: 15
    }
}

