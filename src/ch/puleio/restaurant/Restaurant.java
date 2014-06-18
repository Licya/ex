package ch.puleio.restaurant;

import java.util.Scanner;

public class Restaurant 
{
	private Table table;
	private Table[] tables;
	
	Scanner scan = new Scanner (System.in);
	
	public Restaurant()
	{
		
	}
	
	/**
	 * This method create the restaurant. A restaurant is made of a Table's array.
	 * @return tables
	 */
	public Table[] restaurantCreate()
	{
		int numberOfTables = 0;
		int numberOfChairs = 0;
		
		
		System.out.println("How many tables contains this restaurant?");
		numberOfTables = scan.nextInt();
		
		tables = new Table[numberOfTables];
		
		for(int i = 0; i < tables.length; i++)
		{
			System.out.println("How many chairs does table number " + (i+1) + " contains?");
			numberOfChairs = scan.nextInt();
			tables[i] = new Table(numberOfChairs, i+1);
		}	
	return tables;	
	}
	
	/**
	 * This methode display the state of the tables.
	 * @param tables
	 */
	public void displayRestaurant(Table[] tables)
	{
		System.out.println("*** The present state of the tables : ***");
		for(int i = 0; i< tables.length; i++)
		{
			System.out.println(tables[i] + " ");
		}
		System.out.println();
	}
	
	public int getTableNumber (Table[]tables)
	{
		return table.getTableNumber();
	}
		
}
