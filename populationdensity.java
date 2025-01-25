import java.util.Scanner;

public class populationdensity {
    int people;
    double area;
    public populationdensity(int people, double area){  
        this.people = people; 
        this.area = area;
    }
    public static long density(int people, double area){
        return Math.round(people / area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        double area = sc.nextDouble();
        long d = density(people, area);
        System.out.println("population density is "+ d);
        sc.close();
    }
}
