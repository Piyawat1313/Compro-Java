package Inheritance;

import java.util.Scanner;

class Hero {
    String name;
    int attack;
    int defend;
    int powerlife;
    int typeAttack;
    int defphy;
    int defmagic;
    boolean check = true;

    Hero(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        this.name = name;
        this.powerlife = powerlife;
        this.typeAttack = typeAttack;
        this.attack = attack;
        this.defphy = defphy;
        this.defmagic = defmagic;
        if (powerlife < 0 || typeAttack < 0 || attack < 0 || defphy < 0 || defmagic < 0) {
            check = false;
            System.out.println("warning: value cannot be negative");
        }
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.powerlife);
        if (typeAttack == 1) {
            System.out.println("Attack: " + this.attack + " (physical)");
        } else if (this.typeAttack == 2) {
            System.out.println("Attack: " + this.attack + " (magical)");
        }
        System.out.println("Defense: " + this.defphy + " (physical), " + this.defmagic + " (magical)");
        if (powerlife < 0 || typeAttack < 0 || attack < 0 || defphy < 0 || defmagic < 0) {
            System.out.println("warning: value cannot be negative");
        }
    }

    boolean checkAndWarn() {
        if (!check) {
            System.out.println("warning: value cannot be negative");
            return false;
        }
        check = true;
        return true;
    }
}

class Team {
    Hero[] members;

    Team(Hero[] name) {
        boolean isfive = is5MemberTeam(name);
        boolean valid = isValid(name);
        if (!isfive) {
            members = null;
            return;
        } else {
            if (valid) {
                this.members = name.clone();
            } else {
                members = null;
                return;
            }
        }
    }

    boolean is5MemberTeam(Hero[] name) {
        if (name == null || name.length < 5) {
            System.out.println("member is missing");
            return false;
        } else if (name.length == 5) {
            System.out.println("full team");
            return true;
        }
        System.out.println("too many members");
        return false;
    }

    boolean isValid(Hero[] name) {
        if (name == null || name.length > 5 || name.length < 5) {
            return false;
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if (name[i].name.equals(name[j].name)) {
                        System.out.println("cannot select same hero: " + name[i].name);
                        return false;
                    }
                }
            }
            System.out.println("valid hero selection");
            return true;
        }
    }
}

public class AoSU2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero members[] = null;
        if (N > 0) {
            members = new Hero[N];
            for (int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        scan.close();
    }
}
