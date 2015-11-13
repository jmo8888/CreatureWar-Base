import java.util.Random;

/**
 * This is the class for Elves - this class extends class Creature Elves have a
 * 10% chance to do magical damage (2x damage returned)
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Elf extends Creature {

	private static final Random r = new Random();
	private static final float PERCENTAGE = 0.10f;

	/**
	 * Default Constructor
	 */
	public Elf() {
		super(5,5);
	}

	/**
	 * Ten percent change to do magical damage which is 2x damage
	 *
	 * @return damage
	 */
	@Override
	public int damage() {
		float chance = r.nextFloat();

		if (chance <= PERCENTAGE) {
			return super.damage() * 2;
		}
		return 0;
	}

}
