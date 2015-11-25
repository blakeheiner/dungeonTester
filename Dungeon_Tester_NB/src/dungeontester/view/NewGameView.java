/*
 * 
 */
package dungeontester.view;

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
        String fileName = (String) obj;
       
       if(fileName.length() > 1){
           GamePlayMenu goToGame = new GamePlayMenu();
           goToGame.display();
           return true;
       }
       else
       return false;
    }
}