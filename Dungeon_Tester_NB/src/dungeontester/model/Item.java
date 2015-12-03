/*
 * There will be 3 rooms with items in them per level
 */
package dungeontester.model;

import java.io.Serializable;
//import java.util.Objects;

/**
 *
 * @author bhaw2-l
 */
public enum Item implements Serializable{
    
    Dagger(0, 5, 3, 5),
    ShortSword(1, 0, 3, 2),
    LongSword(1, 0, 5, 2),
    BroadSword(2, 1, 7, 0),
    RingOfPower(2, 3, 9, 3),
    Buckler(1, 10, 0, -1),
    Shield(2, 50, 1, 0),
    ChainMail(2, 40, 0, -1),
    LeatherArmor(1, 30, 1, 0),
    IronArmor(5, 100, 5, -2),
    SteelArmor(6, 150, 6, -2),
    SilverArmor(3, 200, 10, -1),
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
