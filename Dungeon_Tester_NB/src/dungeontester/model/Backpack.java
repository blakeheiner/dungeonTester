/*
 * This class is an inventory of items the player is currently carrying
 * Items that are equiped will have an '*' next to them.
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bhaw2-l
 */
public class Backpack implements Serializable{
    
    //class instance variables
    private int capacity;
    private String use;

    public Backpack() {
    }
    
    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "Backpack{" + "capacity=" + capacity + ", use=" + use + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.capacity;
        hash = 73 * hash + Objects.hashCode(this.use);
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
        final Backpack other = (Backpack) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        if (!Objects.equals(this.use, other.use)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
