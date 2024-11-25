import java.util.Scanner;
public class AsteriskBurst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int Row = sc.nextInt();
        int Col = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= Row; i++){
            for(int j = 1; j <= Col; j++){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
