// package Inheritance;

import java.util.Scanner;

class PokiStats {
    int[] hp;
    int[] attk;
    int[] defend;

    PokiStats(int[] hp, int[] attk, int[] def) {
        this.hp = new int[6];
        this.attk = new int[6];
        this.defend = new int[6];
        for (int i = 1; i <= 5; i++) {
            this.hp[i] = hp[i];
            this.attk[i] = attk[i];
            this.defend[i] = def[i];
        }
    }
}

public class Pokimon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        PokiStats[] poki = new PokiStats[N];
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        for (int i = 0; i < N; ++i) {
            for (int level = 1; level <= 5; ++level)
                hps[level] = scan.nextInt();
            for (int level = 1; level <= 5; ++level)
                attks[level] = scan.nextInt();
            for (int level = 1; level <= 5; ++level)
                defends[level] = scan.nextInt();

            poki[i] = new PokiStats(hps, attks, defends);
        }
        for (int i = 0; i < N; ++i) {
            PokiStats p = poki[i];
            for (int level = 1; level <= 5; ++level)
                System.out.print(p.hp[level] + " ");
            System.out.println();

            for (int level = 1; level <= 5; ++level)
                System.out.print(p.attk[level] + " ");
            System.out.println();

            for (int level = 1; level <= 5; ++level)
                System.out.print(p.defend[level] + " ");
            System.out.println();
        }
        scan.close();
    }
}
