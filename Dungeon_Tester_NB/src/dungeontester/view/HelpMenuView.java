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
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super("\n"
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
            + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered  
            
            switch (choice) {
                case 'S':  case 's':// Save the current game
                    this.saveGame();
                    break;
                case 'P': case 'p':
                    this.playerStatsHelp();
                    break;
                case 'R': case 'r':
                    return true;   
                default:
                    System.out.println("\n*** Invalid Selecton; Try Again ***");
                    break;     
    }
        return false;
}

    private void saveGame() {
         System.out.println("saveGame() fired");
         
    }

    private boolean playerStatsHelp() {
        Player playerOne = new Player();
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        return false;
    }

}
