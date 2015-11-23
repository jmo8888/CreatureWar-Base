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
	public static final int MAXIMUM_HIT_POINTS = 50;
	public static final int MAXIMUM_STRENGTH = 38;

	/**
	 * Default Constructor
	 */
	public Elf() {
		super();
	}

	/**
	 * Constructor to assign hit points and strength
	 *
	 * @param hp hit points
	 * @param strength strength
	 */
	public Elf(int hp, int strength) {
		super(hp, strength);
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
		return super.damage();
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
		return "Elf - Hit Points = " + getHp() + " Strength " + getStrength();
	}

}
