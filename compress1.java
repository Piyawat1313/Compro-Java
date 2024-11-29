
import java.util.Scanner;

public class comprees1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Input  K:");
        int k = sc.nextInt();
        int number = 0;
        for(int i = 0; i < n; i++){
            number += arr[i];
            if(arr[i] == k){
                System.out.print(number - k + " " + k + " ");
                number = 0;
            }
        }
        System.out.print(number);
    }
}
