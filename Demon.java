import java.util.Random;

/**
 * This is the class for Demons - this class extends class Creature Demons have
 * a 5% chance to do magical damage (damage +50)
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Demon extends Creature {

	private static final Random r = new Random();
	private static final float PERCENTAGE = 0.05f;

	/**
	 * Default Constructor
	 */
	public Demon() {
		super();
	}

	/**
	 * Five percent change to do magical damage which is damage + 50
	 *
	 * @return damage
	 */
	@Override
	public int damage() {
		float chance = r.nextFloat();

		if (chance <= PERCENTAGE) {
			return super.damage() + 50;
		}
		return 0;
	}
}
