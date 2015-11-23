import java.util.Random;

/**
 * This is the class for humans - this class extends Creature Class Humans have
 * a max strength of 18 Humans have a max hit point of 30
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Human extends Creature {

	public static final int MAXIMUM_HIT_POINTS = 30;
	public static final int MAXIMUM_STRENGTH = 18;

	/**
	 * Default Constructor
	 */
	public Human() {
		super();
	}

	/**
	 * Constructor to assign hit points and strength
	 *
	 * @param hp hit points
	 * @param strength strength
	 */
	public Human(int hp, int strength) {
		super(hp, strength);
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
		return "Human - Hit Points = " + getHp() + " Strength " + getStrength();
	}

}
