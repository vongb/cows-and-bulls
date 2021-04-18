package cowsAndBulls;

import java.util.Scanner;

public class Interface {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLogic game = new GameLogic();
		while(!game.isSecretSet()) {
			String input = promptUserForInput("Set a 4 digit secret: ");
			if (game.setSecret(input)) { 
				System.out.println("Secret set!");
				System.out.println("Pretend the answer isn't there.");
			} else {
				System.out.println("Secret was not set. Try again.");
			}
		}
		
		String guess;
		while(!game.checkIfSecretIsCompromised()) {
			guess = promptUserForInput("Guess a 4 digit number: ");
			int[] cowsAndBulls = game.cowsAndBulls(guess);
			System.out.println("Cows: " + cowsAndBulls[0]);
			System.out.println("Bulls: " + cowsAndBulls[1]);
		}
		
		System.out.println("Game over! You guessed it!");
	}
	
	private static String promptUserForInput(String message) {
		System.out.print(message);
		
		return scanner.nextLine();
	}
	
}
