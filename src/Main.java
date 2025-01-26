import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// añadidos comentarios
        //más comentarios
        while (true) {
            System.out.println("\nSimple Math Operations");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Power (base ^ exponent)");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1 -> {
                    double result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case 2 -> {
                    double result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case 3 -> {
                    double result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        double result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                }
                case 5 -> {
                    double result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
