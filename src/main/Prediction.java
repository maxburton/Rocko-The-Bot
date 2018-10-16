package main;

import java.util.ArrayList;

import main.GameFunctions.Choice;

public class Prediction {
	
	private static ArrayList<Choice> previousChoices = new ArrayList<Choice>();

	public static Choice choosePlay() {
		Choice choice = null;
		Choice mode = null;
		if(previousChoices.size() < 3) {
			choice = GameFunctions.getResultFromIndex(getRand());
		}else {
			choice = checkForPatterns();
		}
		return choice;
	}

	public static void recordUserPlay(Choice userChoice) {
		previousChoices.add(userChoice);
	}
	
	private static int getRand() {
		return (int)(Math.random() * 3);
	}
	
	private static Choice checkForPatterns() {
		Choice nextPlay = null;
		int maxPatternLength = previousChoices.size() - 1;
		final int minPatternLength = 3;
		int currentPatternLength = minPatternLength;
		
		for(int i = 0; i < maxPatternLength - minPatternLength; i++) {
			//iterate through the array looking for patterns of increasing lengths. Start checking from the most recent entries and look through the older entries.
		}
		
		return nextPlay;
	}
}
