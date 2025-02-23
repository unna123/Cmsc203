package revel1;
import java.util.Scanner;

public class MovieDriver {
	public static class MovieApp {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String userResponse;

	        // Loop to read input for multiple movies
	        do {
	            // Create a new Movie object for each iteration
	            Movie movie = new Movie();

	            // Prompt the user to enter the title of a movie
	            System.out.print("Enter the movie title: ");
	            String title = scanner.nextLine();
	            movie.setTitle(title); // Set the title in the movie object

	            // Prompt the user to enter the movie’s rating
	            System.out.print("Enter the movie rating: ");
	            String rating = scanner.nextLine();
	            movie.setRating(rating); // Set the rating in the movie object

	            // Prompt the user to enter the number of tickets sold
	            System.out.print("Enter the number of tickets sold: ");
	            int soldTickets = scanner.nextInt();
	            movie.setSoldTickets(soldTickets); // Set the number of tickets sold in the movie object

	            // Consume the remaining newline character after reading an integer
	            scanner.nextLine(); // This will discard the remaining newline

	            // Print out the movie information using the toString method
	            System.out.println("\nMovie Information:");
	            System.out.println(movie.toString());

	            // Ask the user if they want to continue
	            System.out.print("\nDo you want to enter another movie? (yes/no): ");
	            userResponse = scanner.nextLine();

	        } while (userResponse.equalsIgnoreCase("yes")); // Continue loop if the user types "yes"

	        // Close the scanner to prevent resource leak
	        scanner.close();
	    }
	}
}
