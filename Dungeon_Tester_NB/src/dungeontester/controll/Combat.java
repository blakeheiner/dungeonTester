/*
 * This control class does combat between Player and Boss
 * It will call the Player class for attributes 
 * It will also call the Boss class for attributes

 * This class could have several functions such as fight, block, run
 * we could let the player chose what they want to do...
 */
package dungeontester.controll;

/**
 *
 * @author blakeheiner
 */
public class Combat {
    
    public int fight(int pHealth, int pStrength, int pAgility,
                     int bHealth, int bStrength, int bAgility){
        
        if(pHealth <= 0 || pStrength <= 0 || pAgility <= 0||
           bHealth <= 0 || bStrength <= 0 || bAgility <= 0)
            return 0;
        
        //I'm working attacks like force = speed*mass
        //except attack = strength*agility

        // return 0: error
        // return 1: player wins
        // return 2: boss wins
        
        int pAttack = pStrength * pAgility;
        int bAttack = bStrength * bAgility;
      
                do {
                    
                    bHealth -= pAttack;
                    pHealth -= bAttack;
                        
                }while (pHealth > 0 && bHealth > 0);
            
                    if(pHealth <= 0)
                        return 2;
                    else if(bHealth <=0)
                        return 1;
                    else 
                        return 0;

    }
}
