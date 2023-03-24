package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Player is at 0th Position.");
		
		int max = 6;
		int min = 1;
		int diceRoll = (int) (Math.random()*(max-min+1)+min); 
		
		System.out.println("After rolling the dice the number we get is "+ diceRoll);
	}

}
