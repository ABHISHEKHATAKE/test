import java.util.Scanner;

public class AddNumbers {
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        double sum = add(first, second);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
