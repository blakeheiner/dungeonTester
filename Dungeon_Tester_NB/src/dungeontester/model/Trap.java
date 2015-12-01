/*
 * There will be 1 trap per level
 */
package dungeontester.model;

import java.io.Serializable;

/**
 *
 * @author bhaw2-l
 */
public enum Trap implements Serializable {

    Level1Trap(10),
    Level2Trap(20),
    Levle3Trap(40),
    Level4Trap(80),
    Level5Trap(160);

    private final int penalty; 
    
    Trap(int penalty) {
        this.penalty = 10;
    }

    public int getPenalty() {
        return penalty;
    }

}
