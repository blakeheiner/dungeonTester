/*
 * 
 */
package dungeontester.controll;

import dungeontester.model.Boss;
import dungeontester.model.Challenge;
import dungeontester.model.Door;
import dungeontester.model.Item;
import dungeontester.model.Map;
import dungeontester.model.Room;
import dungeontester.model.Trap;

/**
 *
 * @author blakeheiner
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5,5);
        return null;
       
    }
   
    //create array of rooms (function)
    private static void createRooms(){
        Room rooms[] = new Room[25];
        
        Room startingRoom = new Room();
        startingRoom.setRow(4);
        startingRoom.setCol(0);
        startingRoom.setItem(Item.Dagger);
        rooms[0] = startingRoom;
        
        Room floorOneRoomOne = new Room();
        floorOneRoomOne.setRow(4);
        floorOneRoomOne.setCol(1);
        floorOneRoomOne.setItem(Item.Buckler);
        rooms[1] = floorOneRoomOne;

        Room floorOneRoomTwo = new Room();
        floorOneRoomTwo.setRow(4);
        floorOneRoomTwo.setCol(2);
        floorOneRoomOne.setTrap(Trap.Level1Trap);
        rooms[2] = floorOneRoomTwo;
        
        Room floorOneRoomThree = new Room();
        floorOneRoomThree.setRow(4);
        floorOneRoomThree.setCol(3);
        floorOneRoomThree.setItem(Item.Cloak);
        rooms[3] = floorOneRoomThree;
        
        Room floorOneRoomFour = new Room();
        floorOneRoomFour.setRow(4);
        floorOneRoomFour.setCol(4);
        floorOneRoomFour.setBoss(Boss.Orc);
        rooms[4] = floorOneRoomFour;
        
        Room floorTwoRoomZero = new Room();
        floorTwoRoomZero.setRow(3);
        floorTwoRoomZero.setCol(0);
        floorTwoRoomZero.setItem(Item.RingOfPower);
        rooms[5] = floorTwoRoomZero;
        
        Room floorTwoRoomOne = new Room();
        floorTwoRoomOne.setRow(3);
        floorTwoRoomOne.setCol(1);
        floorTwoRoomOne.setItem(Item.LeatherArmor);
        rooms[6] = floorTwoRoomOne;
        
        Room floorTwoRoomTwo = new Room();
        floorTwoRoomTwo.setRow(3);
        floorTwoRoomTwo.setCol(2);
        floorTwoRoomTwo.setItem(Item.LongSword);
        rooms[7] = floorTwoRoomTwo;
        
        Room floorTwoRoomThree = new Room();
        floorTwoRoomThree.setRow(3);
        floorTwoRoomThree.setCol(3);
        floorTwoRoomThree.setTrap(Trap.Level2Trap);
        rooms[8] = floorTwoRoomThree;
        
        Room floorTwoRoomFour = new Room();
        floorTwoRoomFour.setRow(3);
        floorTwoRoomFour.setCol(4);
        floorTwoRoomFour.setBoss(Boss.DarkWizzard);
        rooms[9] = floorTwoRoomFour;
        
        Room floorThreeRoomZero = new Room();
        floorThreeRoomZero.setRow(2);
        floorThreeRoomZero.setCol(0);
        floorThreeRoomZero.setItem(Item.ChainMail);
        rooms[10] = floorThreeRoomZero;
        
        Room floorThreeRoomOne = new Room();
        floorThreeRoomOne.setRow(2);
        floorThreeRoomOne.setCol(1);
        floorThreeRoomOne.setTrap(Trap.Levle3Trap);
        rooms[11] = floorThreeRoomOne;
        
        Room floorThreeRoomTwo = new Room();
        floorThreeRoomTwo.setRow(2);
        floorThreeRoomTwo.setCol(2);
        floorThreeRoomTwo.setItem(Item.BroadSword);
        rooms[12] = floorThreeRoomTwo;
        
        Room floorThreeRoomThree = new Room();
        floorThreeRoomThree.setRow(2);
        floorThreeRoomThree.setCol(3);
        floorThreeRoomThree.setItem(Item.RingOfPower);
        rooms[13] = floorThreeRoomThree;
        
        Room floorThreeRoomFour = new Room();
        floorThreeRoomFour.setRow(2);
        floorThreeRoomFour.setCol(4);
        floorThreeRoomFour.setBoss(Boss.Dragon);
        rooms[14] = floorThreeRoomFour;
        
        Room floorFourRoomZero = new Room();
        floorFourRoomZero.setRow(1);
        floorFourRoomZero.setCol(0);
        floorFourRoomZero.setItem(Item.SilverArmor);
        rooms[15] = floorFourRoomZero;
        
        Room floorFourRoomOne = new Room();
        floorFourRoomOne.setRow(1);
        floorFourRoomOne.setCol(1);
        floorFourRoomOne.setItem(Item.LongSword);
        rooms[16] = floorFourRoomOne;
        
        Room floorFourRoomTwo = new Room();
        floorFourRoomTwo.setRow(1);
        floorFourRoomTwo.setCol(2);
        floorFourRoomTwo.setItem(Item.Buckler);
        rooms[17] = floorFourRoomTwo;
        
        Room floorFourRoomThree = new Room();
        floorFourRoomThree.setRow(1);
        floorFourRoomThree.setCol(3);
        floorFourRoomThree.setTrap(Trap.Level4Trap);
        rooms[18] = floorFourRoomThree;
        
        Room floorFourRoomFour = new Room();
        floorFourRoomFour.setRow(1);
        floorFourRoomFour.setCol(4);
        floorFourRoomFour.setBoss(Boss.Hydra);
        rooms[19] = floorFourRoomFour;
        
        Room floorFiveRoomZero = new Room();
        floorFiveRoomZero.setRow(0);
        floorFiveRoomZero.setCol(0);
        floorFiveRoomZero.setTrap(Trap.Level5Trap);
        rooms[20] = floorFiveRoomZero;
        
        Room floorFiveRoomOne = new Room();
        floorFiveRoomOne.setRow(0);
        floorFiveRoomOne.setCol(1);
        floorFiveRoomOne.setItem(Item.Shield);
        rooms[21] = floorFiveRoomOne;
        
        Room floorFiveRoomTwo = new Room();
        floorFiveRoomTwo.setRow(0);
        floorFiveRoomTwo.setCol(2);
        floorFiveRoomTwo.setItem(Item.IronArmor);
        rooms[22] = floorFiveRoomTwo;
        
        Room floorFiveRoomThree = new Room();
        floorFiveRoomThree.setRow(0);
        floorFiveRoomThree.setCol(3);
        floorFiveRoomThree.setItem((Item.SteelArmor));
        rooms[23] = floorFiveRoomThree;
        
        Room floorFiveRoomFour = new Room();
        floorFiveRoomFour.setRow(0);
        floorFiveRoomFour.setCol(4);
        floorFiveRoomFour.setBoss(Boss.Craken);
        rooms[24] = floorFiveRoomThree;
         
        
    }
        
    //assign rooms to each door (function)
    private static void assignRoomsToDoors(Map map, Room[] rooms){
        Door doors[][] = map.getDoors();
        
        //start point
        doors[4][0].setRoom(rooms[0]);
        doors[4][1].setRoom(rooms[1]);
        doors[4][2].setRoom(rooms[2]);
        doors[4][3].setRoom(rooms[3]);
        doors[4][4].setRoom(rooms[4]);
        doors[3][0].setRoom(rooms[5]);
        doors[3][1].setRoom(rooms[6]);
        doors[3][2].setRoom(rooms[7]);
        doors[3][3].setRoom(rooms[8]);
        doors[3][4].setRoom(rooms[9]);
        doors[2][0].setRoom(rooms[10]);
        doors[2][1].setRoom(rooms[11]);
        doors[2][2].setRoom(rooms[12]);
        doors[2][3].setRoom(rooms[13]);
        doors[2][4].setRoom(rooms[14]);
        doors[1][0].setRoom(rooms[15]);
        doors[1][1].setRoom(rooms[16]);
        doors[1][2].setRoom(rooms[17]);
        doors[1][3].setRoom(rooms[18]);
        doors[1][4].setRoom(rooms[19]);
        doors[0][0].setRoom(rooms[20]);
        doors[0][1].setRoom(rooms[21]);
        doors[0][2].setRoom(rooms[22]);
        doors[0][3].setRoom(rooms[23]);
        doors[0][4].setRoom(rooms[24]);
        
        
    }
    
    private static void assignChallengeToDoors(Map map){
        Door doors[][] = map.getDoors();
        
        doors[0][0].setChallenge(Challenge.Triangle);
        doors[0][1].setChallenge(Challenge.Rectangle);
        doors[0][2].setChallenge(Challenge.Square);
        doors[0][3].setChallenge(Challenge.Triangle);
        doors[0][4].setChallenge(Challenge.Rectangle);
        doors[1][0].setChallenge(Challenge.Square);
        doors[1][1].setChallenge(Challenge.Triangle);
        doors[1][2].setChallenge(Challenge.Rectangle);
        doors[1][3].setChallenge(Challenge.Square);
        doors[1][4].setChallenge(Challenge.Triangle);
        doors[2][0].setChallenge(Challenge.Rectangle);
        doors[2][1].setChallenge(Challenge.Square);
        doors[2][2].setChallenge(Challenge.Triangle);
        doors[2][3].setChallenge(Challenge.Rectangle);
        doors[2][4].setChallenge(Challenge.Square);
        doors[3][0].setChallenge(Challenge.Triangle);
        doors[3][1].setChallenge(Challenge.Rectangle);
        doors[3][2].setChallenge(Challenge.Square);
        doors[3][3].setChallenge(Challenge.Triangle);
        doors[3][4].setChallenge(Challenge.Rectangle);
        doors[4][0].setChallenge(Challenge.Square);
        doors[4][1].setChallenge(Challenge.Triangle);
        doors[4][2].setChallenge(Challenge.Rectangle);
        doors[4][3].setChallenge(Challenge.Square);
        doors[4][4].setChallenge(Challenge.Triangle);
        
    }
}
    
    

