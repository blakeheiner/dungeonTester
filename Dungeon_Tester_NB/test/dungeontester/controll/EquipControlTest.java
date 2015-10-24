/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeontester.controll;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bhaw2-l
 */
public class EquipControlTest {
    
    public EquipControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcWeight method, of class EquipControl.
     */
    @Test
    public void testCalcWeight() {
        
        //correct math
        System.out.println("TestOne");
        double width = 2;
        double height = 10;
        double capacity = 300;
        double storage = 280;
        EquipControl instance = new EquipControl();
        int expResult = 1;
        int result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //invalid width
        System.out.println("TestTwo");
        width = 0;
        height = 3;
        capacity = 300;
        storage = 280;
        expResult = -1;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //invalid height
        System.out.println("TestThree");
        width = 10;
        height = 0;
        capacity = 300;
        storage = 280;
        expResult = -2;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //incorrect math
        System.out.println("TestFour");
        width = 4;
        height = 10;
        capacity = 300;
        storage = 280;
        expResult = 0;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //boundary test
        System.out.println("TestFive");
        width = 12;
        height = 12;
        capacity = 300;
        storage = 156;
        expResult = 1;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //boundary test
        System.out.println("TestSix");
        width = 6;
        height = 24;
        capacity = 300;
        storage = 156;
        expResult = 1;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
        
        //boundary test
        System.out.println("TestSeven");
        width = 12;
        height = 24;
        capacity = 300;
        storage = 12;
        expResult = 1;
        result = instance.calcWeight(width, height, capacity, storage);
        assertEquals(expResult, result);
           
        
    }
    
}
