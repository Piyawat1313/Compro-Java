import java.util.ArrayList;
import java.util.Scanner;

class Car {
    int ID;
    String name;
    int price;
    int powergen;

    Car(String name, int price, int powergen) {
        this.name = name;
        this.price = price;
        this.powergen = powergen;
    }

    static boolean check(String name, int price, int powergen) {
        if (name != null && name.length() != 0 && powergen > 0 && price > 0) {
            return true;
        }
        return false;
    }
}

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Car car[] = new Car[N];
        for (int i = 0; i < car.length; i++) {
            Car.check(null, 0, 0);
        }
       ArrayList<Integer> index2 = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            String name = sc.next();
            int price = sc.nextInt();
            int labor = sc.nextInt();
            car[i] = new Car(name, price, labor);
            if(Car.check(name, price, labor)){
                System.out.println("valid");
                index2.add(i);
            }
            else{
                System.out.println("invalid");
            }
        }
        for (int i = 0; i < index2.size(); i++) {
            int location = index2.get(i);
            System.out.println((i + 1) + " " + car[location].name);
        }
        sc.close();
    }
}
