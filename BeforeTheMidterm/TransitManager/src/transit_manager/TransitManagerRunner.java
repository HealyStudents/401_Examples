package transit_manager;

public class TransitManagerRunner 
{

	public static void main(String[] args)
	{
		System.out.println("BUS TESTING =============================\n");
		TestBuses();

		System.out.println("METRO TESTING =============================\n");
		TestMetro();
	}

	public static void TestBuses()
	{
		// Create some bus stops
		// Oakland stop, stop number 12342, at location (0,0)
		BusStop stopA = new BusStop("Oakland", 12342, 0, 0);
		BusStop stopB = new BusStop("Downtown", 87236, -2.3, 0.2);  
		BusStop stopC = new BusStop("Swissvale", 62341, 5.4, -0.4);

		//Create some bus routes
		BusRoute routeA = new BusRoute(61, "Connects Oakland with eastward residential areas.", stopA, stopC);
		BusRoute routeB = new BusRoute(71, "Connects Oakland with Downtown.", stopB, stopA);

		//Use toStrings to describe these routes
		System.out.println(routeA);
		System.out.println(routeA.firstStop);
		System.out.println(routeA.lastStop);
		System.out.println();

		System.out.println(routeB);
		System.out.println(routeB.firstStop);
		System.out.println(routeB.lastStop);
		System.out.println("\n================================\n");

		//Add a bus to each route
		// Bus with identifier KLJF3, driver named Molly, average speed of 22 mph, on the 61 route
		Bus busA = new Bus("KLJF3", "Molly", 22, routeA);
		Bus busB = new Bus("LSHC6", "Keyang", 34, routeB);

		//Let's learn more about these buses with our toString methods
		System.out.println("Initial Bus Status\n");
		System.out.println(busA);
		System.out.println();
		System.out.println(busB);
		System.out.println("\n================================\n");

		System.out.println("Gaining passengers and loading them onto buses...\n");
		// Lets wait for people to accumulate at our bus stops
		stopA.gainPassengers();
		stopB.gainPassengers();
		stopC.gainPassengers();
		//Check how many people are waiting at stopA
		System.out.println("There are currently " + stopA.getPassengersWaiting() + " passengers waiting at the " + stopA.getStopName() + " stop.");

		//Load the buses
		busA.letPassengersOn();
		busB.letPassengersOn();
		System.out.println("\nPassengers have loaded on the buses.\n");

		//Check on bus A now that it has gained passengers
		System.out.println(busA);

		//And check to make sure no one is left at the stop
		System.out.println("There are currently " + stopA.getPassengersWaiting() + " passengers waiting at the " + stopA.getStopName() + " stop.");
		System.out.println("\n================================\n");

		System.out.println("The buses will drive to their next stops!\n");
		System.out.println("Bus " + busA.getBusIdentifier() + " took " + busA.moveToNextStop() + " minutes to reach " + busA.currentStop.getStopName());
		System.out.println("Bus " + busB.getBusIdentifier() + " took " + busB.moveToNextStop() + " minutes to reach " + busB.currentStop.getStopName());

		System.out.println("\n================================\n");

		System.out.println("Letting bus A cycle around\n");
		//Let off Bus A's passengers and let on new ones
		busA.letPassengersOff();
		busA.letPassengersOn();
		System.out.println(busA);

		//Move one more time
		System.out.println("Bus " + busA.getBusIdentifier() + " took " + busA.moveToNextStop() + " minutes to reach " + busA.currentStop.getStopName());

		System.out.println("\n================================\n");
		//Don't forget to thank the bus drivers!
		busA.thankTheDriver();
		busB.thankTheDriver();

		System.out.println();
	}

	public static void TestMetro()
	{
		//Create some Metro Stations
		//Downtown stop, stop number 41232, at location (-2.3, 0.2)
		MetroStation stationA = new MetroStation("Downtown", 41232, -2.3, 0.2);
		MetroStation stationB = new MetroStation("Station Square", 92319, -2.2, -0.8);
		MetroStation stationC = new MetroStation("North Shore", 12091, -3.2, 1.1);

		//Create some Metro Routes
		MetroRoute routeA = new MetroRoute(102, "Connects Downtown and Station Square", stationA, stationB);
		MetroRoute routeB = new MetroRoute(103, "Connects Downtown and the North Shore", stationC, stationA);

		//Use toStrings to describe these routes
		System.out.println(routeA);
		System.out.println(routeA.firstStop);
		System.out.println(routeA.lastStop);
		System.out.println();

		System.out.println(routeB);
		System.out.println(routeB.firstStop);
		System.out.println(routeB.lastStop);
		System.out.println("\n================================\n");

		//Add a Train to each route
		// Train with identifier IOPS2, conductor named Eli, average speed of 20 mph, 3 train cars, on the 102 route
		Train trainA = new Train("IOPS2", "Eli", 20, 3, routeA);
		Train trainB = new Train("LSHC6", "Lydia", 35, 5, routeB);

		//Let's learn more about these trains with our toString methods
		System.out.println("Initial Train Status\n");
		System.out.println(trainA);
		System.out.println();
		System.out.println(trainB);
		System.out.println("\n================================\n");

		System.out.println("Gaining passengers and loading them onto trains...\n");
		// Lets wait for people to accumulate at our train stations
		stationA.gainPassengers();
		stationB.gainPassengers();
		stationC.gainPassengers();

		//Check how many people are waiting at station A
		System.out.println("There are currently " + stationA.getPassengersWaiting() + " passengers waiting at the " + stationA.getStationName() + " station.");

		//Load the trains
		trainA.letPassengersOn();
		trainB.letPassengersOn();
		System.out.println("\nPassengers have loaded on the trains.\n");

		//Check on train A now that it has gained passengers
		System.out.println(trainA);

		//And check to make sure folks have loaded
		System.out.println("There are currently " + stationA.getPassengersWaiting() + " passengers waiting at the " + stationA.getStationName() + " stop.");
		System.out.println("\n================================\n");

		System.out.println("The trains will ride to their next stops!\n");
		System.out.println("Train " + trainA.getTrainIdentifier() + " took " + trainA.moveToNextStation() + " minutes to reach " + trainA.currentStation.getStationName());
		System.out.println("Bus " + trainB.getTrainIdentifier() + " took " + trainB.moveToNextStation() + " minutes to reach " + trainB.currentStation.getStationName());

		System.out.println("\n================================\n");

		System.out.println("Letting Train A cycle around\n");
		//Let off Train A's passengers and let on new ones
		trainA.letPassengersOff();
		trainA.letPassengersOn();
		System.out.println(trainA);

		//Move one more time
		System.out.println("Bus " + trainA.getTrainIdentifier() + " took " + trainA.moveToNextStation() + " minutes to reach " + trainA.currentStation.getStationName());

		System.out.println("\n================================\n");
		//Don't forget to thank the conductors!
		trainA.thankTheConductor();
		trainB.thankTheConductor();

		System.out.println();
	}
}
