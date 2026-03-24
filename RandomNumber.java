package task1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int score = 0;
		char playAgain;
		
		do {
			int number = rand.nextInt(100)+1;
			int maxattempts = 5;
			boolean guessCorrectly = false;
			
			System.out.println("Guess the number between 1 to 100");
			System.out.println("You have " + maxattempts +  " attempts");
			
			for(int i=0; i<=maxattempts; i++) {
				System.out.println("Enter your guess number:");
				int guess = sc.nextInt();
				
				if(guess == number) {
					System.out.println("Correct you guess correct number.");
					score++;
					guessCorrectly = true;
					break;
				}else if(guess >number) {
					System.out.println("Too High!");
				}else {
					System.out.println("Too Low!");
				}
				System.out.println("Attempts left:" + (maxattempts-i));
				
			}
			
			if(!guessCorrectly) {
				System.out.println("\nYou lost! the correct number was: " +number);
			}
			
			System.out.println("Current Score: " + score);
			
			System.out.println("Do you want to play(yes/no):");
			playAgain = sc.next().charAt(0);
	
		}while(playAgain == 'y' || playAgain == 'Y');
		
		System.out.println("Final Score: " +score);
		System.out.println("Thank for Playing! ");
        
		sc.close();
	}

}
