package Compositionjava;

import java.util.Scanner;

class Product {
    String name;
    int weight;
    int price;

    Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo() {
        System.out.println(this.weight + " grams of " + this.name + " costs " + this.price + " baht");
    }
}

class PurchaseOrder {
    int countPro;
    Product pro[];
    int count[];
    int price;
    double weight;

    PurchaseOrder(int countPro, Product pro[], int count[]) {
        this.countPro = countPro;
        this.count = new int[countPro];
        this.pro = new Product[countPro];
        this.pro = pro.clone();
        this.count = count.clone();
        for (int i = 0; i < count.length; i++) {
            price += count[i] * pro[i].price;
            weight += pro[i].weight * count[i];
        }
    }

    void printInfo() {
        System.out.println(this.countPro + " item = " + this.price + " bath " + this.weight + " grams ");
        for (int i = 0; i < count.length; i++) {
            System.out.println(pro[i].name + " " + this.count[i] + " x " + pro[i].price + " = "
                    + String.format("%d", count[i] * pro[i].price));
        }
    }
}

class Truck {
    int capacity;
    PurchaseOrder preorder;
    double stationfinal;
    double shipping;

    Truck(int capacity) {
        this.capacity = capacity;
        this.stationfinal = 0;
        this.shipping = 0;
    }

    void add(PurchaseOrder preorder, int station) {
        this.stationfinal = station;
        this.preorder = preorder;
        setFee();
    }

    void setFee() {
        this.shipping = (preorder.weight / 1000) * this.stationfinal;
    }

    double getFee() {
        return this.shipping;
    }
}

class SpecialTruck extends Truck {
    SpecialTruck(int capacity) {
        super(capacity);
    }

    @Override
    void setFee() {
        this.shipping = 2 * ((this.capacity / 1000.0) * this.stationfinal);
    }
}

public class ProductShipping4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            int type = in.nextInt();
            if (type == 1)
                trucks[i] = new Truck(capacity);
            else
                trucks[i] = new SpecialTruck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {

            if ((trucks[i].capacity >= po.weight) && (minvalue > trucks[i].capacity)) {
                minvalue = trucks[i].capacity;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            double fee = po.weight * dest / 1000.0;
            System.out.println("Fee=" + fee + " " + (2 * fee));
        }
        in.close();
    }
}
