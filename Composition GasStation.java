
import java.util.ArrayList;
import java.util.Scanner;

class Truck {
    int weight;
    int amount;

    Truck(int weight, int amount) {
        this.weight = weight;
        this.amount = amount;
    }

    double calFuel(int distance) {
        double F = (distance + weight) / 10.0;
        return Math.ceil(F);
    }
}

class GasStation {
    double[] amount;

    GasStation(double[] amount) {
        this.amount = new double[amount.length];
        for (int i = 0; i < amount.length; i++) {
            this.amount[i] = amount[i];
        }
    }

    void fillTank(int typeFuel, Truck T, double distance) {
        double cal = T.calFuel(((int) distance));
        if (amount[typeFuel - 1] >= cal) {
            amount[typeFuel - 1] -= cal;
        } else {
            System.out.println(typeFuel + " out of gasoline ");
            amount[typeFuel - 1] = 0;
        }
    }

    void refuel(double[] amount) {
        for (int i = 0; i < amount.length; i++) {
            this.amount[i] += amount[i];
        }
    }

    void print() {
        for (int i = 0; i < amount.length; i++) {
            System.out.print(amount[i] + " ");
        }
    }
}

public class TestTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Truck> T = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            T.add(new Truck(sc.nextInt(), sc.nextInt()));
        }
        int k = sc.nextInt();
        double amount[] = new double[k];
        for (int i = 0; i < amount.length; i++) {
            amount[i] = sc.nextInt();
        }
        GasStation g  = new GasStation(amount);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int camd = sc.nextInt();
            if (camd == 0) {
                int A = sc.nextInt();
                int t = sc.nextInt();
                double D = sc.nextDouble();
                g.fillTank(t, T.get(A - 1), D);
                g.print();
            System.out.println();
            } else if(camd == 1){
                double refuel[] = new double[k];
                for (int j = 0; j < refuel.length; j++) {
                    refuel[j] = sc.nextDouble();
                }   
                g.refuel(refuel);
                g.print();
                System.out.println();
            }
            
        }
        sc.close();
    }
}
