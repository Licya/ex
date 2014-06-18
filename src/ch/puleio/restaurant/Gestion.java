package ch.puleio.restaurant;

import java.util.Scanner;

public class Gestion 
{
	Scanner scan = new Scanner(System.in);
	private Table table;

	public Gestion()
	{
		Restaurant r = new Restaurant();
		Table gestion[] = r.restaurantCreate();
		display(gestion, r);
		sitDown(gestion, r);
		leave(gestion, r);
		display(gestion, r);

	}

	public void sitDown(Table[] tables, Restaurant restaurant)
	{
		//Le statut de la table passe a occupé
		int numberOfPoeple;
		System.out.println("How many people are you?");
		numberOfPoeple = scan.nextInt();

		//for sitting down a table must be free and must have the right superior number of chairs
		for(int i = 0; i < tables.length; i++)
		{
			if(numberOfPoeple == tables[i].getChairsNumber() && (tables[i].isFree() == true))
			{
				for(int j = 0; j < tables.length; j++)
				{
					System.out.println("You can take place on table number : " + tables[j].getTableNumber());
					tables[j].setFree(false);
					restaurant.displayRestaurant(tables);
					break;
				}
				break;
			}

			if(numberOfPoeple < tables[i].getChairsNumber() && (tables[i].isFree() == true))
			{
				for(int k = 0; k < tables.length; k++)
				{
					System.out.println("You can take place on table number : " + tables[k].getTableNumber());
					tables[k].setFree(false);
					restaurant.displayRestaurant(tables);
					break;
				}
				break;
			}

			if(numberOfPoeple > tables[i].getTableNumber())
			{
				System.out.println("Sorry! There is no table free at the moment for" +  numberOfPoeple + " people.");
				restaurant.displayRestaurant(tables);
				break;
			}

			if(tables[i].isFree() == false)
			{
				System.out.println("Sorry! There is no table free at the moment.");
				restaurant.displayRestaurant(tables);
				break;
			}
		}

	}

	/**
	 * This method is used when a customer leaves the restaurant to setting the state free of the table
	 * @param tables
	 * @param restaurant
	 */
	public void leave(Table[] tables, Restaurant restaurant)
	{
		int tableNumer = 0;
		System.out.println("Which table is leaving?");
		tableNumer = scan.nextInt();

		for(int i = 0; i < tables.length; i++)
		{
			if(tables[i].isFree())
			{
				System.out.println("It isn't possible. Program is exiting.");
				System.exit(0);
			}

			if(tableNumer == (i+1))
			{
				tables[i].setFree(true);
				System.out.println("Thank's for your visit.");
			}

		}
	}

	/**
	 * This method is used for displaying information about the restaurant and every tables
	 * @param tables
	 * @param restaurant
	 */
	public void display(Table[] tables, Restaurant restaurant)
	{
		restaurant.displayRestaurant(tables);
		System.out.println();
	}
}
