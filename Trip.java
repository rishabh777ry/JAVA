public class Trip implements Schedulable {
    int tripID;
    int busID;
    String route;
    String scheduleTime;

    public Trip(int tID, int bID, String rte) {
        tripID = tID;
        busID = bID;
        route = rte;
    }

    public void scheduleTrip(String time) {
        scheduleTime = time;
        System.out.println("Trip scheduled at " + time + " for route " + route);
    }

    public void cancelTrip() {
        System.out.println("Trip " + tripID + " cancelled");
    }

    public void displayTripDetails() {
        System.out.println("Trip ID: " + tripID);
        System.out.println("Bus ID: " + busID);
        System.out.println("Route: " + route);
        System.out.println("Schedule Time: " + scheduleTime);
    }
}
