/*
 * 
 */
package dungeontester.view;

import java.util.Scanner;

/**
 *
 * @author blakeheiner
 */
public class NewGameView extends View{
     
    public NewGameView() {
       super("\n"
            + "\n----------------------------------------------"
            + "\n| Creating A New Game                         |"
            + "\n----------------------------------------------"
            + "\n Please enter a savefile name below."
            + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
       
        GamePlayMenu goToGame = new GamePlayMenu();
                
        String saveFileName = getInput();
        
        if(saveFileName != null){
        
        System.out.println("\n\n==============================================");
        System.out.println("Your savefile is " + saveFileName + ".");
        System.out.println("================================================");
                
        goToGame.display();    
        
            return true;
        }
        else 
        return false;
        
        
}

}