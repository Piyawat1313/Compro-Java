// package Compositionjava;

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
    int weight;

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
    void printInfo(){
        System.out.println(this.countPro + " items = " + this.price + " baht " + this.weight + " grams ");
        for (int i = 0; i < count.length; i++) {
            System.out.println(pro[i].name + " " + this.count[i] + "x" + pro[i].price + " = " + String.format("%d", count[i] * pro[i].price));
        }
    }
}

public class ProductShipping2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Product p[] = new Product[N];
        int amount[] = new int[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int w = sc.nextInt();
            int price = sc.nextInt();
            p[i] = new Product(name, w, price);
            amount[i] = sc.nextInt();
        }
        PurchaseOrder ppOrder = new PurchaseOrder(N, p, amount);
        ppOrder.printInfo();
        sc.close();
    }
}
