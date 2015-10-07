/*
 * 
 */
package dungeontester;

import dungeontester.model.Player;

/**
 * @author blakeheiner
 */
public class DungeonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Test Name");
        playerOne.setpAgility(5);
        playerOne.setpHealth(8);
        playerOne.setpStrength(12);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
