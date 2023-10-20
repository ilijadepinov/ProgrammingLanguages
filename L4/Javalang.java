import java.lang.Math;

public class javalang {
    public static void main(String[] args) {
        double variable = 13;

        double sine = Math.sin(variable);
        double cosine = Math.cos(variable);
        double tangent = Math.tan(variable);
        double cotangent = 1 / Math.tan(variable);

        double squareRoot = Math.sqrt(variable);
        double square = Math.pow(variable, 2);
        double cube = Math.pow(variable, 3);

        double smallestLargerInteger = Math.ceil(variable);
        double largestSmallerInteger = Math.floor(variable);

        double area = Math.PI * Math.pow(variable, 2);

        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
        System.out.println("Cotangent: " + cotangent);
        System.out.println("Square root: " + squareRoot);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Smallest larger integer: " + smallestLargerInteger);
        System.out.println("Largest smaller integer: " + largestSmallerInteger);
        System.out.println("Area: " + area);
        System.out.println("Pi: " + Math.PI);
        System.out.println("E: " + Math.E);
    }
}
