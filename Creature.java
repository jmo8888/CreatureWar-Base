import java.util.Random;

/**
 * This is the base class for creature - all types of creature will extend this
 * class
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Creature {

	private int hp;
	private int strength;
	private static final int MINIMUM = 5;
	private static final Random random = new Random();

	/**
	 * Constructor default hit points and strength to 10
	 */
	public Creature() {
		hp = 10;
		strength = 10;
	}

	/**
	 * Constructor to assign hit points and strength
	 *
	 * @param hp hit points
	 * @param strength strength
	 */
	public Creature(int hp, int strength) {
		this.hp = hp;
		this.strength = strength;
	}

	/**
	 * Returns a random int for damage that can be a random number from 1 to
	 * strength
	 *
	 * @return damage
	 */
	public int damage() {
		return random.nextInt(getStrength() + 1);
	}

	/**
	 * Hp Getter
	 *
	 * @return hit points
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * Hp Setter
	 *
	 * @param hp - can not be less than the MINIMUM
	 */
	public void setHp(int hp) {
		if (hp > MINIMUM) {
			this.hp = hp;
		} else {
			this.hp = MINIMUM;
		}
	}

	/**
	 * Strength Getter
	 *
	 * @return strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Strength Setter
	 *
	 * @param strength - can not be less than the MINIMUM
	 */
	public void setStrength(int strength) {
		if (strength > MINIMUM) {
			this.strength = strength;
		} else {
			this.strength = MINIMUM;
		}
	}

	@Override
	public String toString() {
		return "Creature - Hit Points = " + getHp() + " Strength " + getStrength();
	}
}
