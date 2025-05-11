import java.util.Scanner;

class FoodOrder {
    String name = "";
    int foodTotal = 0;

    FoodOrder(String Name) {
        this.name = Name;
    }

    int addFood(int total) {
        this.foodTotal += total;
        return foodTotal;
    }
    void finalizeReceipt(){
        int Delivery = 0;
        System.out.println(name);
        System.out.println(this.foodTotal);
        if(this.foodTotal <= 50){
            Delivery = 20;
            System.out.println(Delivery);
        }
        else if(this.foodTotal > 50 && this.foodTotal <= 150){
            Delivery = 10;
            System.out.println(Delivery);
        }
        else{
            Delivery = 0;
            System.out.println(Delivery);
        }
        System.out.println((this.foodTotal + Delivery));

    }
}

public class GrabPanda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int conten = sc.nextInt();
        FoodOrder order = new FoodOrder(name);
        for (int i = 0; i < conten; i++) {
            int price = sc.nextInt();
            order.addFood(price);
        }
        order.finalizeReceipt();
        sc.close();
    }
}
