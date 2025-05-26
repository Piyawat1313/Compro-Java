import java.util.Scanner;

class Route {
    String[] station;
    int way[];

    Route(String[] s, int[] w) {
            this.station = s;
            this.way = w;
    }
    void getTripInfo(int start, int end){
        int total = 0;
            if(start >= 1 && end <= this.station.length && start < end && start != end ){
                for (int i = start; i < end; i++) {
                    total += way[i];
                }
                System.out.println(station[start - 1] + " " + station[end - 1] + " " + total);
                total = 0;
            }
            else {
                System.out.println("invalid number");
            }
    }

}

public class BusRoute3 {
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
            int num2 = scan.nextInt();
            route.getTripInfo(num, num2);
        }
        scan.close();
    }
}
