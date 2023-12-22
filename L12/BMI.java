package ass1;
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate age
        int currentYear = 2023; // Update this to the current year
        int age = currentYear - yearOfBirth;

        // Calculate BMI
        double bodyMassIndex = weight / (height * height);

        // Output the results
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age + " years");
        System.out.printf("Body Mass Index (BMI): %.2f\n", bodyMassIndex);
    }
}
