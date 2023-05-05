package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class GradesApplication {

        public void main(String[] args) {
            HashMap<String, Student> students = new HashMap<>();

            // Create four Student objects
            Student meadow = new Student("Meadow");
            meadow.addGrade(90);
            meadow.addGrade(85);
            meadow.addGrade(95);

            Student jabari = new Student("Jabari");
            jabari.addGrade(84);
            jabari.addGrade(99);
            jabari.addGrade(87);

            Student spot = new Student("Spot");
            spot.addGrade(100);
            spot.addGrade(90);
            spot.addGrade(95);

            Student arlo = new Student("Arlo");
            arlo.addGrade(85);
            arlo.addGrade(88);
            arlo.addGrade(97);

            // Add the Student objects to the HashMap
            students.put("meadowwwssss", meadow);
            students.put("jabaaazzz", jabari);
            students.put("spizzot", spot);
            students.put("ayeloww", arlo);

            // Print the names and average grades of each student
            for (String username : students.keySet()) {
                Student student = students.get(username);
                System.out.println(username + ": " + student.getName() + " - " + student.getGradeAverage());
            }
        }





    public class StudentInfo {

        public void main(String[] args) {
            // create a map that maps GitHub usernames to student information
            Map<String, Student> students = new HashMap<>();
            students.put("meadowwwssss", new Student("Meadow", 90, 85, 95));
            students.put("jabaaazzz", new Student("Jabari", 84, 99, 87));
            students.put("spizzot", new Student("Spot", 100, 90, 95));
            students.put("ayeloww", new Student("Arlo",85, 88, 97));

            Scanner scanner = new Scanner(System.in);

            while (true) {
                // print the list of GitHub usernames to the console
                System.out.println("GitHub usernames:");
                for (String username : students.keySet()) {
                    System.out.println(username);
                }

                // ask the user which student they want to see more information about
                System.out.print("Enter a GitHub username to see more information: ");
                String username = scanner.nextLine();

                // check if the given username exists in the map
                if (students.containsKey(username)) {
                    Student student = students.get(username);
                    System.out.println("Name: " + student.getName());
                    System.out.println("Grades: " + student.getGrade1() + ", " + student.getGrade2() + ", " + student.getGrade3());
                } else {
                    System.out.println("No users with that username were found.");
                }

                // ask the user if they want to continue
                System.out.print("Do you want to continue? (y/n) ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("y")) {
                    break;
                }
            }

            scanner.close();
        }

    }

    class Student {
        private String name;
        private int grade1;
        private int grade2;
        private int grade3;

        public Student(String name, int grade1, int grade2, int grade3) {
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }

        public Student(String meadow) {
        }

        public String getName() {
            return name;
        }

        public int getGrade1() {
            return grade1;
        }

        public int getGrade2() {
            return grade2;
        }

        public int getGrade3() {
            return grade3;
        }

        public void addGrade(int i) {
        }

        public String getGradeAverage() {
            return null;
        }
    }



    public class GroceryList {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user if they would like to create a grocery list
            System.out.print("Would you like to create a grocery list? (y/n): ");
            String response = input.nextLine().trim().toLowerCase();

            // Create a map to store the grocery list
            Map<String, Map<String, Integer>> groceryList = new TreeMap<>();

            // Continue to prompt the user for items if they want to create a list
            while (response.equals("y")) {
                // Prompt the user if they would like to enter a new item
                System.out.print("Would you like to enter a new item? (y/n): ");
                response = input.nextLine().trim().toLowerCase();

                // If the user wants to enter a new item
                if (response.equals("y")) {
                    // Prompt the user for the category
                    System.out.println("Enter the category:");
                    String category = input.nextLine().trim().toLowerCase();

                    // Prompt the user for the item name
                    System.out.println("Enter the name of the item:");
                    String item = input.nextLine().trim().toLowerCase();

                    // Prompt the user for the item quantity
                    System.out.println("Enter how many of the item:");
                    int quantity = input.nextInt();

                    // Add the item to the grocery list
                    Map<String, Integer> categoryMap = groceryList.getOrDefault(category, new TreeMap<>());
                    categoryMap.put(item, quantity);
                    groceryList.put(category, categoryMap);

                    // Consume the newline character
                    input.nextLine();
                }
            }

            // Display the final grocery list
            System.out.println("\nYour grocery list:");
            for (String category : groceryList.keySet()) {
                System.out.println(category.toUpperCase() + ":");
                for (String item : groceryList.get(category).keySet()) {
                    int quantity = groceryList.get(category).get(item);
                    System.out.println("- " + item + " (" + quantity + ")");
                }
            }
        }
    }


}


