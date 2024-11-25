import java.util.Scanner;
public class Abs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number User:");
        int number = sc.nextInt();
        if(number < 0){
           Math.abs(number);
           System.out.println(Math.abs(number));        
        }
    }
}
