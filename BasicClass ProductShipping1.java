// package Compositionjava;

import java.util.Scanner;
class Product{
    String name;
    int weight;
    int price;
    Product(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    void printInfo(){
        System.out.println(this.weight + " grams of " + this.name + " costs " + this.price + " baht.");
    }
}
public class ProductShipping1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int w = sc.nextInt();
            int price = sc.nextInt();
            Product p = new Product(name, w, price);
            p.printInfo();
        }
        sc.close();
    }
}
