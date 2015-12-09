/*
 * This class has information on the doors themselves
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bhaw2-l
 */
public class Door implements Serializable{
    
    //class instance variables
    private boolean open;
    private int row;
    private int col;
    
    private Room room;
    
    private Challenge challenge;

    public Door() {
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean getOpen() {
        return true;
    }

    public void setOpen(boolean open) {
        this.open = open;
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

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.open);
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.col;
        hash = 97 * hash + Objects.hashCode(this.room);
        hash = 97 * hash + Objects.hashCode(this.challenge);
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
        final Door other = (Door) obj;
        if (!Objects.equals(this.open, other.open)) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        if (this.challenge != other.challenge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Door{" + "open=" + open + ", row=" + row + ", col=" + col + ", room=" + room + ", challenge=" + challenge + '}';
    }

  
}
