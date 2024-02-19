package transit_manager;

public class BusRoute 
{
	int routeNumber;
	String routeDescription;
	BusStop firstStop;
	BusStop lastStop;

	public BusRoute(int routeNum, String routeDesc, BusStop first, BusStop last)
	{
		routeNumber = routeNum;
		routeDescription = routeDesc;
		firstStop = first;
		lastStop = last;
	}

	public double calculateDistance()
	{
		return firstStop.distance(lastStop);
	}

	public String toString() 
	{
		return "Bus Route #" + routeNumber + ": " + routeDescription;
	}

	public int getRouteNumber()
	{
		return routeNumber;
	}
}
