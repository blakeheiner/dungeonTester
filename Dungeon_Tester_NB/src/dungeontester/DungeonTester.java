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
        
        Hello initialHello = new Hello();
        initialHello.setIsNew(true);
        initialHello.setFileName("Game One");
       
        System.out.println(initialHello);
       
        Game gameOne = new Game();
        gameOne.setTotalTimePlayed(12.30);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Map gameMap = new Map();
        gameMap.setColCount(5);
        gameMap.setRowCount(5);
        
        String mapInfo = gameMap.toString();
        System.out.println(mapInfo);
        
        Item itemOne = new Item();
        itemOne.setName("Ring of Awesomeness");
        itemOne.setWeight(12);
        itemOne.setHealthBonus(10);
        itemOne.setStrengthBonus(15);
        itemOne.setHealthBonus(12);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //Trap Test 1
        RoomControl trapTest = new RoomControl();
        boolean testOne = trapTest.disarmTrap(16, 2, 4);
        System.out.println(testOne);
        boolean testTwo = trapTest.disarmTrap(16, 4, 8);
        System.out.println(testTwo);
        boolean testThree = trapTest.disarmTrap(16, 0, 2);
        boolean testFour = trapTest.disarmTrap(16, 101, 2);
        boolean testFive = trapTest.disarmTrap(16, 2, 0);
        boolean testSix = trapTest.disarmTrap(16, 2, 100);
        boolean testSeven = trapTest.disarmTrap(16, 0, 0);
        boolean testEight = trapTest.disarmTrap(16, 101, 101);
        // above should return true
      
    }
    
}
