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

class Pokimon {
    PokiStats stats;
    String name;
    int level;
    int energy;

    Pokimon(PokiStats stats, String name, int level) {
        this.stats = stats;
        this.name = name;
        this.level = level;
        this.energy = stats.hp[this.level];
    }

    int attack() {
        return stats.attk[this.level];
    }

    int defend() {
        return stats.defend[this.level];
    }

}

public class Pokimon2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        for (int level = 1; level <= 5; ++level)
            hps[level] = scan.nextInt();
        for (int level = 1; level <= 5; ++level)
            attks[level] = scan.nextInt();
        for (int level = 1; level <= 5; ++level)
            defends[level] = scan.nextInt();
        PokiStats stats = new PokiStats(hps, attks, defends);
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());
        scan.close();
    }
}
