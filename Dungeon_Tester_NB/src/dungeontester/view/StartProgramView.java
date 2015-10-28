/*
  startProgram(): void
 BEGIN
  Display the banner screen
  Get the players name
  Create a new player
  DISPLAY a customized welcome message
  DISPLAY the main menu
 END
 */
package dungeontester.view;

import dungeontester.controll.ProgramControl;
import dungeontester.model.Player;
import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public class StartProgramView {
    
    public StartProgramView() {
    }
    
    public void startProgram() {
        // Display the banner to the screen
        this.displayBanner();
    
        // prompt the player to enter their name Retrieve the name of the player
        String playerName = this.getPlayerName();
        
        // create and save the player object
        Player player = ProgramControl.createPlayer(playerName);
        
        // display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
    }

    public void displayBanner() {
        System.out.println("\n\n*********************************************");
        
            System.out.println("*                                           *"
                           + "\n* generic test text                         *"
                           + "\n*                                           *");
            System.out.println("*********************************************");
            
    }

    public String getPlayerName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playerName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt the user for a player's name
            System.out.println("Enter the player's name below: ");
            
            //get the name from the keyboard and trim off the blanks
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            
            // if the name is invalid (less than two characters in length))
            if (playerName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return playerName;
        
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("Welcome to Dungeon Tester Inc. " + player.getName());
        System.out.println("===============================================");
    }

}
