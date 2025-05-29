import java.util.Scanner;

public class populationdensity {
    static int density(int people, double area){
        double dense = 0;
        dense = (people / (area));
        long m = Math.round(dense);
        return ((int)m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int npeople = sc.nextInt();
        double area = sc.nextDouble();
        long d = density(npeople, area);
        System.out.println("population density is " + Math.round(d));
        sc.close();
    }
}
