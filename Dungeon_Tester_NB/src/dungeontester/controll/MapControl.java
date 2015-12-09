/*
 * 
 */
package dungeontester.controll;

import dungeontester.model.Challenge;
import dungeontester.model.Door;
import dungeontester.model.Item;
import dungeontester.model.Map;
import dungeontester.model.Room;

/**
 *
 * @author blakeheiner
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5,5);
       
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
        
    }
        
    //assign rooms to each door (function)
    private static void assignRoomsToDoors(Map map, Room[] rooms){
        Door doors[][] = map.getDoors();
        
        //start point
        doors[0][0].setRoom(rooms[0]);
        doors[0][1].setRoom(rooms[1]);
        
    }
    
    private static void assignChallengeToDoors(Map map){
        Door doors[][] = map.getDoors();
        
        doors[0][0].setChallenge(Challenge.Triangle);
        doors[0][1].setChallenge(Challenge.Rectangle);
        
    }
}
    
    

