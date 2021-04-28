package cowsAndBulls;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class GameLogicTests {

	private GameLogic gameLogic;
	
	
	@Before
	public void setUp() {
		gameLogic = new GameLogic();
	}
	
	@Test
	@DisplayName("Test initial state") // why is this not displaying???
	public void testInitialState() {
		// how do i even know if these methods are 
		// even returning the actual property values 
		assertFalse(gameLogic.isSecretSet());
		assertFalse(gameLogic.checkIfSecretIsCompromised());
	}

	@Test
	@DisplayName("Set invalid secret")
	public void testSetSecretWithInvalidSecret() {
		gameLogic.setSecret("q234");
		assertFalse(gameLogic.isSecretSet());
	}
	
	@Test
	@DisplayName("Set valid secret")
	public void testSetSecretWithValidSecret() {
		gameLogic.setSecret("1234");
		assertTrue(gameLogic.isSecretSet());
	}
	
	@Test
	public void testCowsAndBullsWith1499() {
		// since this test is testing cowsAndBulls,
		// should i use another method other than cowsAndBulls()? 
		gameLogic.setSecret("1234");
		
		int[] actual = gameLogic.cowsAndBulls("1499");
		int[] expected = new int[]{1,1};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testCowsAndBullsWithCorrectGuess() {
		gameLogic.setSecret("1234");
		
		int[] actual = gameLogic.cowsAndBulls("1234");
		int[] expected = new int[]{4,0};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testCowsAndBullsWith5678() {
		gameLogic.setSecret("1234");
		
		int[] actual = gameLogic.cowsAndBulls("5678");
		int[] expected = new int[]{0,0};
		
		assertArrayEquals(expected, actual);
	}
	
	// how do i even test private functions?? should i even care?
}
