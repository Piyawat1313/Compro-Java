// package Compositionjava;

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
public class PriceRange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int N = sc.nextInt();
        int[] contence = new int[N];
        for (int i = 0; i < contence.length; i++) {
            contence[i] = sc.nextInt();
            ProductInfo productInfo = new ProductInfo(name, contence);
            productInfo.printInfo();
        }
        sc.close();
    }
}
