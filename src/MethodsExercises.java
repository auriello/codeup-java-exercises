import java.util.Scanner;
public class MethodsExercises {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero error");
        }
        return (double) a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 3;



        System.out.println("Addition: " + addition(a, b));
        System.out.println("Subtraction: " + subtraction(a, b));
        System.out.println("Multiplication: " + multiplication(a, b));
        System.out.println("Division: " + division(a, b));
        System.out.println("Modulus: " + modulus(a, b));
    }





    public class MyClass {
        public static int getInteger(int min, int max) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10");
            int userInput = input.nextInt();
            if (userInput >= min && userInput <= max) {
                System.out.println("Invalid input. Please try again.");
//                userInput = getInteger(min, max); // recursion
            }
            return userInput;
        }


        public static void main(String[] args) {
            int userInput2 = getInteger(1, 10);
            System.out.println("Valid input: " + userInput2);
        }
    }}




