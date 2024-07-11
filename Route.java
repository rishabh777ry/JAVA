import java.util.ArrayList;
import java.util.List;

public class Route {
    int routeID;
    String startPoint;
    String endPoint;
    List<String> stops;

    public Route(int rID, String sPoint, String ePoint) {
        routeID = rID;
        startPoint = sPoint;
        endPoint = ePoint;
        stops = new ArrayList<>();
    }

    public void addStop(String stop) {
        stops.add(stop);
    }

    public void displayRouteDetails() {
        System.out.println("Route ID: " + routeID);
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
        System.out.print("Stops: ");
        for (String stop : stops) {
            System.out.print(stop + " ");
        }
        System.out.println();
    }
}
