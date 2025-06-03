import java.util.Scanner;

class Bus {
    String name;
    int type;
    private int countSeats;
    private int countReseve;
    private boolean status;

    Bus(String name, int type, int countSeats) {
        this.name = name;
        this.type = type;
        this.countSeats = countSeats;
        this.countReseve = 0;
        this.status = true;
    }

    boolean reserve(int k) {
        if (k < 1) {
            return false;
        }
        if (this.countReseve + k > this.countSeats) {
            return false;
        }
        if (!this.status) {
            return false;
        }
        this.countReseve += k;
        return true;
    }

    void sendToRepair() {
        this.status = false;
    }

    void backToService() {
        this.status = true;

    }
}

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int Q = sc.nextInt();
        Bus bus[] = new Bus[Q];
        for (int i = 0; i < Q; i++) {
            String name = sc.next();
            int type = sc.nextInt();
            int C = sc.nextInt();
            bus[i] = new Bus(name, type, C);
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int k = sc.nextInt();
            int t = sc.nextInt();
            if (p == 1) {
                boolean found = false;
                for (int j = 0; j < Q; j++) {
                    if (bus[j].type != t) {
                        continue;
                    }
                    boolean req = bus[j].reserve(k);
                    if (req == true) {
                        System.out.println(bus[j].name);
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                        System.out.println("sorry");
                }

            } else if (p == 2) {
                bus[t - 1].sendToRepair();
            } else {
                bus[t - 1].backToService();
            }
        }
        sc.close();
    }
}
