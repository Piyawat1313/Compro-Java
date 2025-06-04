import java.util.Scanner;

class Pond {
    int dep;
    int r;
    int fish;
    int drepresion;

    Pond(int dep, int R) {
        this.dep = dep;
        this.r = R;
        this.fish += 20 * (dep * r);
        printInfo();
    }

    void reproductive(int H) {
        this.fish += ((H * r * dep) / 4) + ((H * fish) / 3);
        printInfo();
    }

    void takeFish(int k) {
        if (fish - k >= 0) {
            fish -= k;
        }
        else{
            fish = 0;
        }
        printInfo();
    }

    void expand(int P) {
        if (r + P >= 50) {
            r = 50;
        }
        else{
            r += P;
        }
        printInfo();
    }

    void printInfo() {
        System.out.println("Depth " + dep + ", Radius " + r + ", Fish " + fish);
    }
}

public class FishyPond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        Pond p = new Pond(d, r);
        while (true) {
            int C = sc.nextInt();
            if (C == 0) {
                break;
            } else if (C == 1) {
                int k = sc.nextInt();
                p.takeFish(k);
            } else if (C == 2) {
                int H = sc.nextInt();
                p.reproductive(H);
            } else if (C == 3) {
                int P = sc.nextInt();
                p.expand(P);
            }
        }
        sc.close();
    }
}
