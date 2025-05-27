import java.util.Scanner;

class Precinct {
    String vote;
    String[] NamePak;
    int indexName = 0;
    int score[];

    Precinct(String vote, String[] Name) {
        this.vote = vote;
        this.score = new int[Name.length];
        this.NamePak = new String[Name.length];
        for (int i = 0; i < Name.length; i++) {
            this.NamePak[i] = Name[i];
        }
    }

    void count(int num) {
        if (num < 0 || num >= this.NamePak.length) {
            System.out.println("invalid number");
            return;
        }
        score[num]++;
        System.out.println(this.NamePak[num] + " " + this.score[num]);
    }

    void printInfo() {
        for (int i = 0; i < NamePak.length; i++) {
            System.out.println((i + 1) + " " + this.NamePak[i] + " " + score[i]);
        }
    }

    void printMax() {
        int max = 0;
        for (int i = 0; i < NamePak.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        for (int i = 0; i < NamePak.length; i++) {
            if(score[i] == max){
                System.out.println((i + 1) + " " + NamePak[i] + " " + max);
            }
        }
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam = sc.next();
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        Precinct precinct = new Precinct(nam, arr);
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int p = sc.nextInt();
            if (p == 1) {
                int num = sc.nextInt() - 1;
                precinct.count(num);

            } else if (p == 2) {
                precinct.printInfo();
            } else if (p == 3) {
                precinct.printMax();
            }
        }
        sc.close();
    }
}
