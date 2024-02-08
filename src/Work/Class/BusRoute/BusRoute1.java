package Work.Class.BusRoute;
import java.util.Scanner;

class Route {
    public String[] station;
    public int[] distance;
    public Route(String[] STATION, int[] DISTANCE){
        this.station = STATION;
        this.distance = DISTANCE;
    }

    public void getStopInfo(int number){
        if (number > station.length || number < 1){
            System.out.println("invalid number");
        }
        else{
            System.out.println(station[number-1] + " " + distance[number-1]);
        }
    }
}

public class BusRoute1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] station_tmp = new String[N];
        int[] distance_tmp = new int[N];
        for (int i=0; i<N; i++){
            station_tmp[i] = scan.next();
            distance_tmp[i] = scan.nextInt();
        }

        Route bus = new Route(station_tmp, distance_tmp);
        int K = scan.nextInt();
        for (int i=0; i<K; i++){
            bus.getStopInfo(scan.nextInt());
        }
    }
} 