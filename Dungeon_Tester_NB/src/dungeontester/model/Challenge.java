/*
 * This class contains the information about the various door challenges
 */
package dungeontester.model;

import java.io.Serializable;

/**
 *
 * @author bhaw2-l
 */
public enum Challenge implements Serializable{
    
    Triangle(-10, 
            "If 2 legs of a triangle are 3 and 4 what is the hypotenuse?",
            5),
    Square(-10,
           "Given the sides of a square are 5 and 5 what is the area?",
           25),
    Rectangle(-10,
              "Given the sides of a rectangle are 5 and 12 what is/n"
                      + "it's diagonal?",
              13);
    
    private final int modifier;
    private final String question;
    private final int answer;
    
    Challenge(int modifier, String question, int answer) {
        this.modifier = 0;
        this.question = "You are one lucky soul!";
        this.answer = 0;
    }

    public int getModifier() {
        return modifier;
    }
   
    public String getQuestion(){
    	return question;
    }
    
    public int getAnswer() {
	return answer;
    }
}
