package Work.Class.BusRoute;
import java.util.Scanner;

class Route {
    public String[] station;
    public int[] distance;
    public Route(String[] STATION, int[] DISTANCE){
        this.station = STATION;
        this.distance = DISTANCE;
    }

    public void summarizeRoute(){
        int sum = 0;
        for (int i = 0; i < distance.length; i++){
            sum += distance[i];
        }
        System.out.println(station[0] + " " + station[station.length-1] + " " + sum);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] station_tmp = new String[n];
        int[] distance_tmp = new int[n];
        for (int i=0; i<n; i++){
            station_tmp[i] = scan.next();
            distance_tmp[i] = scan.nextInt();
        }
        Route bus = new Route(station_tmp, distance_tmp);
        bus.summarizeRoute();
    }
}