public class Driver {
    int driverID;
    String name;
    String licenseNumber;

    public Driver(int dID, String nm, String lNumber) {
        driverID = dID;
        name = nm;
        licenseNumber = lNumber;
    }

    public void assignBus(int busID) {
        System.out.println("Driver " + name + " assigned to bus " + busID);
    }

    public void displayDriverDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}
