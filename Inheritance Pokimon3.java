package Inheritance;

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

class WaterPokimon extends Pokimon {
    WaterPokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }

    int attack(WaterPokimon opp) {
        return super.attack();
    }

    int attack(FirePokimon fire) {
        return super.attack() * 2;
    }

    int attack(ElectricPokimon epoki) {
        return super.attack();
    }
}

class FirePokimon extends Pokimon {
    FirePokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }

    int attack(WaterPokimon opp) {
        return super.attack();
    }

    int attack(FirePokimon fire) {
        return super.attack();
    }

    int attack(ElectricPokimon epoki) {
        return super.attack() * 2;
    }
}

class ElectricPokimon extends Pokimon {
    ElectricPokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }

    int attack(WaterPokimon opp) {
        return super.attack() * 2;
    }

    int attack(FirePokimon fire) {
        return super.attack();
    }

    int attack(ElectricPokimon epoki) {
        return super.attack();
    }
}

public class Pokimon3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        for (int t = 1; t <= 3; t++) {
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
            if (t == 1) {
                water = new WaterPokimon(stats, name, level);
            } else if (t == 2) {
                fire = new FirePokimon(stats, name, level);
            } else if (t == 3) {
                electric = new ElectricPokimon(stats, name, level);
            }
        }
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " + water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
        scan.close();
    }
}
