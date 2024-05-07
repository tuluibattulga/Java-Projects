import java.util.*;

public class Guess {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = userInput.nextLine();
		System.out.println("Hello " + name);
		boolean restart = true;
		while(restart == true) {
			System.out.println("What is the minimum number? ");
			int min = userInput.nextInt();
			System.out.println("What is the maximum number? ");
			int max = userInput.nextInt();
			int diff = (max + 1) - min;
			int num = (int)(min + (diff * Math.random())); 
			int tries = 1;
			boolean repeat = true;
			while (repeat == true) {
				System.out.println("What is your guess? ");
				int guess = userInput.nextInt();
				if(guess > max) throw new IllegalArgumentException("You can't guess above the maximum number!");
				if(guess < min) throw new IllegalArgumentException("You can't guess below the minimum number!");
				if(guess == num) {
					repeat = false;
				}
				else if(guess < num) {
					System.out.println("Too Low. Try again");
					tries++;
				}
				else {
					System.out.println("Too High. Try again");
					tries++;
				}
			}
			System.out.println("Correct! You took " + tries + " tries to get the right answer.");
			System.out.println("Do you want to play again? Y/N" );
			String answer = userInput.next();
			if(answer.equals("N") == true) {
				restart = false;
				userInput.close();
			}
		}	
	}
}