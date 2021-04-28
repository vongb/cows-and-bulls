package cowsAndBulls;

import java.util.HashSet;

public class GameLogic {

	private String secret;
	private HashSet<Character> numbersUsed;
	private boolean isSecretCompromised;
	
	public GameLogic() {
		secret = "";
		isSecretCompromised = false;
		numbersUsed = new HashSet<Character>();
	}
	
	public boolean isSecretSet() {
		return !secret.isEmpty();
	}
	
	public boolean checkIfSecretIsCompromised() {
		return isSecretCompromised;
	}
	
	public int[] cowsAndBulls(String guess) {
		int[] cowsAndBulls = new int[2];
		if (!isSecretSet()) return cowsAndBulls;
		
		cowsAndBulls[0] = 0;
		cowsAndBulls[1] = 0;
		char digit;
		
		for (int i = 0; i < guess.length(); i++) {
			digit = guess.charAt(i);
			
			if (isDigitUsed(digit)) {
				if(isInRightPosition(digit, i)) {
					cowsAndBulls[1]++;
				} else {					
					cowsAndBulls[0]++;
				}
			}			
		}
		
		if (cowsAndBulls[0] == 0 && cowsAndBulls[1] == 4) 
			isSecretCompromised = true;
		
		return cowsAndBulls;
	}
	
	public boolean setSecret(String number) {
		if (isNumber(number)) {			
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
	
	private boolean isInRightPosition(char digit, int position) {
		return digit == secret.charAt(position);
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
