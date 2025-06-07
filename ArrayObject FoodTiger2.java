import java.util.Scanner;
class FoodShop{
    String name;
    int nFoods; // <= 5
    String[] menu;
    FoodShop(String name){
        this.name = name;
        this.nFoods = 0;
        this.menu = new String[5];
    }
    boolean addFood(String nameMen){
        if(nFoods + 1 <= 5){
            nFoods++;
                menu[nFoods - 1] = nameMenu;
            System.out.print(nFoods + " ");
            return true;
        }
        else{
            System.out.print("-1 ");
            return false;
        }
    }
    void printMenu(){
        System.out.print(this.name + " ");
        for (int i = 0; i < menu.length; i++) {
            if(menu[i] != null && !menu[i].isEmpty()){
                System.out.print(menu[i] + " ");
            }
        }
        System.out.println();
    }
}
public class FoodTiger2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FoodShop foodShop[] = new FoodShop[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            foodShop[i] = new FoodShop(name);
        }
        final int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int add = sc.nextInt();
            String menu = sc.next();
            boolean ret = foodShop[add - 1].addFood(menu);
            System.out.println(ret);
        }
        for (int i = 0; i < foodShop.length; i++) {
            foodShop[i].printMenu();
        }
        sc.close();
    }
}
