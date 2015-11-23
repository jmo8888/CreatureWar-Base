import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * This is the main class for the CreatureWar Two armies are created and go to
 * battle - only one wins
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class CreatureWar {

	private final Random random = new Random();
	private ArrayList<Creature> army1 = new ArrayList<>();
	private ArrayList<Creature> army2 = new ArrayList<>();
	private static final int SOLDIERS = 20;
	private static final char HUMAN = 'H';
	private static final char ELF = 'E';
	private static final char DEMON = 'D';
	private static final char BALROG = 'B';

	public CreatureWar(char army1Species, char army2Species) {
		army1 = populateArmy(army1Species);
		army2 = populateArmy(army2Species);
	}

	private ArrayList<Creature> populateArmy(char armySpecies) {
		ArrayList<Creature> army = new ArrayList<>();
		switch (armySpecies) {
		case HUMAN:
			for (int i = 0; i < SOLDIERS; i++) {
				army.add(new Human(random.nextInt(Human.MAXIMUM_HIT_POINTS), random.nextInt(Human.MAXIMUM_STRENGTH)));
			}
			break;
		case ELF:
			for (int i = 0; i < SOLDIERS; i++) {
				army.add(new Elf(random.nextInt(Elf.MAXIMUM_HIT_POINTS) + 5, random.nextInt(Elf.MAXIMUM_STRENGTH) + 5));
			}
			break;
		case DEMON:
			for (int i = 0; i < SOLDIERS; i++) {
				army.add(new Demon(random.nextInt(Demon.MAXIMUM_HIT_POINTS) + 5, random.nextInt(Demon.MAXIMUM_STRENGTH) + 5));
			}
			break;
		case BALROG:
			for (int i = 0; i < SOLDIERS; i++) {
				army.add(new Balrog(random.nextInt(Demon.MAXIMUM_HIT_POINTS) + 5, random.nextInt(Demon.MAXIMUM_STRENGTH) + 5));
			}
			break;
		default:
			for (int i = 0; i < SOLDIERS; i++) {
				army.add(new Human(random.nextInt(Human.MAXIMUM_HIT_POINTS), random.nextInt(Human.MAXIMUM_STRENGTH)));
			}
			break;
		}
		return army;
	}

	public void fight() {
		System.out.println("<++++++++++++++++++++Begin the war++++++++++++++++++++++++++++++++++>");
		int army1Points = 0;
		int army2Points = 0;
		Iterator a1It = army1.iterator();
		Iterator a2It = army2.iterator();
		while (a1It.hasNext() && a2It.hasNext()) {
			Creature a1Creature = (Creature) a1It.next();
			Creature a2Creature = (Creature) a2It.next();
			System.out.println("<+++++++++++++++++++Before the battle+++++++++++++++++++++++++++++++>");
			System.out.println("Army 1 " + a1Creature.toString());
			System.out.println("Army 2 " + a2Creature.toString());
			System.out.println("<+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>");
			a1Creature.setHp(a1Creature.getHp() - a2Creature.damage());
			a2Creature.setHp(a2Creature.getHp() - a1Creature.damage());
			System.out.println("<+++++++++++++++++++After the battle+++++++++++++++++++++++++++++++++>");
			System.out.println("Army 1 " + a1Creature.toString());
			System.out.println("Army 2 " + a2Creature.toString());
			System.out.println("<+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>");
			if (a1Creature.getHp() < a2Creature.getHp()) {
				System.out.println("Army 1 Lost this battle");
				army2Points++;
			} else {
				System.out.println("Army 2 Lost this battle");
				army1Points++;
			}
		}
		System.out.println("<+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>");
		System.out.println("");
		if (army1Points > army2Points) {
			System.out.println("Army 1 is the winner");
		} else if (army2Points > army1Points) {
			System.out.println("Army 2 is the winner");
		} else {
			System.out.println("Its a tie");
		}

	}

}
