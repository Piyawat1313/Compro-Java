package Compositionjava;

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
    ArrayList<ProductInfo> search(String product){
        int count = 0;
        boolean check = false;
        int idx = 0;
        for (int i = 0; i < this.products.size(); i++) {
            idx = this.products.get(i).nameProduct.indexOf(product);
            if(idx != -1 && this.products.get(i).nameProduct.contains(product) && this.products.get(i).priceExpen > 0 && this.products.get(i).priceLess > 0){
                check = true;
                count++;
            }
        }
        if(check){
            System.out.println(count);
            for (int i = 0; i < this.products.size(); i++) {
                if(this.products.get(i).priceExpen > 0 && this.products.get(i).priceLess > 0 && this.products.get(i).nameProduct.contains(product)){
                    System.out.println(this.products.get(i).nameProduct + " " + this.products.get(i).priceLess + " " + this.products.get(i).priceExpen);
                }
            }
        }
        else{
            System.out.println(count);
            System.out.println("product not found");
        }
        return this.products;
    }
}
public class PriceRange3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
           store.enterProductInfo(sc);
        }
        String productName = sc.next();
        
        store.search(productName);
        System.out.println();
        
        sc.close();
    }
}
