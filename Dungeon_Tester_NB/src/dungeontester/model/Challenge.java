/*
 * This class contains the information about the various door challenges
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bhaw2-l
 */
public class Challenge implements Serializable{
    
    //class instance variables
    private String name;
    private int modifier;
    private Room room;
    
    public Challenge() {
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "Challenge{" + "name=" + name + ", modifier=" + modifier + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.modifier;
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
        final Challenge other = (Challenge) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.modifier != other.modifier) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
