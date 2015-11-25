/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester.view;

/**
 *
 * @author bhaw2-l
 */
public class InventoryView extends View {
    
    public InventoryView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Inventory Menu                             |"
            + "\n----------------------------------------------"
            + "\n This is your backpack.  In your backpack you "
            + "\n will carry weapons, food and specialty items."
            + "\n You can view your items or equip them from "
            + "\n this view. " 
            + "\n"
            + "\n Navigation Options "
            + "\n V - View Inventory"    
            + "\n U - Use or Equip Items"
            + "\n R - Return to previous menu"
            + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered  
            
            switch (choice) {
                case 'V':  case 'v':// Save the current game
                    this.viewEquipment();
                    break;
                case 'U':  case 'u':// Save the current game
                    this.useEquipment();
                    break;
                case 'R': case 'r':
                    return true;   
                default:
                    System.out.println("\n*** Invalid Selecton; Try Again ***");
                    break;     
    }
        return false;
}

    private void saveGame() {
         System.out.println("saveGame() fired");
    }

    private void viewEquipment() {
        System.out.println("viewEquipment() fired");
    }

    private void useEquipment() {
        System.out.println("useEquipment() fired");
    }
    

}

    

