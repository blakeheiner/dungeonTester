/*
 * This class contains the stats for the bosses.
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author blakeheiner
 */
public class Boss implements Serializable {
    
    //class instance variables
    private String name;
    private int pHealth; // starts at 25 and doubles per level
    private int pStrength; // starts at 3 and increases by 2 per level
    private int pAgility; // starts at 3 and increases by 2 per leve
    private Room room;
    
    //the constructor
    public Boss() {
    }
    
    public Room getRoom() {
        return room;
    }

    //all the getter and sender functions
    public void setRoom(Room room) {    
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpHealth() {
        return pHealth;
    }

    public void setpHealth(int pHealth) {
        this.pHealth = pHealth;
    }

    public int getpStrength() {
        return pStrength;
    }

    public void setpStrength(int pStrength) {
        this.pStrength = pStrength;
    }

    public int getpAgility() {
        return pAgility;
    }

    public void setpAgility(int pAgility) {
        this.pAgility = pAgility;
    }

    //toString()
    @Override
    public String toString() {
        return "Boss{" + "name=" + name + ", pHealth=" + pHealth + ", pStrength=" + pStrength + ", pAgility=" + pAgility + '}';
    }
    
    //equals() and hashCode()

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.pHealth;
        hash = 53 * hash + this.pStrength;
        hash = 53 * hash + this.pAgility;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Boss other = (Boss) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.pHealth != other.pHealth) {
            return false;
        }
        if (this.pStrength != other.pStrength) {
            return false;
        }
        if (this.pAgility != other.pAgility) {
            return false;
        }
        return true;
        
        
    }
    
    
}
