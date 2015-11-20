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
public class Trap implements Serializable {

    //class name variables
    private String name;
    private int penalty; 
    private Room room;
    
    public Trap() {
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

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.penalty;
        return hash;
    }

    @Override
    public String toString() {
        return "Trap{" + "name=" + name + ", penalty=" + penalty + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trap other = (Trap) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.penalty != other.penalty) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
