import java.util.Scanner;

class FoodOrder {
    String name = "";
    int foodTotal = 0;
    int grandTotal = 0;
    int rider = 0;
    int owner = 0;
    int sell = 0;
    FoodOrder(String Name) {
        this.name = Name;
    }

    int addFood(int total) {
        this.foodTotal += total;
        return foodTotal;
    }

    void finalizeReceipt() {
        int Delivery = 0;
        System.out.println(name);
        System.out.println(this.foodTotal);
        if (this.foodTotal <= 50) {
            Delivery = 20;
            System.out.println(Delivery);
        } else if (this.foodTotal > 50 && this.foodTotal <= 150) {
            Delivery = 10;
            System.out.println(Delivery);
        } else {
            Delivery = 0;
            System.out.println(Delivery);
        }
        grandTotal = (foodTotal + Delivery);
        System.out.println(grandTotal);

    }

    void distribIncome() {
        if (foodTotal <= 200) {
            rider = 20;
            owner = (foodTotal * 3) / 10;
            sell = grandTotal - rider - owner;
            System.out.println("Rider: " + rider);
            System.out.println("GrabPanda: " + owner);
            System.out.println("Food Seller: " + sell);
        }
        else if(foodTotal > 200){
             rider = 30;
            owner = (foodTotal * 3) / 10;
            sell = grandTotal - rider - owner;
            System.out.println("Rider: " + rider);
            System.out.println("GrabPanda: " + owner);
            System.out.println("Food Seller: " + sell);
        }
    }
}

public class GrabPanda2 {
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
        order.distribIncome();
        sc.close();
    }
}
