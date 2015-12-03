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
    private String open;
    private int row;
    private int col;
    
    private Challenge challenge;

    public Door() {
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
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
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.open);
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.col;
        hash = 89 * hash + Objects.hashCode(this.challenge);
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
        if (this.challenge != other.challenge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Door{" + "open=" + open + ", row=" + row + ", col=" + col + ", challenge=" + challenge + '}';
    }

    
    
}
