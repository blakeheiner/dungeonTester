/*
 * This class tests roomControl
 */
package dungeontester.controll;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blakeheiner
 */
public class RoomControlTest {
    
    public RoomControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of disarmTrap method, of class RoomControl.
     */
    @Test
    public void testDisarmTrap() {
        
        //correct math
        System.out.println("Test One");
        double area = 16;
        double base = 4;
        double height = 8;
        RoomControl instance = new RoomControl();
        int expResult = 1;
        int result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //incorrect math 
        System.out.println("Test Two");
        area = 16;
        base = 2;
        height = 4;
        expResult = 0;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //invalid base
        System.out.println("Test Three");
        area = 16;
        base = -1;
        height = 4;
        expResult = -1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //invalid height
        System.out.println("Test Four");
        area = 16;
        base = 2;
        height = 101;
        expResult = -2;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //test height boundary
        System.out.println("Test Five");
        area = 600;
        base = 12;
        height = 100;
        expResult = 1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //test base boundary
        System.out.println("Test Six");
        area = 600;
        base = 100;
        height = 12;
        expResult = 1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        //test both boundaries
        System.out.println("Test Seven");
        area = 5000;
        base = 100;
        height = 100;
        expResult = 1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
    }
    
}
