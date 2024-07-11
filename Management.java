public class Management {
    public static void main(String[] args) {
        // Creating instances
        Bus bus1 = new Bus(1, "AB1234", 50, "Route1", 101);
        Driver driver1 = new Driver(101, "John Doe", "DL12345");
        Route route1 = new Route(1, "Station A", "Station B");
        Trip trip1 = new Trip(1, 1, "Route1");

        // Adding stops to route
        route1.addStop("Stop1");
        route1.addStop("Stop2");

        // Display details
        bus1.displayBusDetails();
        driver1.displayDriverDetails();
        route1.displayRouteDetails();

        // Scheduling a trip
        trip1.scheduleTrip("10:00 AM");
        trip1.displayTripDetails();

        // Cancelling a trip
        trip1.cancelTrip();
    }
}
