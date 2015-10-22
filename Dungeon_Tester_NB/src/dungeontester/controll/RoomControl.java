/*
 * This class deals with the traps in a room and finding items in a room.
 */
package dungeontester.controll;

/**
 *
 * @author blakeheiner
 */

public class RoomControl {

    public int disarmTrap(double area, double base, double height){

        if(base <= 0 || base > 100)
            return -1;
        
        //if(base > 100)
          //  return -1;
        
        if(height <= 0 || height >100)
            return -2;
        
        //if(height > 100)
          //  return -2;

        if(area == (base * height) / 2)
            return 1;
        else
            return 0;        
        
    }
}
