

import java.util.ArrayList;
import java.util.Scanner;
class Truck{
    int weight;
    int amount;
    Truck (int weight, int amount){
        this.weight = weight;
        this.amount = amount;
    }
    double calFuel(int distance){
        double F = (distance + weight) / 10.0;
        return Math.ceil(F);
    }
}   
public class TestTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Truck> T = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
           T.add(new Truck (sc.nextInt(), sc.nextInt()));
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int distance = sc.nextInt();
            System.out.println(T.get(x - 1).calFuel(distance));
        }
        sc.close();
    }
}
