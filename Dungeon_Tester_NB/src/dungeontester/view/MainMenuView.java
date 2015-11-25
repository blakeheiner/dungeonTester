/*
 * 
 */
package dungeontester.view;

import dungeontester.controll.GameControl;
/**
 *
 * @author blakeheiner
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
       super("\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\n----------------------------------------------"
            + "\nN - New game"
            + "\nG - Start Existing Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value=value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
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
            case 'S':  case 's':// Save the current game
                this.saveGame();
                break;
            case 'E': case 'e': // Exit the program
                return true;              
            default:
                System.out.println("\n*** Invalid Selecton; Try Again ***");
                break;                              
        }       
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame();
        
        GamePlayMenu gamePlayMenu = new GamePlayMenu();
        gamePlayMenu.display();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame() fired");
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("saveGame() fired");
    }
}
