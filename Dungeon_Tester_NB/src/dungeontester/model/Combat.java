/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;

/**
 *
 * @author blakeheiner
 */
public class Combat implements Serializable{
    
    private boolean isWinner;

    public Combat() {
    }
    
    public boolean isIsWinner() {
        return isWinner;
    }

    public void setIsWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.isWinner ? 1 : 0);
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
        final Combat other = (Combat) obj;
        if (this.isWinner != other.isWinner) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Combat{" + "isWinner=" + isWinner + '}';
    }
    
    
    
    
}
