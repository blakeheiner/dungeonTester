/*
 * 
 */
package dungeontester.controll;

/**
 *
 * @author blakeheiner
 */



public class RoomControl {

    public boolean disarmTrap(double area, double base, double height){
        
        boolean trapStatus;
        int error;
        String errorCodeOne = "Base is invalid! Trap fires!";
        String errorCodeTwo = "Height is invalid! Trap fires";
                
        if(base <= 0)
            error = -1;
        else 
            error = 0;
        
        if(base > 100)
            error = -1;
                
        if(error == -1)
            System.out.println(errorCodeOne);
        
        if(height <= 0)
            error = -2;
        else 
            error = 0;
        
        if(height > 100)
            error = -2;
       
        else if(error == -2)
            System.out.println(errorCodeTwo);
            
        if(area == (base * height) / 2)
            trapStatus = true;
        else
            trapStatus = false;
                
        return trapStatus;
        
        
        
    }
}
