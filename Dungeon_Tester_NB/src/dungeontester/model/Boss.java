/*
 * I added this by copy and pasting it in GitHub manually, lets see if it works...
 * main() still needs to be modified to interface with Boss.java (if that's what we are supposed to do..)
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
    private int pHealth;
    private int pStrength;
    private int pAgility;

    //the constructor
    public Boss() {
    }
    
    //all the getter and sender functions
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