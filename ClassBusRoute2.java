import java.util.Scanner;

class Route {
    String[] station;
    int way[];

    Route(String[] s, int[] w) {
            this.station = s;
            this.way = w;
    }
    void summarizeRoute(){
        int total = 0;
        System.out.print(this.station[0] + " " + this.station[station.length - 1] + " ");
        for (int i = 0; i < way.length; i++) {
            total += way[i];
        }
        System.out.println(total);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        Route route = new Route(names, distances);
        route.summarizeRoute();
        scan.close();
    }
}
