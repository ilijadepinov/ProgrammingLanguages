package ass3;
import java.util.Scanner;

public class TextProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Text inputting code
            System.out.print("Enter text (or 'END' to finish): ");
            String text = scanner.nextLine();

            // Check whether "END" was input
            if (text.equals("END")) {
                break;
            }

            // Process the input text
            int length = text.length();
            int weight = calculateWeight(text);

            // Output the results
            System.out.println("Length: " + length);
            System.out.println("Weight: " + weight);

        } while (true); // Continue until "END" is entered

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    private static int calculateWeight(String text) {
        // Calculate the weight (sum of ASCII values of characters)
        int weight = 0;
        for (int i = 0; i < text.length(); i++) {
            weight += (int) text.charAt(i);
        }
        return weight;
    }
}
