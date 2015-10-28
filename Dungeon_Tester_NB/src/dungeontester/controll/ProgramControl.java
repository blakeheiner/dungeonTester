/*
 * 
 */
package dungeontester.controll;

import dungeontester.DungeonTester;
import dungeontester.model.Player;

/**
 *
 * @author blakeheiner
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if(name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        DungeonTester.setPlayer(player); // save the player
        
        return player;
    }
    
}
