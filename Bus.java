public class Bus extends Vehicle {
    String route;
    int driverID;

    public Bus(int vID, String lPlate, int cap, String rte, int dID) {
        super(vID, lPlate, cap);
        route = rte;
        driverID = dID;
    }

    public void displayBusDetails() {
        displayDetails();
        System.out.println("Route: " + route);
        System.out.println("Driver ID: " + driverID);
    }
}
