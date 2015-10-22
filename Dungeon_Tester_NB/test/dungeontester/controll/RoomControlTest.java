/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("Test One");
        double area = 16;
        double base = 4;
        double height = 8;
        RoomControl instance = new RoomControl();
        int expResult = 1;
        int result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        System.out.println("Test Two");
        area = 16;
        base = 2;
        height = 4;
        expResult = 0;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        System.out.println("Test Three");
        area = 16;
        base = -1;
        height = 4;
        expResult = -1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
        
        System.out.println("Test Four");
        area = 16;
        base = 101;
        height = 4;
        expResult = -1;
        result = instance.disarmTrap(area, base, height);
        assertEquals(expResult, result);
                
    }
    
}
