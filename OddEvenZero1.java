import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenZero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] number = new int[n];
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i < n; i++){
            number[i] = sc.nextInt();
            if(number[i] % 2 != 0 || number[i] == 0){
                odd.add(number[i]);
            }
            if(number[i] % 2 == 0 || number[i] == 0){
                even.add(number[i]);
            }
        }
        for(int i : odd){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int j : even){
            System.out.print(j + " ");
        }
    }
}
