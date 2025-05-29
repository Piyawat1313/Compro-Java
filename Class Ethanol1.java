import java.util.Scanner;
class Ethanol{
    int intense;
    int ethanolPack;
    int ethanolLeft;
    Ethanol(int intense, int ethanolPack){
        this.intense = intense;
        this.ethanolPack = ethanolPack;
        this.ethanolLeft = ethanolPack;
    }
    void used(int useEthanol){
        if(useEthanol > ethanolLeft) ethanolLeft = 0;
        else this.ethanolLeft = ethanolLeft - useEthanol;
    }
    void printInfo(){
        System.out.println("Ethanol " + this.intense + "% " + "(" + this.ethanolLeft + "ml./" + this.ethanolPack + "ml.)");
    }
}
public class Ethanol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intense = sc.nextInt();
        int pack = sc.nextInt();
        int use = sc.nextInt();
        Ethanol ethanol = new Ethanol(intense, pack);
        ethanol.used(use);
        ethanol.printInfo();
        sc.close();
    }
}
