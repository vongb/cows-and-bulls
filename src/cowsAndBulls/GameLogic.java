package cowsAndBulls;

import java.util.HashSet;

public class GameLogic {

	private String secret;
	private HashSet<Character> numbersUsed;
	private boolean isSecretCompromised;
	
	public GameLogic() {
		secret = "";
		isSecretCompromised = false;
		HashSet<Character> numbersUsed;
	}
	
	public boolean checkIsSecretCompromised() {
		return isSecretCompromised;
	}
	
	public int[] cowsAndBulls(String guess) {
		int[] cowsAndBulls = new int[2];
		char digit;
		
		for (int i = 0; i < secret.length(); i++) {
			digit = secret.charAt(i);
			
			// Check if digit is used
			// Check digit position
			// Add to cow/bull
			
		}
		
		return cowsAndBulls;
	}
	
	public boolean setSecret(String number) {
		if (this.isNumber(number)) {			
			secret = number.substring(0, 4);
			numbersUsed.clear();
			for (char c : secret.toCharArray()) {
				numbersUsed.add(c);
			}
			return true;
		} else return false;		
	}
	
	private boolean isDigitUsed(char digit) {
		return numbersUsed.contains(digit);
	}
	
	
	
	private boolean isNumber(String string) {
		if (string == null) return false;
		try {			
			Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
