import java.util.Scanner;

class Item {
    boolean goldJewelry;
    double wage;
    double weight2;
    double countSale = 0;


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

    double showdetail(double pricegold) {
        double totalS = 0;
        double totalB = 0;
        if (this.goldJewelry){
            totalS += this.wage;
            return totalS;
        }
        else{
            totalB += this.wage;
            return totalB;
        }
           
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        double totalS = 0;
        double totalB = 0;
        double result = 0;
        double result2 = 0;
        boolean checkS = true;
        boolean checkB = true;
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")){
                arrayx[i] = new Item(true, weight);
            }
            else
                arrayx[i] = new Item(false, weight);
                if (cmdline.equalsIgnoreCase("s")) {
                result += arrayx[i].showdetail(pricegold);
                 totalS += arrayx[i].saleprice(pricegold);
                 checkS = false;
                
            } else if (cmdline.equalsIgnoreCase("b")) {
                result2 += arrayx[i].showdetail(pricegold);
                totalB += arrayx[i].buyprice(pricegold);
                checkB = false;
            }
        }
        if(!checkS){
            System.out.println(result + " " + totalS);
        }
         else{
            System.out.println("0.0 " + "0.0");
        }
        if(!checkB){
            System.out.println(result2  + " " + totalB);
        }
         else{
            System.out.println("0.0 " + "0.0");
        }
       
        input.close();
    }
}
