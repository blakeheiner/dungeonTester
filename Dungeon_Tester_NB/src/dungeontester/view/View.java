/*
 * 
 */
package dungeontester.view;

import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public abstract class View implements ViewInterface {
   
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        String value = "";
        boolean done = false;
        
        do{
            System.out.println(this.displayMessage); //display prompt message
            value = this.getInput(); // get value end user entered
            done = this.doAction(value); // do action based on value entered
        }while (!done);
    }
    
    @Override
    public String getInput(){
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid){
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length() < 1){
                System.out.println("You must enter a value.");
                continue;
            }
            break;
        }
        
        return selection;
    }
}
