/**
 * This is the class for humans - this class extends Creature Class Humans have
 * a max strength of 18 Humans have a max hit point of 30
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Human extends Creature {

	private static final int MAXIMUM_HIT_POINTS = 30;
	private static final int MAXIMUM_STRENGTH = 18;

	/**
	 * Default Constructor
	 */
	public Human() {
		super();
	}

	/**
	 * Hp Setter
	 *
	 * @param hp - can not be less than the MINIMUM
	 */
	@Override
	public void setHp(int hp) {
		if (hp > MAXIMUM_HIT_POINTS) {
			super.setHp(hp);
		} else {
			System.out.println("Hit points cannot be greater than " + MAXIMUM_HIT_POINTS);
		}
	}

	/**
	 * Strength Setter
	 *
	 * @param strength - can not be less than the MINIMUM
	 */
	@Override
	public void setStrength(int strength) {
		if (strength > MAXIMUM_STRENGTH) {
			super.setStrength(strength);
		} else {
			System.out.println("Strength cannot be greater than " + MAXIMUM_STRENGTH);
		}
	}

}
