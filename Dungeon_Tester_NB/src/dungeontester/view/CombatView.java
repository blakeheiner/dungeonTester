/*
 * 
 */
package dungeontester.view;

import dungeontester.model.Player;

/**
 *
 * @author blakeheiner
 */
public class CombatView extends View {

    public CombatView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Combat Menu                                  |"
            + "\n----------------------------------------------"  
            + "\n"            
            + "\n You enter the room to find it not empty!"            
            + "\n"            
            + "\n F - Fight the beast!"
            + "\n R - Run far and fast; you'll fight when you "            
            + "\n     have more courage..."            
            + "\n"
            + "\n Navigation Options "
            + "\n P - View Player Stats"    
            + "\n S - Save Game"
            + "\n R - Return to previous menu/Run from the fight"
            + "\n----------------------------------------------");    
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value=value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
            
            switch (choice) {
                case 'F': case 'f':
                    this.fightMonster();
                    break;
                case 'S':  case 's':
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

    private void playerStatsHelp() {
        Player playerOne = new Player();
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }

    private void fightMonster() {
        System.out.println("fightMonster() fired");
    }

}
