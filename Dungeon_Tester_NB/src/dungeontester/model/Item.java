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
public class Item implements Serializable{
    
    //class instance variables
    private String name;
    private int weight;
    private int healthBonus;
    private int strengthBonus;
    private int agilityBonus;

    public Item() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }

    public void setAgilityBonus(int agilityBonus) {
        this.agilityBonus = agilityBonus;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", weight=" + weight + ", healthBonus=" + healthBonus + ", strengthBonus=" + strengthBonus + ", agilityBonus=" + agilityBonus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.weight;
        hash = 43 * hash + this.healthBonus;
        hash = 43 * hash + this.strengthBonus;
        hash = 43 * hash + this.agilityBonus;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (this.healthBonus != other.healthBonus) {
            return false;
        }
        if (this.strengthBonus != other.strengthBonus) {
            return false;
        }
        if (this.agilityBonus != other.agilityBonus) {
            return false;
        }
        return true;
    }
    
    
    
    
}
