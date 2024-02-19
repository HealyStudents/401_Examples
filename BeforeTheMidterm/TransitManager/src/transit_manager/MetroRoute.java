package transit_manager;

public class MetroRoute 
{
	int routeNumber;
	String routeDescription;
	MetroStation firstStop;
	MetroStation lastStop;

	public MetroRoute(int routeNum, String routeDesc, MetroStation first, MetroStation last)
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
		return "Metro Route #" + routeNumber + ": " + routeDescription;
	}

	public int getRouteNumber()
	{
		return routeNumber;
	}
}
