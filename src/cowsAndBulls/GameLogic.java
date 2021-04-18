package cowsAndBulls;

public class GameLogic {

	private String secret;
	private boolean[] isNumberUsed;
	private boolean isSecretCompromised;
	
	public GameLogic() {
		secret = "";
		isSecretCompromised = false;
		isNumberUsed = new boolean[10];
	}
	
	public boolean checkIsSecretCompromised() {
		return isSecretCompromised;
	}
	
	public int[] cowsAndBulls(String guess) {
		int[] cowsAndBulls = new int[2];
		
		for (char digit : guess) {
			
		}
		
		return cowsAndBulls;
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
