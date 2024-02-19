package transit_manager;

public class BusStop 
{
	String stopName;
	int stopNumber;
	double xCoordinate, yCoordinate;
	int passengersWaiting;
	
	public BusStop(String stopName, int stopNumber, double x, double y) 
	{
		this.stopName = stopName;
		this.stopNumber = stopNumber;
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public int getPassengersWaiting()
	{
		return passengersWaiting;
	}

	public void gainPassengers()
	{
		passengersWaiting += (Math.random()*25) + 5;
	}
	
	public boolean losePassengers(int numPassengers)
	{
		if(numPassengers > passengersWaiting)
			return false;
		passengersWaiting -= numPassengers;
		return true;
	}
	
	public double distance(BusStop other)
	{
		double xSquareDistance = Math.pow(this.xCoordinate-other.xCoordinate, 2);
		double ySquareDistance = Math.pow(this.yCoordinate-other.yCoordinate, 2);
		return Math.sqrt(xSquareDistance + ySquareDistance);
	}
	
	public String toString()
	{
		String str = "";
		str += "Stop name: " + stopName + "\n";
		str += "\tStop number: " + stopNumber + "\n";
		str += "\tPosition: (" + xCoordinate + ", " + yCoordinate + ")\n";
		str += "\tPassengers waiting: " + passengersWaiting;
		return str;
	}
	
	public static void main(String[] args) 
	{
		BusStop bs = new BusStop("Oakland", 1267, 0, 0);
		bs.gainPassengers();
		System.out.println(bs);
	}

	public String getStopName() 
	{
		return stopName;
	}

}
