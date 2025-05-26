import java.util.Scanner;

class Route {
    String[] station;
    int way[];

    Route(String[] s, int[] w) {
            this.station = s;
            this.way = w;
    }

    void getStopInfo(int num) {
            if (num > 0 && num <= this.way.length) {
                System.out.println(this.station[num - 1] + " " + this.way[num - 1]);
            } 
            else{
                System.out.println("invalid number");
            }

    }
}

public class BusRoute1 {
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

        final int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            int num = scan.nextInt();
            route.getStopInfo(num);
        }

        scan.close();
    }
}
