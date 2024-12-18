import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index1 = 0; 
        int index2 = 0;
        for(int i = 1; i <= k; i++){
            index1 = sc.nextInt();
            index2 = sc.nextInt();
            if(index1 > 0 && index1 <= n){
                arr[index1] += index2;
                System.out.println(arr[index1]);
            }
            else if(index1 <= 0 || index1 > n){
                System.out.println("invalid...");
            }
        }
        int less_wall = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(arr[index1] < less_wall){
                System.out.print(i + " ");
            }
            else if(arr[index1] > less_wall){
                System.out.println("ready");
                break;
            }
        }
        sc.close();
    }
}
