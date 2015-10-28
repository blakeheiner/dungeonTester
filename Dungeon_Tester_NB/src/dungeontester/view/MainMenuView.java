/*
 * 
 */
package dungeontester.view;

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
            + "\nG - Start Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n----------------------------------------------";
    
    void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // an selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the selection has been retrieved
        char selection;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid selection has not been retrieved
            
            // prompt the user for selection
            System.out.println("Enter your selection: ");
            
            //get the selection from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
                    
            // if the selection is invalid send error message
            if (selection != 'G' || selection != 'H' || selection != 'S' || selection != 'E') {
                System.out.println("*** Invalid Seleciton Try Again ***");
                continue; // and repeat again
            }
            break; // out of the (exit) repetition
        }
        
        return selection;
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'N': //create and start a new game 
                this.startNewGame();
                break;
            case 'G': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // Save the current game
                this.saveGame();
                break;
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selecton; Try Again ***");
                break;
                
                        
        }
    }

    private void startNewGame() {
        System.out.println("statrNewGame() fired");
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() fired");
    }

    private void displayHelpMenu() {
        System.out.println("displayHelpMenu() fired");
    }

    private void saveGame() {
        System.out.println("saveGame() fired");
    }
    
}
