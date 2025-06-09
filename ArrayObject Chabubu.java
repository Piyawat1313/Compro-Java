import java.util.Scanner;
class Combo{
    private String nameCombo;
    private int contBeef;   //60
    private int countProk;  //60
    private int countVetget;    //30 ต่อหน่วย
    private int countSeafood;   //60
    private int PriceCombo;
    Combo(String name, int Beef, int pork, int vetget, int seafood){
        this.nameCombo = name;
        this.contBeef = Beef;
        this.countProk = pork;
        this.countVetget = vetget;
        this.countSeafood = seafood;
        this.PriceCombo = (contBeef * 60) + (countProk * 60) + (countSeafood * 60) + (countVetget * 30);
    }
    static boolean isValid(int beef, int pork, int vetget, int seafood){
        //รวมกัน มากว่า = 4 ไม่เกิน 15
        int total = (beef + pork + vetget + seafood);
        if(total >= 4 && total <= 15){
            return true;
        }
        return false;
    }
    void printInfo(){
        System.out.println(this.nameCombo + " Beef " + this.contBeef + " Pork " + this.countProk + " Veg " + this.countVetget + " Seafood " + this.countSeafood + " Price " + this.PriceCombo);
    }
}
public class Chabubu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Combo combo[] = new Combo[50];
        int totalCombo = 0;
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int beef = sc.nextInt();
            int pork = sc.nextInt();
            int vetget = sc.nextInt();
            int seafood = sc.nextInt();
            if(Combo.isValid(beef, pork, vetget, seafood)){
                combo[totalCombo] = new Combo(name, beef, pork, vetget, seafood);
                totalCombo++;
                System.out.println("valid");
            }
            else{
                System.out.println("invalid");
            }
        }
        for (int i = 0; i < N; i++) {
            if(combo[i] != null){
                combo[i].printInfo();
            }
        }
        sc.close();
    }
}
