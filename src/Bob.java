import java.util.Scanner;
public class Bob {
    public static void main (String [] args){

                Scanner input = new Scanner(System.in);

                while (true) {
                    System.out.print("You: ");
                    String message = input.nextLine();

                    if (message.trim().isEmpty()) {
                        System.out.println("Bob: Fine. Be that way!");
                    } else if (message.endsWith("?")) {
                        System.out.println("Bob: Sure.");
                    } else if (message.endsWith("!")) {
                        System.out.println("Bob: Whoa, chill out!");
                    } else {
                        System.out.println("Bob: Whatever.");
                    }

                    if (message.equalsIgnoreCase("bye")) {
                        System.out.println("Bob: Bye!");
                        break;
                    }
                }
                input.close();
            }
        }

