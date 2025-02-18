/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This project is a color guessing game, there is a color file in this program , which has 16 sets of colors
 * the player chooses which game they want to play (0-16 colors, 0-10 colors, 0-5 colors to guess from) and they have 3 chances to get
 * the right answers.
 * Due: 02/18/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Unna Lat
*/

package color;

import java.io.*;
import java.util.*;

public class ESPGame {
    
    // Constants for color options
    final static String COLOR_BLACK = "black";
    final static String COLOR_WHITE = "white";
    final static String COLOR_GRAY = "gray";
    final static String COLOR_SILVER = "silver";
    final static String COLOR_MAROON = "maroon";
    final static String COLOR_RED = "red";
    final static String COLOR_PURPLE = "purple";
    final static String COLOR_FUCHSIA = "fuchsia";
    final static String COLOR_GREEN = "green";
    final static String COLOR_LIME = "lime";
    final static String COLOR_OLIVE = "olive";
    final static String COLOR_YELLOW = "yellow";
    final static String COLOR_NAVY = "navy";
    final static String COLOR_BLUE = "blue";
    final static String COLOR_TEAL = "teal";
    final static String COLOR_AQUA = "aqua";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // Read colors from file
        List<String> colorList = readColorsFromFile("C:\\Users\\unnal\\eclipse-workspace\\Assignment1\\src\\color\\colors.txt");

        
        // Check if colors list is empty
        if (colorList.isEmpty()) {
            System.out.println("Error: colors.txt is empty or couldn't be read.");
            return;
        }
        
        int totalCorrectGuesses = 0;

       
        while (true) {
            // Display menu
            System.out.println("CMSC203 Assignment1: Test your ESP skills!");
            System.out.println("Welcome to ESP - extrasensory perception!");
            System.out.println("Would you please choose one of the 4 options from the menu:\n");
            System.out.println("1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("4- Exit from the program");
            System.out.print("Enter the option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 4) {
                // Exit from the game
                System.out.print("Enter your name: ");
                String username = scanner.nextLine();
                System.out.print("Describe yourself: ");
                String description = scanner.nextLine();
                System.out.print("Due Date: ");
                String dueDate = scanner.nextLine();
                
                // Display and write results
                System.out.println("\nGame Over");
                System.out.println("You guessed " + totalCorrectGuesses + " out of 3 colors correctly.");
                System.out.println("Due Date: " + dueDate);
                System.out.println("Username: " + username);
                System.out.println("User Description: " + description);
                System.out.println("Date: " + dueDate);
                
                // Write to output file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("EspGameResults.txt"))) {
                    writer.write("Game Over\n");
                    writer.write("You guessed " + totalCorrectGuesses + " out of 3 colors correctly.\n");
                    writer.write("Due Date: " + dueDate + "\n");
                    writer.write("Username: " + username + "\n");
                    writer.write("User Description: " + description + "\n");
                    writer.write("Date: " + dueDate + "\n");
                } catch (IOException e) {
                    System.out.println("Error writing to file.");
                }
                
                break; 
            }

            // Determine how many colors to display
            int colorsToDisplay = 0;
            if (option == 1) {
                colorsToDisplay = 16;
            } else if (option == 2) {
                colorsToDisplay = 10;
            } else if (option == 3) {
                colorsToDisplay = 5;
            }

            // Display the selected number of colors
            System.out.println("There are " + colorsToDisplay + " colors from a file:");
            for (int i = 0; i < colorsToDisplay; i++) {
                System.out.println((i + 1) + " " + colorList.get(i));
            }

            // Start the guessing game
            int correctGuesses = 0;
            for (int round = 1; round <= 3; round++) {
                System.out.println("\nRound " + round);
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.print("Enter your guess: ");
                String userGuess = scanner.nextLine().trim().toLowerCase();
                
                // Randomly pick a color from the displayed list
                int randomIndex = rand.nextInt(colorsToDisplay);
                String selectedColor = colorList.get(randomIndex);
                
                // Show the result
                System.out.println("I was thinking of " + selectedColor + ".");
                if (userGuess.equals(selectedColor)) {
                    correctGuesses++;
                }
            }
            
            // results
            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
            totalCorrectGuesses += correctGuesses;
            
            // Ask to continue the game
            System.out.print("\nWould you like to continue a Game? Type Yes/No: ");
            String continueGame = scanner.nextLine().toLowerCase();
            if (!continueGame.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    // Helper method to read colors from a file
    public static List<String> readColorsFromFile(String filename) {
        List<String> colors = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                //  ignore empty lines
                line = line.trim();
                if (!line.isEmpty()) {
                    colors.add(line.toLowerCase());  
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return colors;
    }
}
