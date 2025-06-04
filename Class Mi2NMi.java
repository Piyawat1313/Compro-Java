import java.util.Scanner;

public class Mi2NMi {
    static double mi2nmi(double m){
        double miSea = m * 0.868976;
        return miSea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        System.out.println(mi2nmi(m) + " nmi");
        sc.close();
    }
}
