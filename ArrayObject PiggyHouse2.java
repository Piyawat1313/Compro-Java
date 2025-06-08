import java.util.Scanner;

class House {
    public int wide;
    public int Long;
    public int countPig;
    int area = 0;
    public String name;
    int outPigy;
    int remind;

    House(int W, int L, int countPig, String name) {
        this.wide = W;
        this.Long = L;
        this.countPig = countPig;
        this.name = name;
        System.out.println(this.name + ", Width " + this.wide + ", Length " + this.Long + ", Piggies " + this.countPig);
    }

    boolean addPiggies(int k) {
        if (9 * (countPig + k) <= (wide * Long)) {
            countPig += k;
            area = 9 * countPig;
            return true;
        }
        return false;
    }

    int removePiggies(int out) {
            outPigy = Math.min(out, countPig);
            countPig -= outPigy;
        return outPigy;
    }
    
    void printPiggies() {
        area = 9 * countPig;
        remind = (wide * Long) - area;
        System.out.println(name + ", Piggies " + countPig + ", Used " + area + ", Left " + remind);
    }

    static void encourage() {
        System.out.println("Piggy Together STRONG!");
    }
}

public class PiggyHouse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        House house[] = new House[N];
        for (int i = 0; i < N; i++) {
            House.encourage();
            if (i == 0) {
                break;
            }
        }
        for (int i = 0; i < N; i++) {
            int wide = sc.nextInt();
            int L = sc.nextInt();
            int pig = sc.nextInt();
            String name = sc.next();
            sc.nextLine();
            house[i] = new House(wide, L, pig, name);
        }

        int C = sc.nextInt();
        while (C != 0) {
            switch (C) {
                case 1:
                    int M = sc.nextInt();
                    house[M - 1].printPiggies();
                    break;
                case 2:
                    M = sc.nextInt();
                    int K = sc.nextInt();
                    boolean isadd = house[M - 1].addPiggies(K);
                    if (isadd) {
                        house[M - 1].printPiggies();
                    } else {
                        System.out.println("Sorry");
                    }
                    break;
                case 3:
                    M = sc.nextInt();
                    int R = sc.nextInt();
                    int remove = house[M - 1].removePiggies(R);
                    System.out.println("remove " + remove + " from " + house[M - 1].name);
                    break;
                case 4:
                    M = sc.nextInt();
                    int J = sc.nextInt();
                    K = sc.nextInt();
                    int count = house[M - 1].removePiggies(K);
                    boolean ismove = house[J - 1].addPiggies(count);
                    if (ismove) {
                        System.out.println("move " + count + " piggies from " + house[M - 1].name + " to " + house[J - 1].name);
                    } else {
                        System.out.println("Unsuccessful");
                        house[M - 1].addPiggies(count);  // return old home
                    }
                    break;
            }
            C = sc.nextInt();
        }
        sc.close();
    }
}
