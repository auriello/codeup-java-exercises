package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return (input.equals("y") || input.equals("yes"));
    }

    public static int getInt(int min, int max) {
        int input = getInt();
        while (input < min || input > max) {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            input = getInt();
        }
        return input;
    }

    public static int getInt() {
        int input = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer: ");
            }
        }
        return input;
    }

    public double getDouble(double min, double max) {
        double input = getDouble();
        while (input < min || input > max) {
            System.out.printf("Please enter a number between %f and %f: ", min, max);
            input = getDouble();
        }
        return input;
    }

    public double getDouble() {
        double input = 0.0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return input;
    }}



