package tests;

import org.junit.Assert;
import org.junit.Test;

import main.GameFunctions.Choice;
import main.GameFunctions.Result;

public final class GameTests {

	@Test
	public void doesUserWin() {
		final Result expected = Result.WIN;
		final Result actual = main.GameFunctions.getResult(Choice.ROCK,Choice.SCISSORS);
		Assert.assertEquals(expected, actual);
	}
}
