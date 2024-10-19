/**
 * The following program is a calculator. It is meant to do basic operations.
 * The user inputs what they need and the program will solve it for them.
 */

import java.util.Scanner;

public class CalculatorProj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculating = true;

        System.out.println("Please enter the problem: ");

        while (calculating) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char opeterator = scanner.next().charAt(0);

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
        }
    }
}
