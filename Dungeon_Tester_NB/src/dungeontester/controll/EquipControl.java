/*
 * This control class is how the player equips an item from the backpack
 * This class is also responsible for changing the player's atributes.
 */
package dungeontester.controll;

/**
 *
 * @author blakeheiner
 */
public class EquipControl {
    
    public int calcWeight(double width, double height, double capacity, double storage){
       if(width < 1)
            return -1;
        
       if(width > 12)
            return -1; 
       
       if(height < 1)
            return -2;
        
       if(height > 24)
            return -2;
       
       if(storage == capacity - (width * height))
           return 1;
        else
           return 0;  
        
    }
    
}
