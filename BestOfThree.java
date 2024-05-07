public class BestOfThree 
{
	
	/* Given low and high integers, getRandomInt picks a random number lying
	 * between them (inclusive).
	 */
	public static int getRandomInt(int low, int high)
	{
		return (int)(Math.random()*(high-low +1))+ low;
	}
	
	/* The roll method accepts no inputs and returns an int, representing 
	 * the result of a dice roll. It must call getRandomInt.
	 */
	public static int DiceRoll()
	{
		return getRandomInt(1, 6);
		
	}
	
	/* The method bestOf3 accepts 2 strings representing the names of 2 people.
	 * It calls the roll method for each person three times, printing out what 
	 * happened in each roll as shown:
	 *   In roll 1, _______ rolled a ___ and _______ rolled a ___
	 *   In roll 2, _______ rolled a ___ and _______ rolled a ___
	 *   In roll 3, _______ rolled a ___ and _______ rolled a ___
	 * Tracking number of wins for each person, it returns the name of the winner.
	 * (If there's a tie overall, it returns the word "tie".)
	 */
	public static void bestOf3(String name1, String name2)
	{
		int roll1 = 0;
		int roll2 = 0;
		int win1 = 0;
		int win2 = 0;
		for(int i = 1; i <= 3; i++) {
			roll1 = DiceRoll();
			roll2 = DiceRoll();
			if(roll1 < roll2) {
				win2++;
			}
			else if(roll2 < roll1) {
				win1++;
			}
			System.out.println("In roll 1, " + name1 + " rolled a " + roll1 + " and " + name2 + " rolled a " + roll2);
		}
		if(win1 > win2) {
			System.out.println(name1 + "!!!");
		}
		else if(win2 > win1) {
			System.out.println(name2 + "!!!");
		}
		else {
			System.out.println("!!!");
		}

	}
	
	
	public static void main(String[] args) 
	{
		bestOf3("Tului", "Noah");	
	}

}
