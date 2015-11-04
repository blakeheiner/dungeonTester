/*
 * 
 */
package dungeontester.view;

import dungeontester.view.HelpMenuView;
import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\n----------------------------------------------"
            + "\nN - New game"
            + "\nG - Start Existing Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nM - Game Menu Test"
            + "\nD - Door Menu Test"
            + "\nE - Exit"
            + "\n----------------------------------------------";
    
    void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E' && selection != 'e'); // an selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
            
            // prompt the user for a player's name
            System.out.println("Enter selection below: ");
            
            //get the name from the keyboard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            // if the name is invalid (less than two characters in length))
            if (input.length() > 1) {
                System.out.println("Invalid selection");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return input;
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'N': case 'n'://create and start a new game 
                this.startNewGame();
                break;
            case 'G': case 'g': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': case 'h': // display the help menu
                this.displayHelpMenu();
                break;
            case 'M': case 'm': //test to link game menu
                this.displayGameMenu();
                break;
            case 'D': case 'd': //test to link door view
                this.displayDoorMenu();
                break;
                
            case 'S':  case 's':// Save the current game
                this.saveGame();
                break;
                
            case 'E': case 'e': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selecton; Try Again ***");
                break;
                
                        
        }
    }

    private void startNewGame() {
        System.out.println("startNewGame() fired");
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() fired");
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("saveGame() fired");
    }

    private void displayGameMenu() {
        GamePlayMenu gameMenu = new GamePlayMenu();
        gameMenu.displayMenu();
    }

    private void displayDoorMenu() {
        DoorView doorMenu = new DoorView();
        doorMenu.getInput();
    }
    
}
