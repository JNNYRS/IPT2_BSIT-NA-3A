package com.mycompany.multiply;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the multiplication
        double result = num1 * num2;

        // Display the result
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);
    }
}
