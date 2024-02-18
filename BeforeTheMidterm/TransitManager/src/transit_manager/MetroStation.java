package transit_manager;

import java.util.Random;

public class MetroStation 
{
	String stationName;
	int stationNumber;
	double xCoordinate;
	double yCoordinate;
	int passengersWaiting;
	Random rnd;

	public MetroStation()
	{
		rnd = new Random();
		passengersWaiting = 0;
	}

	public MetroStation(String name, int num, double x, double y)
	{
		this();
		stationName = name;
		stationNumber = num;
		xCoordinate = x;
		yCoordinate = y;
	}

	public void gainPassengers()
	{
		passengersWaiting += 5 + rnd.nextInt(26);
	}

	public boolean losePassengers(int numPassengers) 
	{
		if(numPassengers <= passengersWaiting)
		{
			passengersWaiting -= numPassengers;
			return true;
		}
		return false;
	}

	public double distance(MetroStation other)
	{
		return Math.sqrt(Math.pow(this.xCoordinate - other.getX(), 2) + Math.pow(this.yCoordinate - other.getY(), 2));
	}

	public String toString()
	{
		return "Station #" + stationNumber + ": " + stationName 
				+ "\n\t" + passengersWaiting + " passengers waiting.";
	}

	public String getStationName()
	{
		return "" + stationName;
	}

	public int getPassengersWaiting()
	{
		return passengersWaiting;
	}

	public double getX()
	{
		return xCoordinate;
	}

	public double getY()
	{
		return yCoordinate;
	}
}
