//imports are placed all the way at the top of the page before the class
import java.util.Scanner;


public class ConsoleIONotes {
     public static void main(String[] args) {
        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you %n", name);


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the day today?");
        String userInput = scanner.next();
//        .next specifially looks for one word. if there is white space it will not read/pick it up

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.printf("you entered: %s", userInput + "\n");

        System.out.println("Enter Something: ");
        String userInput2 = scanner.nextLine();
        System.out.print("you entered: " + userInput2 + "\n");


//        using .nextInt();
         System.out.println("enter a number: ");
         int userNum = scanner.nextInt();
         System.out.print("Your favorite number is: " + userNum);
    }
}
// %s is the placeholder for your variable.