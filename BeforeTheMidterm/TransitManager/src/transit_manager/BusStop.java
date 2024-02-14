package transit_manager;

public class BusStop 
{
	String stopName;
	int stopNumber;
	double xCoordinate, yCoordinate;
	int passengersWaiting;
	
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
		BusStop bs = new BusStop();
		bs.stopName = "Oakland";
		bs.stopNumber = 1267;
		bs.gainPassengers();
		System.out.println(bs);
	}

}
