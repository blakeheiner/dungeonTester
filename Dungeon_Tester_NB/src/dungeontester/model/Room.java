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
public class Room implements Serializable {
    
    //class instance variables
    private int row;
    private int col;
    
    private Door[] doors;
    private Trap[] traps;
    private Item[] items;
    private Boss[] bosses;
   
    public Room() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Trap[] getTraps() {
        return traps;
    }

    public void setTraps(Trap[] traps) {
        this.traps = traps;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Boss[] getBosses() {
        return bosses;
    }

    public void setBosses(Boss[] bosses) {
        this.bosses = bosses;
    }

    @Override
    public String toString() {
        return "Room{" +  ", row=" + row + ", col=" + col + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.col;
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
        final Room other = (Room) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        return true;
    }
   
    
    
    
}
