package main;

import java.util.Scanner;

import main.GameFunctions.Choice;

public class Run {

	static void main(String[] args){
		Scanner s = new Scanner(System.in);
		boolean playing = true;
		while(playing) {
			System.out.println("Choose a play: 1. Rock, 2. Paper, 3. Scissors, 0. Quit\n");
			String input = s.nextLine();
			int play = -1;
			Choice choice = Choice.ROCK;;
			if(input != "1" || input != "2" || input != "3" || input != "0") {
				play = Integer.parseInt(input);
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
			Choice botChoice = Prediction.choosePlay();
			System.out.println(GameFunctions.getResult(choice, botChoice).toString());
		}
		s.close();
	}
}
