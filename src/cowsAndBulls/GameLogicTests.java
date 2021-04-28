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
	public void testCowsAndBulls() {
		gameLogic.setSecret("1234"); // should i use another method other than cowsAndBulls()?
		assertArrayEquals(gameLogic.cowsAndBulls("1499"), [1,1]); // why is this not working
	}
	
	// how do i even test private functions?? should i even care?
}
