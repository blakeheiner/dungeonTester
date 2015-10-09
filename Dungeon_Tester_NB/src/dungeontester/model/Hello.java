/*
 * TThis is the Main menu of sorts.
 * The 'Hello' class contains a boolean value (new or returning player)
 * as well as the fileName either way.
 */
package dungeontester.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author blakeheiner
 */
public class Hello implements Serializable {
    
    // class instance variables
    private boolean isNew;
    private String fileName;

    public Hello() {
    }
    
    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.isNew ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.fileName);
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
        final Hello other = (Hello) obj;
        if (this.isNew != other.isNew) {
            return false;
        }
        if (!Objects.equals(this.fileName, other.fileName)) {
            return false;
        }
        return true;
     
        
        
    } 

    @Override
    public String toString() {
        return "Hello{" + "isNew=" + isNew + ", fileName=" + fileName + '}';
    }

    public void isIsNew(String aTrue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
