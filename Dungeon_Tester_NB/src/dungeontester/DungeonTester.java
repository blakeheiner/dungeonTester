/*
 * 
 */
package dungeontester;

import dungeontester.model.Backpack;
import dungeontester.model.Challenge;
import dungeontester.model.Door;
import dungeontester.model.Player;
import dungeontester.model.Room;
import dungeontester.model.Trap;

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
        
        Room roomOne = new Room();
        roomOne.setName("EasyRoom");
        roomOne.setRow(10);
        roomOne.setCol(15);
        
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
        
        Trap trapOne = new Trap();
        trapOne.setName("KillerTrap");
        trapOne.setPenalty(10);
        
        String trapInfo = trapOne.toString();
        System.out.println(trapOne);
        
        Door doorOne = new Door();
        doorOne.setOpen("N");
        doorOne.setRow(20);
        doorOne.setCol(15);
        
        String doorInfo = doorOne.toString();
        System.out.println(doorInfo);
        
        Backpack packOne = new Backpack();
        packOne.setCapacity(100);
        packOne.setUse("Which Item?");
        
        String packInfo = packOne.toString();
        System.out.println(packInfo);
        
        Challenge challengeOne = new Challenge();
        challengeOne.setName("Difficult Challenge");
        challengeOne.setModifier(50);
        
        String challengeInfo = challengeOne.toString();
        System.out.println(challengeInfo);
        
    }
    
}
