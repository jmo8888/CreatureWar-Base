/**
 * This is the main class
 *
 * @author jennifer moran
 * @version 2015.11.12
 */
public class Main {

	public static void main(String args[]) {
		try {
			System.out.println("<++++++++++++++++++++Human vs Human++++++++++++++++++++++++++++++++++>");
			CreatureWar war = new CreatureWar('H', 'H');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Elf vs Elf++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('E', 'E');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Demon vs Demon++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('D', 'D');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Balrog vs Balrog++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('B', 'B');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Human vs Elf++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('H', 'E');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Human vs Demon++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('H', 'D');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Human vs Balrog++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('H', 'B');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Elf vs Demon++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('E', 'D');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Elf vs Balrog++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('E', 'B');
			war.fight();
			System.out.println("");
			System.out.println("<++++++++++++++++++++Demon vs Balrog++++++++++++++++++++++++++++++++++>");
			war = new CreatureWar('D', 'B');
			war.fight();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
