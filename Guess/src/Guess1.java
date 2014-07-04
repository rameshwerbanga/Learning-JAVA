import java.util.Scanner;
public class Guess1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Computer Will Guess a random number you need to find it number between 1-100
		System.out.println("I have a no in my mind u find it");
		int num1 = (int)(1 + (Math.random() * 100));
		Scanner input = new Scanner(System.in);
		int i = 0, guess=0;
		while(guess != num1) {
			guess = input.nextInt();
			i += 1;
			if(guess > 100)
				System.out.println("Guess should be between 1 - 100, try again");
			else if(guess > num1 && guess < 101)
				System.out.println("Guess is too high, try lower one than this");
			else if(guess == num1) {
				System.out.println("Bigooooooooo Guessed right the number is" + num1);
				break;
			}
			else
				System.out.println("Guess is too low, try higher one than this");		
		}
		System.out.println("you took " + i + " attempts to guess the right number");		
	}

}