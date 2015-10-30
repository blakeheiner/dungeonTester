/*
 * This class contains the player name and stats.
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author blakeheiner
 */
public class Player implements Serializable {
    
    
    //Class instance variables
    private String name;
    private int pHealth = 100; // starts at 100
    private int pStrength = 5; // starts at 5 
    private int pAgility = 5; // starts at 5
    private int pLuck = 5; // starts at 5
    private boolean rightHand = false;
    private boolean leftHand = false;
    private boolean bodyArmor = false;
    private boolean feet = false;
    private boolean head = false;
    
    //constructor
    public Player() {
    }

    /*
     * This is all the getter and setter functions
     * for all instance variables.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpHealth() {
        return pHealth;
    }

    public void setpHealth(int pHealth) {
        this.pHealth = pHealth;
    }

    public int getpStrength() {
        return pStrength;
    }

    public void setpStrength(int pStrength) {
        this.pStrength = pStrength;
    }

    public int getpAgility() {
        return pAgility;
    }

    public void setpAgility(int pAgility) {
        this.pAgility = pAgility;
    }
    
    public int getpLuck(){
        return pLuck;
    }
    
    public void setpLuck(int pLuck){
        this.pLuck = pLuck;
    }

    public boolean isRightHand() {
        return rightHand;
    }

    public void setRightHand(boolean rightHand) {
        this.rightHand = rightHand;
    }

    public boolean isLeftHand() {
        return leftHand;
    }

    public void setLeftHand(boolean leftHand) {
        this.leftHand = leftHand;
    }

    public boolean isBodyArmor() {
        return bodyArmor;
    }

    public void setBodyArmor(boolean bodyArmor) {
        this.bodyArmor = bodyArmor;
    }

    public boolean isFeet() {
        return feet;
    }

    public void setFeet(boolean feet) {
        this.feet = feet;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }
    
    //here is our toString()

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", pHealth=" + pHealth + ", pStrength=" + pStrength + ", pAgility=" + pAgility + ", pLuck=" + pLuck + ", rightHand=" + rightHand + ", leftHand=" + leftHand + ", bodyArmor=" + bodyArmor + ", feet=" + feet + ", head=" + head + '}';
    }

    //here is the hashCode()
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.pHealth;
        hash = 59 * hash + this.pStrength;
        hash = 59 * hash + this.pAgility;
        hash = 59 * hash + this.pLuck;
        hash = 59 * hash + (this.rightHand ? 1 : 0);
        hash = 59 * hash + (this.leftHand ? 1 : 0);
        hash = 59 * hash + (this.bodyArmor ? 1 : 0);
        hash = 59 * hash + (this.feet ? 1 : 0);
        hash = 59 * hash + (this.head ? 1 : 0);
        return hash;
    }

    //This is the equals()
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.pHealth != other.pHealth) {
            return false;
        }
        if (this.pStrength != other.pStrength) {
            return false;
        }
        if (this.pAgility != other.pAgility) {
            return false;
        }
        if (this.pLuck != other.pLuck) {
            return false;
        }
        if (this.rightHand != other.rightHand) {
            return false;
        }
        if (this.leftHand != other.leftHand) {
            return false;
        }
        if (this.bodyArmor != other.bodyArmor) {
            return false;
        }
        if (this.feet != other.feet) {
            return false;
        }
        if (this.head != other.head) {
            return false;
        }
        return true;
    }

}
    
