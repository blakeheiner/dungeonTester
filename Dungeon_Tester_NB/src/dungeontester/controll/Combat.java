/*
 * This control class does combat between Player and Boss
 * It will call the Player class for attributes 
 * It will also call the Boss class for attributes
 */
package dungeontester.controll;

/**
 *
 * @author blakeheiner
 */
public class Combat {
    
    public int fight(int pHealth, int pStrength, int pAgility,
                     int bHealth, int bStrength, int bAgility,
                     int mapLevel){
        
        //I'm working attacks like force = speed*mass
        //except attack = strength*agility

        // return 0: error
        // return 1: player wins
        // return 2: boss wins
        
        int pAttack = pStrength * pAgility;
        int bAttack = bStrength * bAgility;
        
        switch(mapLevel){
            case 0:
                do {
                    
                    
                    
                } while(pHealth < 0 || bHealth < 0);
            break;
            
                case 1:
                    //statement
                break;
            
                    case 2:
                        //statement
                    break;
            
                        case 3:
                            //statement
                        break;
            
                            case 4:
                                //statement
                            break;
            
            default:
                //statement
        }

        return 0;

    }
}
