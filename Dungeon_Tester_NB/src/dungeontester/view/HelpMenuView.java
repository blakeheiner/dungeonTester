/*
 * 
 */
package dungeontester.view;

import dungeontester.model.Player;
import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public class HelpMenuView {

        private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Help Menu                                  |"
            + "\n----------------------------------------------"
            + "\n In this game logic prevails when in doubt "
            + "\n think critically about what is happening."
            + "\n"
            + "\n So far as equiping items and such you only "
            + "\n have two hands, one head for one helmet, one "
            + "\n set of feet for one pair of boots or shoes. "
            + "\n You get the idea."    
            + "\n"
            + "\n Navigation Options "
            + "\n P - View Player Stats"    
            + "\n S - Save Game"
            + "\n R - Return to previous menu"
            + "\n----------------------------------------------";
        
    void displayMenu() {
                
        char selection = ' ';
        do {
            
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'R' && selection != 'r'); // an selection is not "Exit"
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

    private void doAction(char selection) {
            
            switch (selection) {
                case 'S':  case 's':// Save the current game
                    this.saveGame();
                    break;
                case 'R': case 'r':
                    return;
                case 'P': case 'p':
                    Player playerOne = new Player();
        
                    String playerInfo = playerOne.toString();
                    System.out.println(playerInfo);
                  //this.playerStatsHelp();
                    return;
                default:
                    System.out.println("\n*** Invalid Selecton; Try Again ***");
                    break;     
    }
}

    private void saveGame() {
         System.out.println("saveGame() fired");
         
    }

    //private void playerStatsHelp() {
        //System.out.println("Health = 100 Strength = 24 Agility = 18");
    //    Player playerOne = new Player();
        
    //    String playerInfo = playerOne.toString();
     //   System.out.println(playerInfo);
   // }

}
