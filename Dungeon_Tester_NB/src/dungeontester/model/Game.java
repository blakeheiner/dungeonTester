/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author blakeheiner
 */
public class Game implements Serializable{
    
    private String fileName;
    private Player player;
    private Map map;
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.fileName);
        hash = 17 * hash + Objects.hashCode(this.player);
        hash = 17 * hash + Objects.hashCode(this.map);
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
        if (!Objects.equals(this.fileName, other.fileName)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "fileName=" + fileName + ", player=" + player + ", map=" + map + '}';
    }

}
