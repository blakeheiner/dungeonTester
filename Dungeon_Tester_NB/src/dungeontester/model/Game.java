/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;

/**
 *
 * @author blakeheiner
 */
public class Game implements Serializable{
    
    private double totalTimePlayed;
    
    public Game() {
    }
    
    public double getTotalTimePlayed() {
        return totalTimePlayed;
    }

    public void setTotalTimePlayed(double totalTimePlayed) {
        this.totalTimePlayed = totalTimePlayed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalTimePlayed) ^ (Double.doubleToLongBits(this.totalTimePlayed) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTimePlayed) != Double.doubleToLongBits(other.totalTimePlayed)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTimePlayed=" + totalTimePlayed + '}';
    }
    
    
    
}
