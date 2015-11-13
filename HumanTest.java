import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HumanTest.
 *
 * @author  Jennifer Moran
 * @version 2015.11.13
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
        Human human = new Human();        
        assertEquals(10, human.getStrength());
    }
    
    /**
     * Test setStrength method
     *
     * Valid number
     */    
    
    @Test
    public void setStrengthValid(){
        Human human = new Human();     
        human.setStrength(15);
        assertEquals(15, human.getStrength());
    } 
    
    @Test
    public void damage(){
        Human human = new Human();     
        int damage = human.damage();
        int strength = human.getStrength();        
        assertTrue("Damage (" + damage + ") should be less than or equal to strength (" + strength + ")", damage <= strength);
    }  
}