package ch.puleio.restaurant;

public class Table
{
	private int chairsNumber;
	private boolean free;//true if it's free and false if it's occupied
	private int tableNumber;
	
	public Table(int chairsNumber, int tableNumber)
	{
		this.setChairsNumber(chairsNumber);
		this.setTableNumber(tableNumber);
		free = true;//by default the table are free
	}
	
	public Table(int chairsNumber)
	{
		this.chairsNumber = 4; //by default the number of the chairs is 4 for 1 table
		this.tableNumber = tableNumber;
		free = true;
	}

	public int getChairsNumber() {
		return chairsNumber;
	}

	public void setChairsNumber(int chairsNumber) {
		this.chairsNumber = chairsNumber;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	public String toString()
	{
		String status = null;
		
		if(free)
		{
			status = "free";
		}
		else
		{
			status = "occupied";
		}
		return "The table number " + tableNumber + " with " + chairsNumber + " chairs, is " + status +".";
	}
	
}
