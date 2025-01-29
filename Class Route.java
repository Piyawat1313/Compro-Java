import java.util.Scanner;

class Route {
    int totalSa;
    String[] satanee;
    int [] km;
    public Route (String[] satanee, int[] km){
        this.satanee = satanee;
        this.km = km;
    }
    void getStopInfo(int number, int n, String[] satanee, int[]km){
        if(number < 1 || number > n){
            System.out.println("invalid number");
        }
        else {
            System.out.println(this.satanee[number - 1] + " " + this.km[number - 1]);
        }
    }
    
}
public class BusRoute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] satanee = new String[n];
        int[] km = new int[n];
        for(int i = 0; i < n; i++){
            satanee[i] = sc.next();
            km[i] = sc.nextInt();
        }
        Route  R = new Route(satanee, km);
        final int k = sc.nextInt();
        for(int i = 1; i <= k; i++){
            int number = sc.nextInt();
            R.getStopInfo(number, n, satanee, km);
        }
        sc.close();
    }
}
