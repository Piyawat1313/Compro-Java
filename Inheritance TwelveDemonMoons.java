package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

class Demons {
    private String name;
    private int hp;
    private String Background;

    Demons(String name, int hp, String Background) {
        this.name = name;
        this.hp = hp;
        this.Background = Background;
    }

    public String getName() {
        return name;
    }

    public int HP() {
        return this.hp;
    }

    public String getBackground() {
        return Background;
    }

    public void setHP(int HP) {
        this.hp = HP;
    }
}

class Muzan extends Demons {
    private String Alias;
    private String gender;
    private int blood;
    public int power;

    Muzan(String name, int[] hp, String Background, int type) {
        super(name, 0, Background);
        int hps = hp[type];
        super.setHP(hps / 2);
        this.blood = hps - (hps / 2);
        if (type == 0) {
            this.Alias = "Child";
            this.gender = "Male";
        } else if (type == 1) {
            this.Alias = "Geisha";
            this.gender = "Female";
        } else if (type == 2) {
            this.Alias = "The King of Demons";
            this.gender = "Male";
        }
        this.power = (this.HP() + this.blood) * 50;
    }

    Muzan(String name) {
        super(name, 0, "Unknown");

    }

   public int Blood() {
        if (this.blood > 0) {
            int give = (int)(this.blood * 0.10);
            this.blood -= give;
            return give;
        }
        return this.blood;
    }

    public void printInfo() {
        this.power = (this.HP() + this.blood) * 50;
        System.out.println("Muzan Kibutsuji ( " + this.Alias + " )");
        System.out.println("Gender : " + this.gender);
        System.out.println("HP : " + this.HP());
        System.out.println("Blood : " + this.blood);
        System.out.println("Power : " + this.power);
        System.out.println("Background : " + this.getBackground());
    }
}

class DemonMoons_UpperRanks extends Muzan {
    public int rank;

    DemonMoons_UpperRanks(String name, int rank, int blood) {
        super(name);
        this.rank = rank;
        this.power = this.rank * blood * 50;
        super.setHP(rank * blood * 75);
    }

    public void Blood(int blood) {
        this.power += (blood * 50);
        super.setHP(this.HP() + blood * 75);
    }

    public void printInfo() {
        System.out.println("Name : " + this.getName());
        System.out.println("Upper Rank : " + this.rank);
        System.out.println("Power : " + this.power);
        System.out.println("HP : " + super.HP());
        System.out.println("Background : " + this.getBackground());
    }
}

class DemonMoons_LowerRanks extends Muzan {
    public int rank;

    DemonMoons_LowerRanks(String name, int rank, int blood) {
        super(name);
        this.rank = rank;
        this.power = this.rank * blood * 25;
        super.setHP(rank * blood * 50);
    }

    public void Blood(int blood) {
        this.power += blood * 25;
        super.setHP(super.HP() + blood * 50);
    }

    public void printInfo() {
        System.out.println("Name : " + this.getName());
        System.out.println("Lower Rank : " + this.rank);
        System.out.println("Power : " + this.power);
        System.out.println("HP : " + super.HP());
        System.out.println("Background : " + this.getBackground());
    }
}

public class TwelveDemonMoons {
    private static ArrayList<Muzan> DemonMoons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int hp[] = new int[3];
        for (int i = 0; i < 3; i++) {
            hp[i] = sc.nextInt();
        }
        sc.nextLine();
        String bg = sc.nextLine();
        int type = sc.nextInt();
        Muzan muzun = new Muzan(name, hp, bg, type);
        for (;;) {
            int type_demons = sc.nextInt();
            if (type_demons == 0) {
                break;
            } else if (type_demons > 0) {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan upper = new DemonMoons_UpperRanks(n, rank, blood);
                DemonMoons.add(upper);
            } else {
                String n = sc.next();
                int rank = sc.nextInt();
                int blood = muzun.Blood();
                Muzan lower = new DemonMoons_LowerRanks(n, rank, blood);
                DemonMoons.add(lower);
            }
        }
        int com = sc.nextInt();
        for (int i = 0; i < com; i++) {
            int id = sc.nextInt() - 1;
            int blood = muzun.Blood();
            if (DemonMoons.get(id) instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) DemonMoons.get(id);
                up.Blood(blood);
                DemonMoons.set(id, up);
            } else if (DemonMoons.get(id) instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) DemonMoons.get(id);
                low.Blood(blood);
                DemonMoons.set(id, low);
            }
        }
        muzun.printInfo();
        for (Muzan x : DemonMoons) {
            if (x instanceof DemonMoons_UpperRanks) {
                DemonMoons_UpperRanks up = (DemonMoons_UpperRanks) x;
                up.printInfo();
            } else if (x instanceof DemonMoons_LowerRanks) {
                DemonMoons_LowerRanks low = (DemonMoons_LowerRanks) x;
                low.printInfo();
            }
        }
    }
}
