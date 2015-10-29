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
        
            System.out.println("*                                            *"
                           + "\n* Welcome to Dungeon Tester Inc. Here we     *"
                           + "\n* test the limits of the mind and the body.  *"
                           + "\n* Adventure awaits as you ascend into the    *"
                           + "\n* dark.                                      *"
                           + "\n*                                            *"
                           + "\n* You wake up and find yourself in a dungeon *"
                           + "\n* room, on the ground next to you is a book  *"
                           + "\n* and a small dagger. You pick up the book   *"
                           + "\n* and open to the first page which says.     *"
                           + "\n*                                            *"
                           + "\n* Welcome to the newest vault co. dungeon,   *"
                           + "\n* we of vault co. thank you for your willing *"
                           + "\n* testing services of our dungeon systems.   *"
                           + "\n* We would like to remind you that at any    *"
                           + "\n* time you can shout out the word HELP and   *"
                           + "\n* receive help on how to navigate through    *"
                           + "\n* the dungeon. Keep in mind that the         *"
                           + "\n* monsters throughout the dungeon are not    *"
                           + "\n* actors and are real monsters and will harm *"
                           + "\n* you if given the chance. We have supplied  *"
                           + "\n* you with a defense mechanism, it is a      *"
                           + "\n* stick with a pointy blade of metal at the  *"
                           + "\n* end. We’ve heard these are sometimes       *"
                           + "\n* referred to as daggers but you may call it *"
                           + "\n* what you want. The only way to collect     *"
                           + "\n* your money is to leave the dungeon through *"
                           + "\n* the top floor, if you are unable to        *"
                           + "\n* complete the task your body will be left   *"
                           + "\n* to rot in the dungeon adding to the        *"
                           + "\n* atmosphere of the dungeon. Thank you for   *"
                           + "\n* testing our dungeon, we hope to see you on *"
                           + "\n* the other side!                            *"
                           + "\n*                                            *");
            System.out.println("**********************************************");
            
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
        System.out.println("\n\n==============================================");
        System.out.println("It's official");
        System.out.println("Welcome to Dungeon Tester Inc! " + player.getName());
        System.out.println("================================================");
    }

}
