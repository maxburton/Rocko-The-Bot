package main;

public class GameFunctions {
	
	public enum Choice{
		ROCK,
		PAPER,
		SCISSORS;
	}
	
	public enum Result{
		WIN,
		LOSS,
		TIE;
	}
	
	public static Choice getResultFromIndex(int index) {
		if(index == 0) {
			return Choice.ROCK;
		}else if(index == 1) {
			return Choice.PAPER;
		}else {
			return Choice.SCISSORS;
		}
	}
	
	public static Result getResult(Choice userChoice, Choice botChoice) {
		Result result;
		if((userChoice.equals(Choice.ROCK) && botChoice.equals(Choice.SCISSORS)) ||
			(userChoice.equals(Choice.SCISSORS) && botChoice.equals(Choice.PAPER)) ||	
			(userChoice.equals(Choice.PAPER) && botChoice.equals(Choice.ROCK)) ) {
			result = Result.WIN;
		}else if(userChoice.equals(botChoice)) {
			result = Result.TIE;
		}else {
			result = Result.LOSS;
		}
		return result;
	}
}
