package all;

import java.util.ArrayList;
import java.util.Scanner;


public class E61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "pizz";
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> wordStat = new ArrayList<>();
		System.out.println("***********************");
		System.out.println("Welcome to Java Hangman");
		System.out.println("***********************\n");
		for(int i=0; i < word.length(); i++ ) {
			wordStat.add('_');
		}
		int wrongguess = 0;
		
		
		while(wrongguess < 6) {
			System.out.println("the wrong guess: " + wrongguess);
	
			System.out.print("word:");
			for(char c: wordStat) {
				System.out.print(" " + c);
			}
			
			System.out.println();
			System.out.print("Gusses a Letter: ");
			char Guss = scanner.next().toLowerCase().charAt(0);
			
			if(word.indexOf(Guss) >= 0) {
				System.out.println("Correct Guess\n");
				
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(i) == Guss){
						wordStat.set(i, Guss);
					}
				}
				if(!wordStat.contains('_')) {
					System.out.println("you wan");
					System.out.println("the word was: "+ word);
					System.out.println("the wrong guess: " + wrongguess);
					break;

				}
			}
			else{
				wrongguess++;
				System.out.println("wrong guess!\n");
			}
		}
		if(wrongguess >= 6) {
			System.out.println("you are lose");
			System.out.println("the word was: "+ word);
			System.out.println("the wrong guess: " + wrongguess);
		}
		scanner.close();
	}

}
