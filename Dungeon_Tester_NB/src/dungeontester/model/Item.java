/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bhaw2-l
 */
public enum Item implements Serializable{
    
    ShortSword(1, 0, 1, 2),
    LongSword(1, 0, 3, 2),
    BroadSword(2, 1, 4, 0),
    RingOfPower(2, 3, 5, 3),
    Buckler(1, 2, 0, -1),
    Shield(2, 3, 1, 0),
    Cloak(0, 1, 0, 4);
    
    //class instance variables
    private final int weight;
    private final int healthBonus;
    private final int strengthBonus;
    private final int agilityBonus;

    Item(int weight, int healthBonus, int strengthBonus, int agilityBonus){
        this.weight = 0;
        this.healthBonus = 0;
        this.strengthBonus = 0;
        this.agilityBonus = 0;
    }

    public int getWeight() {
        return weight;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }

}
