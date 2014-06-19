package ch.puleio.restaurant;

import java.util.Scanner;

/**
 * 
 * @author Licya
 * Created		:	18th of June 2014
 * Last update	:	18th of June 2014
 * Description	:	simulation of a programm which manages the tables of a restaurant
 */

public class TestRestaurant 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int answer;
		
		System.out.println("Thank you for choosing our restaurant management program.");
		System.out.println("For begining press 1, for exiting press 0, any other pressed key will make the program exiting");
		
		answer = scan.nextInt();
		
		if(answer == 1)
		{
			Gestion g = new Gestion();
		}
		
		if(answer == 0)
		{
			System.exit(0);
		}
		
		else
		{
			System.exit(0);
		}
	
	}

}
