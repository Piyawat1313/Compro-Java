import java.util.Scanner;

class GasStation {
    int[] cap = new int[7];
    boolean[] oil = new boolean[7]; // have type Oil
    private String[] typeOil = { "Dummy", "95S", "91S", "E20", "E85", "B7", "B20" };
    int[] amountOil = new int[7]; // amount oil true

    GasStation(boolean[] oil, int[] cap) {
        this.oil = oil;
        this.cap = cap;
        for (int i = 0; i < cap.length; i++) {
            if (this.oil[i]) {
                amountOil[i] = cap[i];
            } else {
                amountOil[i] = 0;
            }
        }
    }

    void dispense(int type, int amount) {
        if (!oil[type]) {
            System.out.println("Invalid gas type");
            return;
        } else if (amountOil[type] <= 0) {
            System.out.println("No gas available");
            return;
        }
        int addOil = Math.min(amountOil[type], amount);
        amountOil[type] -= addOil;
        System.out.println("Dispense " + addOil + " liters");
    }

    void refillStation(int type, int amountCap) {
        if (!oil[type]) {
            System.out.println("Invalid gas type");
            return;
        }
        int addCap = cap[type] - amountOil[type]; // add in capacity
        if (addCap <= 0) {
            System.out.println("No storage capacity available");
            return;
        }
        int valency = Math.min(addCap, amountCap);
        amountOil[type] += valency;
        System.out.println("Refill " + valency + " liters");
    }

    void report() {
        for (int i = 1; i <= 6; i++) {
           if(oil[i]){
                System.out.print(typeOil[i] + " " + amountOil[i] + ", ");
           }
        }
    }
}

public class GasStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        GasStation[] stations = new GasStation[N + 1];
        for (int s = 1; s <= N; ++s) {
            boolean[] gas = new boolean[7]; // gas with service
            int[] capa = new int[7]; // capacity for each gas type
            for (int g = 1; g <= 6; ++g) {
                int k = sc.nextInt();
                gas[g] = (k > 0) ? true : false;
                capa[g] = k;
            }
            stations[s] = new GasStation(gas, capa);
        }

        final int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = sc.nextInt();
            final int S = sc.nextInt();
            final int B = sc.nextInt();
            final int C = sc.nextInt();
            switch (A) {
                case 1:
                    stations[S].dispense(B, C);
                    break;
                case 2:  
                    stations[S].refillStation(B, C);
                    break; 
                case 3: 
                    stations[S].report(); 
                    System.out.println(); 
                    break;   
            }
        }
        sc.close();
    }
}
