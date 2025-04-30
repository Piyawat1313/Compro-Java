import java.util.Scanner;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int Intermax = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                if(arr[i] > max){
                    max = arr[i];
                }
                if(Intermax < max){
                    Intermax = arr[i];
                }
            }
            else if(arr[i] == 0){
                if(max == 0){

                }else{
                    System.out.print(max + " ");
                    max = 0;
                }
            }
        }
        System.out.println("\n" + Intermax);
        boolean found = true;
        for (int i = 0; i < n; i++) {
            if(arr[i] == Intermax){
                found = false;
            }
            if(arr[i] == 0){
                if(!found){
                    left = i - 1;
                    break;
                }
                else{
                    right = i + 1;
                }
            }
        }
        for (int i = right; i <= left; i++) {
                System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
