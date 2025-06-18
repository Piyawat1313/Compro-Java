// package Compositionjava;

import java.util.ArrayList;
import java.util.Scanner;
class ProductInfo{
    public String nameProduct;
    public int priceLess;
    public int priceExpen;
    ProductInfo(String name, int[] contence){
        this.nameProduct = name;
        this.priceExpen = Integer.MIN_VALUE;
        this.priceLess = Integer.MAX_VALUE;
        for (int i = 0; i < contence.length; i++) {
            if(contence[i] > priceExpen){
                priceExpen = contence[i];
            }
        }
        for (int i = 0; i < contence.length; i++) {
            if(contence[i] < priceLess){
                priceLess = contence[i];
            }
        }
    }
    void printInfo(){
        if(this.priceExpen > 0 && this.priceLess > 0){
            System.out.println(this.nameProduct + " " + this.priceLess + " " + this.priceExpen);
        }
    }
}
class Store{
    private ArrayList<ProductInfo> products = new ArrayList<>();
    void enterProductInfo(Scanner sc){
        String name = sc.next();
        int round = sc.nextInt();
        int[] contence = new int[round];
        for (int i = 0; i < round; i++) {
            contence[i] = sc.nextInt();
            products.add(new ProductInfo(name, contence));
        }
    }
    void printAllProductInfo(){
        for (int i = 0; i < products.size(); i++) {
            products.get(i).printInfo();
        }
    }
}
public class PriceRange2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
           store.enterProductInfo(sc);
        }
        store.printAllProductInfo();
        sc.close();
    }
}
