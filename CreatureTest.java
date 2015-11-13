import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreatureTest.
 *
 * @author  Jennifer Moran
 * @version 2015.11.13
 */
public class CreatureTest
{
    /**
     * Default constructor for test class CreatureTest
     */
    public CreatureTest()
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
        Creature creature = new Creature();        
        assertEquals(10, creature.getStrength());
    }
    
    /**
     * Test setStrength method
     *
     * Valid number
     */    
    
    @Test
    public void setStrengthValid(){
        Creature creature = new Creature();     
        creature.setStrength(15);
        assertEquals(15, creature.getStrength());
    } 
    
    @Test
    public void damage(){
        Creature creature = new Creature();     
        int damage = creature.damage();
        int strength = creature.getStrength();        
        assertTrue("Damage (" + damage + ") should be less than or equal to strength (" + strength + ")", damage <= strength);
    }     
       
}
