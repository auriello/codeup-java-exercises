package Movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Welcome to the Movie App!");

        boolean quit = false;
        while (!quit) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies by category");
            System.out.println("0 - Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    System.out.println("\nWhich category do you want to view?");
                    String category = scanner.nextLine();
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase(category)) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the Movie App!");
    }

}
