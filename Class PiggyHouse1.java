import java.util.Scanner;
class House {
    public int wide;
    public int Long;
    public int countPig = 0;
    int area = 0;
    House(int W, int L){
        wide = W;
        Long = L;
    }
    void printPiggies(){
        System.out.println("Piggies "+ countPig + ", " + "Space " + area);
    }
    static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }
}
public class PiggyHouse1 {
    public static void main(String[] args) {
        House.encourage();
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int L = sc.nextInt();
        House h = new House(w, L);
        while (true) {
            int k = sc.nextInt();
            if((k + h.countPig ) * 9 <= (w * L)){
                h.countPig += k;
                h.area += (9 * k);
                h.printPiggies();
            }
            else{
                 System.out.println("no space, need a new house");
                 break;
            }
        }
        sc.close();
    }
}
