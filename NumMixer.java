import java.util.ArrayList;
import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        } 
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
            if(number > 0){
                for(int i = 0; i < n; i++){
                    arr.add(A[i]);
                    arr.add(B[n - 1 - i]);  //รูปแบบการแอดค่าอาเรย์ตัวสุดท้าย
                }
                for(int num : arr){
                    System.out.print(num + " ");
                }
            }
            else if(number <= 0){
                for(int i = 0; i < n; i++){
                    arr.add(B[n - 1 - i]);
                    arr.add(A[i]);
                }
                for(int num : arr){
                    System.out.print(num + " ");
                }
            }
        sc.close();
    }
}
