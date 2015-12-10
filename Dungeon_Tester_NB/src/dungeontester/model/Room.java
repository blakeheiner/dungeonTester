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
    
    private Trap trap;
    private Item item;
    private Boss bosse;
   
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

    public Trap getTrap() {
        return trap;
    }

    public void setTrap(Trap trap) {
        this.trap = trap;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Boss getBosse() {
        return bosse;
    }

    public void setBosse(Boss bosse) {
        this.bosse = bosse;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.col;
        hash = 97 * hash + Objects.hashCode(this.trap);
        hash = 97 * hash + Objects.hashCode(this.item);
        hash = 97 * hash + Objects.hashCode(this.bosse);
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
        if (this.trap != other.trap) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        if (this.bosse != other.bosse) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Room{" + "row=" + row + ", col=" + col + ", trap=" + trap + ", item=" + item + ", bosse=" + bosse + '}';
    }

    public void setBoss(Boss boss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
