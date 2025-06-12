import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age;
    boolean check = true;
    Animal(String name, int lifeExpect) {
        this.name = name;
        this.lifeExpect = lifeExpect;
        this.age = 0;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }

    void live(int year) {
        if(age == this.lifeExpect){     //ถ้าเท่าอายุขัย คือ ตาย
            System.out.println(this.name + " died earlier ");
            return;
        }
        int live = age + year;  //อายุที่ใช้ บวกปีที่ผ่านมา
        if(live < this.lifeExpect){     //ถ้าอายุที่ผ่ามา น้อยกว่า อายุขัย
            if(year == 1){      //เป็น 1 ไม่ต้องเติม S
                System.out.println(this.name + " lived " + year + " more year");
            }
            else{       
                System.out.println(this.name + " lived " + year + " more years");
            }
            age += year;
            return;
        }
        if(live >= this.lifeExpect){
            int x = this.lifeExpect - age;  //อายุขัย - อายุที่ใช้ไป
            if(x == 1){
                System.out.println(this.name + " lived " + x + " more year and died");
            }
            else{
                System.out.println(this.name + " lived " + x + " more years and died");
            }
            age = this.lifeExpect;
            return;
        }
    }

    boolean isAlive() {
        if(age == this.lifeExpect){
            System.out.println(this.name + " is dead");
            return true;
        }else{
            System.out.println(this.name + " is alive");
            return false;
        }
    }
}

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Animal> a = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            int type = sc.nextInt();
            if (type == 1) {
                String name = sc.next();
                int lifeExpect = sc.nextInt();
                Animal animal = new Animal(name, lifeExpect);
                a.add(animal);
            } else if (type == 2) {
                int id = sc.nextInt();
                int year = sc.nextInt();
                a.get(id - 1).live(year);
            } else if (type == 3) {
                int id = sc.nextInt();
                a.get(id - 1).isAlive();
            }
        }
    }
}
