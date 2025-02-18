import java.util.Scanner;

class Truck {
    int weight;
    int amount;

    Truck(int w, int a) {
        this.weight = w;
        this.amount = a;
    }

    double calFuel(int distance) {
        return Math.ceil((distance + weight) / 10.0);
    }
}

public class TestTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int a = sc.nextInt();
            t[i] = new Truck(w, a);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int distance = sc.nextInt();
            // t[i] = new Truck(x, distance);
            if (x >= 1 && x <= n) { // จุดตรงนี้ต้องวิเคราะหืให้ดีว่า ใช้อินเด็กของอะไรมาแทน
                System.out.println(t[x - 1].calFuel(distance));
            }
        }
        sc.close();
    }
}
