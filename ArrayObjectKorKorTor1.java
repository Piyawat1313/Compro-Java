import java.util.Scanner;

class Party {
    String[] Name;
    String[] LastName;
    int[] number;
    String P;
    int N;
    Party(String pak, int N, Scanner sc) {
        this.P = pak;
        this.N = N;
        this.Name = new String[N];
        this.LastName = new String[N];
        this.number = new int[N];
        for (int i = 0; i < N; i++) {
            Name[i] = sc.next();
            LastName[i] = sc.next();
            number[i] = sc.nextInt();
        }
    }
    void printInfo(int regionNumber) {
        if (regionNumber < 0) {
            System.out.println("invalid region number");
            return;
        }
        if(regionNumber == 0){
            for (int i = 0; i < N; i++) {
                System.out.println(this.Name[i] + " " + this.LastName[i] + " " + this.number[i]);
            }
            return;
        }
        boolean check = false;
        for (int i = 0; i < N; i++) {
            if(this.number[i] == regionNumber){
                System.out.println(this.Name[i] + " " + this.LastName[i]);
                check = true;
            }
        }
        if (!check) {
            System.out.println("none");
        }
    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Party p[] = new Party[n];
        String pak[] = new String[n];
        int[] countPak = new int[n];
        for (int i = 0; i < n; i++) {
            pak[i] = sc.next();
            countPak[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {    //วิธีส่งค่า แสกนเข้าไปใน ตัวสร้าง
            p[i] = new Party(pak[i], countPak[i], sc);
        }
        final int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int partyNumber = sc.nextInt() - 1;
            int regionNumber = sc.nextInt();
            p[partyNumber].printInfo(regionNumber);
        }
    }
}
