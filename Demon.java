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
	public static final int MAXIMUM_HIT_POINTS = 100;
	public static final int MAXIMUM_STRENGTH = 88;

	/**
	 * Default Constructor
	 */
	public Demon() {
		super();
	}

	/**
	 * Constructor to assign hit points and strength
	 *
	 * @param hp hit points
	 * @param strength strength
	 */
	public Demon(int hp, int strength) {
		super(hp, strength);
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

	/**
	 * Hp Setter
	 *
	 * @param hp - can not be less than the MINIMUM
	 */
	@Override
	public void setHp(int hp) {
		if (hp < MAXIMUM_HIT_POINTS) {
			super.setHp(hp);
		} else {
			super.setHp(MAXIMUM_HIT_POINTS);
		}
	}

	/**
	 * Strength Setter
	 *
	 * @param strength - can not be less than the MINIMUM
	 */
	@Override
	public void setStrength(int strength) {
		if (strength < MAXIMUM_STRENGTH) {
			super.setStrength(strength);
		} else {
			super.setHp(MAXIMUM_STRENGTH);
		}
	}

	@Override
	public String toString() {
		return "Demon - Hit Points = " + getHp() + " Strength " + getStrength();
	}
}
