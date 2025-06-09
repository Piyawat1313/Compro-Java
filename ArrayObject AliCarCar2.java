package Compositionjava;

import java.util.Scanner;

class Car {
    int ID;
    String name;
    int price;
    int powergen;

    Car(int index, String name, int price, int powergen) {
        this.ID = index;
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

class Factory {
    int typecar;
    boolean[] factory;
    int totalPF;

    Factory(int typecar, boolean[] factory, int totalPF) {
        this.typecar = typecar;
        this.factory = new boolean[typecar + 1];
        for (int i = 1; i <= typecar; i++) {
            this.factory[i] = factory[i];
        }
        this.totalPF = totalPF;
    }
}

public class AliCarCar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Car car[] = new Car[N + 1];
        int id = 0;
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int price = sc.nextInt();
            int labor = sc.nextInt();
            if (Car.check(name, price, labor)) {
                id++;
                car[id] = new Car(i, name, price, labor);
            } 
        }
        Factory[] factories = new Factory[6];
        for (int i = 1; i <= 5; i++) {
            int countpowerGen = sc.nextInt();
            boolean arr[] = new boolean[N + 1];
            for (int j = 1; j <= N; j++) {
                int num = sc.nextInt();
                if (num == 1) {
                    arr[j] = true;
                } else {
                    arr[j] = false;
                }
            }
            factories[i] = new Factory(id, arr, countpowerGen);
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int type = sc.nextInt();
            if (type > id) {
                System.out.println("invalid model");
                continue;
            }
            boolean found = false;
            for (int j = 1; j <= 5; j++) {
                if (factories[j].factory[type] && factories[j].totalPF >= car[type].powergen) {
                    factories[j].totalPF -= car[type].powergen;
                    System.out.println("okay " + (j));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("unable to build");
            }
        }
        sc.close();
    }
}
