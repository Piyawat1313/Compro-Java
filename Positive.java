import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            System.out.print("Positive");
        }
        else if(x == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}
