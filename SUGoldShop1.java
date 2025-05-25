import java.util.Scanner;

class Item {
    boolean goldJewelry;
    double wage;
    double weight2;
    double Buyprice = 0.0;
    double priceJew = 0.0;

    Item(boolean Jewelry, double weight) {
        this.goldJewelry = Jewelry;
        this.wage = weight;
    }

    double saleprice(double pricegold) {
        double total = 0;
        if (this.goldJewelry) {
            total = (pricegold * this.wage) + (1000 * this.wage);
            return total;
        }
        total = pricegold * this.wage;
        return total;
    }

    double buyprice(double pricegold) {
        if (!goldJewelry) {
            return (pricegold - 100) * this.wage;
        }
        return pricegold * this.wage * 0.98;
       
    }

    void showdetail(double PriceCurren) {
        if (this.goldJewelry)
            System.out.print("ornament " + this.wage + " baht");
        else
            System.out.print("bar " + this.wage + " baht");
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t"))
                arrayx[i] = new Item(true, weight);
            else
                arrayx[i] = new Item(false, weight);
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }

        input.close();
    }
}
