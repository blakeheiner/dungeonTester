/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author bhaw2-l
 */
public class Trap implements Serializable {

    public Trap() {
    }
    
    
    
    //class name variables
    private String name;
    private int penalty; 

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
