/**
 * This is the class for Balrog Demons - this class extends class Demon
 *
 * Attacks 2x each round
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Balrog extends Demon {

	/**
	 * Default Constructor
	 */
	public Balrog() {
		super();
	}

	/**
	 * Constructor to assign hit points and strength
	 *
	 * @param hp hit points
	 * @param strength strength
	 */
	public Balrog(int hp, int strength) {
		super(hp, strength);
	}

	/**
	 * Attacks 2x each round
	 *
	 * @return damage
	 */
	@Override
	public int damage() {
		return super.damage() * 2;
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
		return "Balfog - Hit Points = " + getHp() + " Strength " + getStrength();
	}

}
