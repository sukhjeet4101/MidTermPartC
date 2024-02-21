* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author khush
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = input.nextInt();

        // Validate user's choice
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice. Please enter a number between 1 and " + genres.length + ".");
            return;
        }

        // Create UserProfile object
        UserProfile userProfile = new UserProfile(name, genres[choice - 1]);

        // Display message
        System.out.println("User profile created successfully.");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}