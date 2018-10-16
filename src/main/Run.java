package main;

import java.util.Scanner;

import main.GameFunctions.Choice;

public class Run {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean playing = true;
		while(playing) {
			System.out.println("Choose a play: 1. Rock, 2. Paper, 3. Scissors, 0. Quit");
			String input = s.nextLine();
			int play = -1;
			Choice choice = null;
			input = input.trim();
			if(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("0")) {
				play = Integer.parseInt(input);
				System.out.println(play);
			}else {
				System.out.println("Invalid Input\n");
				continue;
			}
			switch(play) {
			case 1:
				choice = Choice.ROCK;
				break;
			case 2:
				choice = Choice.PAPER;
				break;
			case 3:
				choice = Choice.SCISSORS;
				break;
			case 0:
				playing = false;
				System.out.println("Cya\n");
				continue;
			default:
				choice = Choice.ROCK;
				break;
			}
			Choice botChoice = Choice.ROCK; //Prediction.choosePlay();
			System.out.println(GameFunctions.getResult(choice, botChoice).toString());
			Prediction.recordUserPlay(choice);
		}
		s.close();
	}
}
