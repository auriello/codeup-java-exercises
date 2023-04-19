import java.util.Scanner;
public class ConsoleExercise {
    public static void main (String [] args){
        double pi = 3.14159;
    System.out.printf("The value of pi is approximately %.2f", pi);


// enter an integer
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);



// have user enter 3 words

                Scanner scanner2 = new Scanner(System.in);

                // Prompt the user to enter the first word
                System.out.print("Enter the first word: ");
                String word1 = scanner2.nextLine();

                // Prompt the user to enter the second word
                System.out.print("Enter the second word: ");
                String word2 = scanner2.nextLine();

                // Prompt the user to enter the third word
                System.out.print("Enter the third word: ");
                String word3 = scanner2.nextLine();

                // Display the words back on the console, each on a new line
                System.out.println("You entered:");
                System.out.println(word1);
                System.out.println(word2);
                System.out.println(word3);

// enter a sentence



                // Create a Scanner object to read input from the user
                Scanner scanner3 = new Scanner(System.in);

                // Prompt the user to enter a sentence
                System.out.print("Enter a sentence: ");
                String sentence = scanner3.nextLine(); // Store the entered sentence in a String variable

                // Display the entered sentence back to the user
                System.out.println("You entered: " + sentence);


//                LENGTH & WIDTH of classroom

                // Create a Scanner object to read input from the user
                Scanner scanner4 = new Scanner(System.in);

                // Prompt the user to enter the length of the classroom
                System.out.print("Enter the length of the classroom: ");
                String lengthStr = scanner4.nextLine(); // Get user input for length as a string
                double length = Double.parseDouble(lengthStr); // Parse the length string to a double

                // Prompt the user to enter the width of the classroom
                System.out.print("Enter the width of the classroom: ");
                String widthStr = scanner4.nextLine(); // Get user input for width as a string
                double width = Double.parseDouble(widthStr); // Parse the width string to a double

                // Calculate the area of the classroom
                double area = length * width;
                double perimeter = (2 * length) + (2 * width);
                // Display the calculated area to the user
                System.out.println("The area of the classroom is: " + area);
                System.out.println("The perimeter of the classroom is: " + perimeter);

            }
        }








