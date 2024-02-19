package transit_manager;

public class Train 
{
	String trainIdentifier;
	String conductorName;
	int cars;
	int passengers;
	double speed;
	MetroRoute route;
	MetroStation currentStation;

	public Train(String trainId, String conductor, double sp, int cs, MetroRoute rt)
	{
		trainIdentifier = trainId;
		conductorName = conductor;
		speed = sp;
		route = rt;
		cars = cs;

		passengers = 0;
		currentStation = rt.firstStop;
	}

	public void thankTheConductor() 
	{
		System.out.println("Thanks " + conductorName + "!"); 
	}

	public int calculateCapacity()
	{
		return cars*120;
	}

	public int letPassengersOff()
	{
		int letOff = passengers;
		passengers = 0;
		return letOff;
	}

	public int letPassengersOn()
	{
		int potentialPassengers = currentStation.getPassengersWaiting();
		int capacity = this.calculateCapacity();
		if(potentialPassengers > (capacity - passengers))
		{
			potentialPassengers = capacity - passengers;
		}
		if(currentStation.losePassengers(potentialPassengers)) 
		{
			passengers = passengers + potentialPassengers;
			return potentialPassengers;
		}
		return 0;
	}

	public double moveToNextStation()
	{
		double distance = route.calculateDistance();
		double hours = distance / speed;

		if(currentStation == route.firstStop)
		{
			currentStation = route.lastStop;
		}
		else
		{
			currentStation = route.firstStop;
		}

		return hours * 60.0;
	}

	public String toString()
	{
		return "Train " + trainIdentifier + " (" + conductorName 
				+ ") traveling on route #" + route.getRouteNumber() 
				+ "\n\tCurrently stopped at " + currentStation.getStationName()
				+ "\n\t" + passengers + " seats taken out of " + this.calculateCapacity();
	}

	public String getTrainIdentifier()
	{
		return "" + trainIdentifier;
	}
}
