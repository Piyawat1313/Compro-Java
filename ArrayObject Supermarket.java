package ArrayObject;

import java.util.ArrayList;
import java.util.Scanner;

class Basket {
    int grape;
    int melon;
    int apple;
    int cherry;
    int pear;
    int kiwi;
    int totalPrice;
    int weight;
    int countTypeFruit;

    Basket(int grape, int melon, int apple, int cherry, int pear, int kiwi) {
        this.grape = grape;
        this.melon = melon;
        this.apple = apple;
        this.cherry = cherry;
        this.pear = pear;
        this.kiwi = kiwi;
        this.weight = (grape * 500) + (melon * 2000) + (apple * 300) + (cherry * 350) + (pear * 400) + (kiwi * 500);
        this.totalPrice = (grape * 120) + (melon * 200) + (apple * 90) + (cherry * 180) + (pear * 60) + (kiwi * 150);
        this.countTypeFruit = positiveToOne(grape) + positiveToOne(melon) + positiveToOne(apple) + positiveToOne(cherry) + positiveToOne(pear) + positiveToOne(kiwi);

    }

    static int positiveToOne(int in) {
        return in > 0 ? 1 : 0;
    }
}

class FruitSection {
    ArrayList<Basket> Basket = new ArrayList<>();
    int maxPrice;
    int maxWeight;
    int income;

    FruitSection(int P, int W) {
        this.maxPrice = Integer.MIN_VALUE;
        this.maxWeight = Integer.MIN_VALUE;
        if (P > this.maxPrice) {
            this.maxPrice = P;
        }
        if (W > this.maxWeight) {
            this.maxWeight = W;
        }
        this.income = 0;
    }

    boolean check(Basket B) {
        boolean isprice = (B.totalPrice >= 500 && B.totalPrice <= this.maxPrice);
        boolean isW = (B.weight >= 2000 && B.weight <= this.maxWeight * 1000);
        boolean count = (B.countTypeFruit >= 3);
        if (isprice && isW && count) {
            return true;
        }
        return false;
    }

    void addBasket(Basket B) {
        if (check(B)) {
            this.Basket.add(B);
        }
    }

    void printBasket(int index) {
        if (index <= 0 || index > this.Basket.size()) {
            System.out.println("invalid");
            return;
        } else {
            System.out.println(this.Basket.get(index - 1).grape + " " + this.Basket.get(index - 1).melon + " "
                    + this.Basket.get(index - 1).apple + " " + this.Basket.get(index - 1).cherry + " "
                    + this.Basket.get(index - 1).pear + " " + this.Basket.get(index - 1).kiwi + ", "
                    + this.Basket.get(index - 1).totalPrice + " " + this.Basket.get(index - 1).weight + " "
                    + this.Basket.get(index - 1).countTypeFruit);
        }
    }

    void printAvailable() {
        if(this.Basket.isEmpty()){
            System.out.println("nothing to sell");
            return;
        }
        for (int i = 0; i < this.Basket.size(); i++) {
            printBasket(i + 1);
        }
    }

    void sellBasket(int m) {
        if (m < 0 || m > this.Basket.size()) {
            System.out.println("invalid");
            return;
        } else {
            System.out.println("sell basket " + m + " " + this.Basket.get(m - 1).totalPrice);
            this.income += Basket.get(m - 1).totalPrice;
            this.Basket.remove(m - 1);
        }
    }
}

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int W = sc.nextInt();
        FruitSection fs = new FruitSection(P, W);
        while (true) {
            int grape = sc.nextInt();
            int melon = sc.nextInt();
            int apple = sc.nextInt();
            int cherry = sc.nextInt();
            int pear = sc.nextInt();
            int kiwi = sc.nextInt();
            Basket b = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if (b.countTypeFruit == 0) {
                break;
            } else {
                fs.addBasket(b);
            }
        }
        while (true) {
            String command = sc.next();
            if(command.equals("stop")){
                System.out.println("income: " + fs.income);
                break;
            }
            if (command.equals("printAll")) {
                fs.printAvailable();
            }
            else if(command.equals("print")){
                int m = sc.nextInt();
                fs.printBasket(m);
            }
            else if(command.equals("sell")){
                int index = sc.nextInt();
                fs.sellBasket(index);
            }
        }
    }
}
