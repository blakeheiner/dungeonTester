/*
 * 
 */
package dungeontester.controll;

import dungeontester.DungeonTester;
import dungeontester.model.Game;
import dungeontester.model.Map;
import dungeontester.model.Player;

/**
 *
 * @author blakeheiner
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        DungeonTester.setCurrentGame(game); // save in DungeonTester
        
        game.setPlayer(player); // save player in game
        
        
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        
    }
    
}
