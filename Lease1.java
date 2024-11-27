import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Input N:");
        int n = sc.nextInt();
        if(n > 100){
            return;
        }
        //System.out.print("Input Y:");
        int [] y = new int [n];
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        //System.out.print("Input Year:");
        int Year = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(y[i] == 0){
                System.out.print((Year - 1) + " ");
            }
            else{
                System.out.print((Year + y[i] - 1) + " ");
            }
        }
    }
}
