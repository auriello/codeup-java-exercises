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
    }



    public static class FactorialCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number;
            long factorial;
            char choice;

            do {
                System.out.print("Enter an integer between 1 and 10: ");
                number = input.nextInt();

                while (number < 1 || number > 10) {
                    System.out.print("Invalid input. Enter an integer between 1 and 10: ");
                    number = input.nextInt();
                }

                factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                System.out.printf("%d! = %d\n", number, factorial);

                System.out.print("Do you want to continue? (y/n): ");
                choice = input.next().charAt(0);
            } while (choice == 'y' || choice == 'Y');
        }
    }



    public static class DiceRoller {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of sides for a pair of dice: ");
            int sides = input.nextInt();

            char choice;
            do {
                int roll1 = rollDice(sides);
                int roll2 = rollDice(sides);

                System.out.printf("You rolled %d and %d.\n", roll1, roll2);

                System.out.print("Roll again? (y/n): ");
                choice = input.next().charAt(0);
            } while (choice == 'y' || choice == 'Y');
        }

        public static int rollDice(int sides) {
            return (int) (Math.random() * sides) + 1;
        }
    }

}




