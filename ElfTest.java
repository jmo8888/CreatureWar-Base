import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfTest.
 *
 * @author  Jennifer Moran
 * @version 2015.11.13
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {      
    }
/**
     * Test getStrength method
     *
     * Should be value set in constructor
     */    
    
    @Test
    public void getStrength(){
        Elf elf = new Elf();        
        assertEquals(5, elf.getStrength());
    }
    
    /**
     * Test setStrength method
     *
     * Valid number
     */    
    
    @Test
    public void setStrengthValid(){
        Elf elf = new Elf();     
        elf.setStrength(15);
        assertEquals(15, elf.getStrength());
    } 
    
    @Test
    public void damage(){
        Elf elf = new Elf();     
        int damage = elf.damage();
        int strength = elf.getStrength();        
        assertTrue("Damage (" + damage + ") should be less than or equal to strength (" + strength + ")", damage <= strength * 2);
    }  
}
