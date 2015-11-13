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
            + "\nM - Game Menu Test"
            + "\nD - Door Menu Test"            
            + "\nR - Map Menu Test"
            + "\nC - Combat Menu Test"
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
                return true;
            case 'R': case 'r':
                this.mapView();   
            case 'C': case'c':
                this.combatView();
                
            default:
                System.out.println("\n*** Invalid Selecton; Try Again ***");
                break;       
                        
        }
        
        return false;
    }

    private void startNewGame() {
        System.out.println("startNewGame() fired");
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

    private void displayGameMenu() {
        GamePlayMenu gameMenu = new GamePlayMenu();
        gameMenu.displayMenu();
    }

    private void displayDoorMenu() {
        DoorView doorMenu = new DoorView();
        doorMenu.getInput();
    }

    private void mapView() {
        MapView mapView = new MapView();
        System.out.println(mapView.toString());
    }

    private void combatView() {
        CombatView combatView = new CombatView();
        combatView.display();
    }
    
}
