/*
 * This class contains the stats for the bosses.
 */
package dungeontester.model;

import java.io.Serializable;

/**
 * @author blakeheiner
 */
public enum Boss implements Serializable {
    
    Orc(25, 3, 3),
    Wizzard(50, 5, 5),
    Dragon(100, 7, 7),
    Hydra(200, 9, 9),
    Craken(400, 12, 12);
   
    private int bHealth; // starts at 25 and doubles per level
    private int bStrength; // starts at 3 and increases by 2 per level
    private int bAgility; // starts at 3 and increases by 2 per leve

    
    //the constructor
    Boss(int bHealth, int bStrength, int bAgility) {
        this.bHealth = 25;
        this.bStrength = 3;
        this.bAgility = 3;
    }

    public int getbHealth() {
        return bHealth;
    }

    public int getbStrength() {
        return bStrength;
    }

    public int getbAgility() {
        return bAgility;
    }
    
}
