/*
 * 
 */
package dungeontester.view;

import dungeontester.controll.RoomControl;
import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public class DoorView {
    
    /* private final String MENU = "\n"
            + "\n----------------------------------------------"
            + "\n| Door                                       |"
            + "\n----------------------------------------------"
            + "\n You've come upon a door but this no ordinary "
            + "\n door.  The following challenge appears on the door"
            + "\n"
            + "\n I hope you've brushed up on your math! "
            + "\n If you want to enter this room, you must understand triangles "
            + "\n and how to calculate their area. "
            + "\n Tell the base, height and area of a triangle."    
            + "\n If you are correct, you will move on."
            + "\n If you're wrong... I'm not going to be held responsible for "
            + "\n what happens to you."    
            + "\n And you should have studied in class!"
            + "\n----------------------------------------------";
    
    private void displayMenu() {
            
            System.out.println(MENU); // display the main menu
            
            while()
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
    
    }
    */
    public void getInput() {
        
        System.out.println("You've come to a door!");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Height:");
        int height;
        height = in.nextInt();
        System.out.println(height +" is the Height you entered!");
        
        System.out.println("Enter a Base: ");
        int base;
        base = in.nextInt();
        System.out.println(base +" is the Base you entered!");
        
        System.out.println("Enter an Area: ");
        int area;
        area = in.nextInt();
        System.out.println(area +" is the Area you entered!");
        
        RoomControl roomTrap = new RoomControl();
        int result = roomTrap.disarmTrap(area, base, height);
        
        System.out.println(result);
        
        
        }
        
}
