package ch.puleio.guessMyNumber;

import java.util.Scanner;

public class Play 
{

	public Play()
	{
		guess();
	}

	/**
	 * Method used to generate an aleatory number included between 1 and 1000 with a java Math.random function.
	 * @return choosedNumber
	 */
	public int choose()
	{
		int choosedNumber;
		choosedNumber = (int)(Math.random()*(1000))+ 1;
		System.out.println(" choosedNumber = "+choosedNumber);
		return choosedNumber;		
	}

	/**
	 * Method used to guess the number.
	 */
	public void guess()
	{
		int number;//the generated number
		int guess;//the number pressed by the player

		System.out.println("I have a number between 1 and 1000. Can you guess my number?");
		System.out.println("By choosing 0, you can quit the play");
		number = choose();

		//The player can try to guess the number 3 times
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Please enter your " + (i+1) + " guess.");
			Scanner scan = new Scanner(System.in);
			guess = scan.nextInt();

			//The player can quit the playing pressing 0.
			if (guess == 0)
			{
				System.out.println("Good Bye");
				break;
			}

			if (guess < number)
			{
				System.out.println("To low");
			}

			if (guess > number)
			{
				System.out.println("To High");
			}

			if (guess == number)
			{
				System.out.println("Correct!");
				System.out.println("Thank's for playing with me!!!");
				break;
			}
		}
		//After 3 tries the system exits.
		System.out.println("Sorry, you're game over!!!");
		System.exit(0);
	}

}

