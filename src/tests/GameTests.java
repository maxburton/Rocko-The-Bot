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
	
	@Test
	public void doesUserLose() {
		final Result expected = Result.LOSS;
		final Result actual = main.GameFunctions.getResult(Choice.PAPER,Choice.SCISSORS);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void doesUserTie() {
		final Result expected = Result.TIE;
		final Result actual = main.GameFunctions.getResult(Choice.SCISSORS,Choice.SCISSORS);
		Assert.assertEquals(expected, actual);
	}
}
