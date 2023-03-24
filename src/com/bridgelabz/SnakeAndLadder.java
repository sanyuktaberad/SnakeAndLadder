package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Player is at 0th Position.");
		
		int max = 6;
		int min = 1;
		int diceRoll = (int) (Math.random()*(max-min+1)+min); 
		
		System.out.println("After rolling the dice the number we get is "+ diceRoll);
		
		System.out.println("Dice Rolled: " + diceRoll);
        int stepCount = 0;
        int options = (int) (Math.random() *( 3 - 1 + 1)+1);
        System.out.println("option is " + options);

        if (options == 1) {
            System.out.println("No Play");
            stepCount = stepCount;
        } else if (options == 2) {
            System.out.println("There is Ladder");
            stepCount = stepCount + diceRoll;
        } else if (options == 3) {
            System.out.println("There is Snake");
            stepCount = stepCount - diceRoll;
        } else {
            System.out.println("Roll dice again");
        }
	}

}
