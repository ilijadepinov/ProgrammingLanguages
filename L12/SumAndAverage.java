package ass2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoDArraySumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the two-dimensional array
        int rows = 0;
        int cols = 0;

        // Handle exceptions for invalid input
        while (true) {
            try {
                System.out.print("Enter the number of rows: ");
                rows = scanner.nextInt();

                System.out.print("Enter the number of columns: ");
                cols = scanner.nextInt();

                if (rows <= 0 || cols <= 0) {
                    throw new IllegalArgumentException("Dimensions must be positive integers.");
                }

                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Create a two-dimensional array
        int[][] array = new int[rows][cols];

        // Input elements for the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        System.out.print("Element at position (" + i + ", " + j + "): ");
                        array[i][j] = scanner.nextInt();
                        break; // Exit the loop if input is valid
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
                    }
                }
            }
        }

        // Calculate the sum and average of the elements
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                sum += element;
            }
        }

        double average = (double) sum / (rows * cols);

        // Output the results
        System.out.println("\nSum of the elements: " + sum);
        System.out.printf("Average of the elements: %.2f\n", average);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
