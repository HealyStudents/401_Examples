/**
 * 
 */
package transit_manager;

/**
 * @author patwh
 *
 */
public class Bus 
{
	String busIdentifier;
	String driverName;
	int capacity;
	int passengers;
	double speed;
	BusRoute route;
	BusStop currentStop;

	public Bus(String busId, String driver, double sp, BusRoute rt)
	{
		busIdentifier = busId;
		driverName = driver;
		speed = sp;
		route = rt;

		capacity = 30;
		passengers = 0;
		currentStop = rt.firstStop;
	}

	public void thankTheDriver() 
	{
		System.out.println("Thanks " + driverName + "!"); 
	}

	public int letPassengersOff()
	{
		int letOff = passengers;
		passengers = 0;
		return letOff;
	}

	public int letPassengersOn()
	{
		int potentialPassengers = currentStop.getPassengersWaiting();
		if(potentialPassengers > (capacity - passengers))
		{
			potentialPassengers = capacity - passengers;
		}
		if(currentStop.losePassengers(potentialPassengers)) 
		{
			passengers = passengers + potentialPassengers;
			return potentialPassengers;
		}
		return 0;
	}

	public double moveToNextStop()
	{
		double distance = route.calculateDistance();
		double hours = distance / speed;

		if(currentStop == route.firstStop)
		{
			currentStop = route.lastStop;
		}
		else
		{
			currentStop = route.firstStop;
		}

		return hours * 60.0;
	}

	public String getBusIdentifier() 
	{
		return "" + busIdentifier;
	}

	public String toString()
	{
		return "Bus " + busIdentifier + " (" + driverName 
				+ ") traveling on route #" + route.getRouteNumber() 
				+ "\n\tCurrently stopped at " + currentStop.getStopName()
				+ "\n\t" + passengers + " seats taken out of " + capacity;
	}
}
