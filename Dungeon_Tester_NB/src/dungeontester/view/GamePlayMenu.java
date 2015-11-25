/*
 * 
 */
package dungeontester.view;

/**
 *
 * @author blakeheiner
 */
public class GamePlayMenu extends View {
    
     public GamePlayMenu() {
         super("\n"
            + "\n----------------------------------------------"
            + "\n| Game Play Menu                              |"
            + "\n----------------------------------------------"
            + "\nV - View Map"
            + "\nM - Move"
            + "\nI - Inventory"
            + "\nR - Return to Main Menu"
            + "\n----------------------------------------------");
}   
    
     @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        
        switch (choice) {
            case 'V': case 'v'://view the map
                this.viewMap();
                break;
            case 'M': case 'm': //move player
                this.movePlayer();
                break;
            case 'I': case 'i': // view the inventory menu
                this.viewInventory();
                break;
            case 'R':  case 'r':// Return to Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid Selecton; Try Again ***");
                break;
                             
        }

        return false;
    }

    private void viewMap() {
        System.out.println("viewMap() fired"); 
    }

    private void movePlayer() {
        System.out.println("movePlayer() fired");  
    }
    
    public void viewInventory() {
        InventoryView inventoryMenu = new InventoryView();
        inventoryMenu.display();
    }
    
}

    

