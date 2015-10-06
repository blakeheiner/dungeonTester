/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author blakeheiner
 */
public class Player implements Serializable {
    
    
    //Class instance variables
    private String name;
    private int pHealth;
    private int pStrength;
    private int pAgility;

    public Player() {
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

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", pHealth=" + pHealth + ", pStrength=" + pStrength + ", pAgility=" + pAgility + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Player other = (Player) obj;
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
