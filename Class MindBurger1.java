import java.util.Scanner;
class  Burger{
    String typebeef = "";
    boolean lettuce;
    boolean tomato;
    boolean pickled;
    int numCheese = 0;
    double price = 0;
    Burger(String Nb, boolean L, boolean t, boolean p,  int cheese){
        this.typebeef = Nb + "BURGER";
        this.lettuce = L;
        this.tomato = t;
        this.pickled = p;
        if(cheese < 0)
           this.numCheese = 0;
        else if(cheese > 3)
           this.numCheese = 3;
        else this.numCheese = cheese; 
           this.price = 49 + (20 * numCheese);
        
    }
    void printInfo(){
        System.out.print(typebeef);
        if(lettuce){
            System.out.print(" lettuce");
        }
        if(tomato){
            System.out.print(" tomato");
        }
        if(pickled){
            System.out.print(" pickled");
        }
        System.out.print(" cheese" + numCheese);
        System.out.print(" = $" + (price));
    }
}
public class MindBurger1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String meat = sc.next();
        String Bol = sc.next();
        int n = sc.nextInt();
        boolean lettuce = (Bol.charAt(0) == 'Y' ? true : false);
        boolean tomato = (Bol.charAt(1) == 'Y' ? true : false);
        boolean pickled = (Bol.charAt(2) == 'Y' ? true : false);
        Burger b = new Burger(meat, lettuce, tomato, pickled, n);
        b.printInfo();
        sc.close();
    }
}
