public class Vehicle {
    int vehicleID;
    String licensePlate;
    int capacity;

    public Vehicle(int vID, String lPlate, int cap) {
        vehicleID = vID;
        licensePlate = lPlate;
        capacity = cap;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Capacity: " + capacity);
    }
}
