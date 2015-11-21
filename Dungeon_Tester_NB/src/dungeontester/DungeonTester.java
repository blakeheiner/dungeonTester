/*
 * 
 */
package dungeontester;

import dungeontester.model.Game;
import dungeontester.model.Player;
import dungeontester.view.StartProgramView;

/**
 * @author blakeheiner
 */
public class DungeonTester {
        
    private static Game currentGame = null;
    private static Player player = null;
        
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
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
