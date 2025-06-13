// package Inheritance;

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
        if (!isfive || !valid) {
            members = null;
            return;
        } else {
                this.members = name.clone();
               isBalanced(name); 
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

    boolean isBalanced(Hero[] member) {
        if (member == null || member.length < 5 || member.length > 5) {
            return false;
        } else {
            boolean hascarry = false;
            boolean hasFig = false;
            boolean hasmag = false;
            boolean hastank = false;
            for (int i = 0; i < 5; i++) {       //วิธีการเช็คว่า วัตถุ ตรงกันหรือเปล่า
                if (member[i] instanceof Carry) {
                    hascarry = true;
                }
                if (member[i] instanceof Fighter) {
                    hasFig = true;
                }
                if (member[i] instanceof Mage) {
                    hasmag = true;
                }
                if (member[i] instanceof Tank) {
                    hastank = true;
                }
            }
            if (hascarry == true && hasFig == true && hasmag == true && hastank == true) {
                System.out.println("balanced team");
                return true;
            } else {
                System.out.print("team needs ");
                if (!hascarry) {
                    System.out.print("carry ");
                }
                if (!hasFig) {
                    System.out.print("fighter ");
                }
                if (!hasmag) {
                    System.out.print("mage ");
                }
                if (!hastank) {
                    System.out.print("tank ");
                }
                System.out.println();
                return false;
            }
        }
    }
}

class Carry extends Hero {
    Carry(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

class Fighter extends Hero {
    Fighter(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

class Mage extends Hero {
    Mage(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

class Tank extends Hero {
    Tank(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

class Support extends Hero {
    Support(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

class Assassin extends Hero {
    Assassin(String name, int powerlife, int typeAttack, int attack, int defphy, int defmagic) {
        super(name, powerlife, typeAttack, attack, defphy, defmagic);
    }
}

public class AoSU3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero members[] = null;
        if (N > 0) {
            members = new Hero[N];
            for (int i = 0; i < N; ++i) {
                int type = scan.nextInt();
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                switch (type) {
                    case 1:
                        members[i] = new Carry(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                    case 2:
                        members[i] = new Fighter(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                    case 3:
                        members[i] = new Mage(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                    case 4:
                        members[i] = new Tank(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                    case 5:
                        members[i] = new Support(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                    case 6:
                        members[i] = new Assassin(name, hp, attkType, attkDmg, phyDef, magDef);
                        break;
                }
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
        System.out.println(t.isBalanced(members));
        scan.close();
    }
}
