/*
 * 
 */
package dungeontester;

import dungeontester.controll.RoomControl;
import dungeontester.model.Backpack;
import dungeontester.model.Challenge;
import dungeontester.model.Door;
import dungeontester.model.Game;
import dungeontester.model.Hello;
import dungeontester.model.Item;
import dungeontester.model.Map;
import dungeontester.model.Player;
import dungeontester.model.Room;
import dungeontester.model.Trap;
import dungeontester.view.StartProgramView;

/**
 * @author blakeheiner
 */
public class DungeonTester {
        
    private static Game currentGame = null;
    private static Player player = null;
        
    public static void main(String[] args) {
  
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DungeonTester.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DungeonTester.player = player;
    }
    
}
