import java.util.Scanner;

public class Mi2NMi {
    double nmi;
    double mtonmi(double mi){
        return this.nmi = mi * 0.868976;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mi = sc.nextDouble();
        Mi2NMi M = new Mi2NMi();
        System.out.println(M.mtonmi(mi) + " " + "nmi");  
        sc.close();  
    }
}
