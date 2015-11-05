/*
 * Display the map
 * Have the current location of the player marked with 'x'
 * Allow the player to advance one room or go back one room. 
 * Allow the player to call for help.
 * Allow the player to return to the game play menu
 */
package dungeontester.view;

/**
 *
 * @author blakeheiner
 */
public class MapView {
    
    private char[][] myMap;
    private int myRow = 0;
    private int myCol = 4;

    public int getMyRow() {
        return myRow;
    }

    public int getMyCol() {
        return myCol;
    }
    
    public MapView()
    {
    myMap = new char[5][5];
            for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                myMap[j][i] = ' ';
            }   
        }
        myMap[myRow][myCol] = 'x';
    }
    
    public void addRow()
    {
        myRow++;
    }
    public void subRow()
    {
        myRow--;
    }
    
    public void addCol()
    {
        myCol--;
    }
    
    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                s = s + "[" + myMap[j][i] + "]";
            }
            s = s + "\n";
        }
        return s;
    }

}
