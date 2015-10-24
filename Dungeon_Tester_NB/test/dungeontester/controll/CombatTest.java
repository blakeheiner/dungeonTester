/*
 * This is the test for the combat class 
 */
package dungeontester.controll;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blakeheiner
 */
public class CombatTest {
    
    public CombatTest() {
    }

    /**
     * Test of fight method, of class Combat.
     */
    @Test
    public void testFight() {
        System.out.println("Player Wins");
        int pHealth = 100;
        int pStrength = 5;
        int pAgility = 5;
        int bHealth = 25;
        int bStrength = 3;
        int bAgility = 3;
        Combat instance = new Combat();
        int expResult = 1;
        int result = instance.fight(pHealth, pStrength, pAgility, 
                                    bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Boss Wins");
        pHealth = 50;
        pStrength = 5;
        pAgility = 5;
        bHealth = 250;
        bStrength = 3;
        bAgility = 3;
        expResult = 2;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid pHealth");
        pHealth = 0;
        pStrength = 5;
        pAgility = 5;
        bHealth = 25;
        bStrength = 3;
        bAgility = 3;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid pStrength");
        pHealth = 100;
        pStrength = 0;
        pAgility = 5;
        bHealth = 25;
        bStrength = 3;
        bAgility = 3;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid pAgility");
        pHealth = 100;
        pStrength = 5;
        pAgility = 0;
        bHealth = 25;
        bStrength = 3;
        bAgility = 3;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid bHealth");
        pHealth = 100;
        pStrength = 5;
        pAgility = 5;
        bHealth = 0;
        bStrength = 3;
        bAgility = 3;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid bStrength");
        pHealth = 100;
        pStrength = 5;
        pAgility = 5;
        bHealth = 25;
        bStrength = 0;
        bAgility = 3;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
        
        System.out.println("Invalid bAgility");
        pHealth = 100;
        pStrength = 5;
        pAgility = 5;
        bHealth = 25;
        bStrength = 3;
        bAgility = 0;
        expResult = 0;
        result = instance.fight(pHealth, pStrength, pAgility, 
                                bHealth, bStrength, bAgility);
        assertEquals(expResult, result);
    }
    
}
