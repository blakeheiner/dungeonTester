/*
 * 
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author blakeheiner
 */
public class Map implements Serializable{
    
    private int rowCount;
    private int colCount;
    private Door[][] doors;

    public Map(int rowCount, int colCount) {
       
        if(rowCount < 1 || colCount < 1){
            System.out.println("The nuber of rows and columns must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.colCount = colCount;
        
        // create 2-D array for Door objects
        this.doors = new Door[rowCount][colCount];
        
        for (int row = 0; row < rowCount; row++){
            for (int col = 0; col < colCount; col++){
                Door door = new Door();
                door.setCol(col);
                door.setRow(row);
                door.setOpen(false);
                
                doors[row][col] = door;
            }
        }
    }
    
    public Map() {
    }

    public Door[][] getDoors() {
        return doors;
    }

    public void setDoors(Door[][] doors) {
        this.doors = doors;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.rowCount;
        hash = 59 * hash + this.colCount;
        hash = 59 * hash + Arrays.deepHashCode(this.doors);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.doors, other.doors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", doors=" + doors + '}';
    }
    
    
}
