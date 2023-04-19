import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String [] args){
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//  QUESTION #2

        //                for (int i = 1; i <= 100; i++) {
//                    if (i % 3 == 0 && i % 5 == 0) {
//                        System.out.println("FizzBuzz");
//                    } else if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                    } else if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                    } else {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }

//      QUESTION #3
        // Count by 2's from 0 to 100
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//// Count backwards by 5's from 100 to -10
//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);
//
//// Display the number squared while less than 1,000,000
//        int k = 2;
//        do {
//            System.out.println(k);
//            k = k * k;
//        } while (k < 1000000);

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }




//        QUESTION #3
//        Scanner scanner = new Scanner(System.in);
//
//        int number;
//        String choice;
//
//        do {
//            // Prompt the user to enter an integer
//            System.out.print("What number would you like to go up to? ");
//            number = scanner.nextInt();
//
//            // Display a table of squares and cubes from 1 to the value entered
//            System.out.println("\nHere is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= number; i++) {
//                System.out.printf("%-6d | %-7d | %-5d\n", i, i * i, i * i * i);
//            }
//
//            // Ask if the user wants to continue
//            System.out.print("\nWould you like to continue? (y/n) ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("y"));










//      QUESTION #4
        Scanner scanner2 = new Scanner(System.in);

        int grade;
        String choice2;

        do {
            // Prompt the user for a numerical grade
            System.out.print("Enter a numerical grade (0-100): ");
            grade = scanner2.nextInt();

            // Convert the numerical grade to a letter grade
            String letterGrade;
            if (grade >= 88 && grade <= 100) {
                letterGrade = "A";
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = "B";
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = "C";
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            // Display the corresponding letter grade
            System.out.printf("Letter grade: %s\n", letterGrade);

            // Prompt the user to continue
            System.out.print("Do you want to continue? (y/n) ");
            choice2 = scanner2.next();
        } while (choice2.equalsIgnoreCase("y"));


        scanner2.close();
    }
}







